package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.TelefonoDAO;
import credCobGerClasses.Telefono;
import credCobGerClasses.TelefonoId;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class TelefonoService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TelefonoDAO TelefonoDAO;

	public TelefonoService() {
		TelefonoDAO = new TelefonoDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(Telefono target) {
		Transaction trx = TelefonoDAO.getSession().beginTransaction();
		TelefonoDAO.save(target);
		trx.commit();
	}

	public void delete(TelefonoId key) {
		Transaction trx = TelefonoDAO.getSession().beginTransaction();
		TelefonoDAO.delete(key);
		trx.commit();
	}

	public Telefono get(TelefonoId key) {
		Transaction trx = TelefonoDAO.getSession().beginTransaction();
		Telefono b = TelefonoDAO.get(key);
		trx.commit();
		return b;
	}

	public List<Telefono> findAll() {
		Transaction trx = TelefonoDAO.getSession().beginTransaction();
		List<Telefono> b = TelefonoDAO.findAll();
		trx.commit();
		return b;
	}

	public List<Telefono> findByExample(Telefono filters) {
		Transaction trx = TelefonoDAO.getSession().beginTransaction();
		List<Telefono> b = TelefonoDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}