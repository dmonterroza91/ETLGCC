package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.AportacionDAO;
import credCobGerClasses.Aportacion;
import credCobGerClasses.AportacionId;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class AportacionService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AportacionDAO AportacionDAO;

	public AportacionService() {
		AportacionDAO = new AportacionDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(Aportacion target) {
		Transaction trx = AportacionDAO.getSession().beginTransaction();
		AportacionDAO.save(target);
		trx.commit();
	}

	public void delete(AportacionId key) {
		Transaction trx = AportacionDAO.getSession().beginTransaction();
		AportacionDAO.delete(key);
		trx.commit();
	}

	public Aportacion get(AportacionId key) {
		Transaction trx = AportacionDAO.getSession().beginTransaction();
		Aportacion b = AportacionDAO.get(key);
		trx.commit();
		return b;
	}

	public List<Aportacion> findAll() {
		Transaction trx = AportacionDAO.getSession().beginTransaction();
		List<Aportacion> b = AportacionDAO.findAll();
		trx.commit();
		return b;
	}

	public List<Aportacion> findByExample(Aportacion filters) {
		Transaction trx = AportacionDAO.getSession().beginTransaction();
		List<Aportacion> b = AportacionDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}