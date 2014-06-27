package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.ProyMensDAO;
import credCobGerClasses.ProyMens;
import credCobGerClasses.ProyMensId;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class ProyMensService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProyMensDAO ProyMensDAO;

	public ProyMensService() {
		ProyMensDAO = new ProyMensDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(ProyMens target) {
		Transaction trx = ProyMensDAO.getSession().beginTransaction();
		ProyMensDAO.save(target);
		trx.commit();
	}

	public void delete(ProyMensId key) {
		Transaction trx = ProyMensDAO.getSession().beginTransaction();
		ProyMensDAO.delete(key);
		trx.commit();
	}

	public ProyMens get(ProyMensId key) {
		Transaction trx = ProyMensDAO.getSession().beginTransaction();
		ProyMens b = ProyMensDAO.get(key);
		trx.commit();
		return b;
	}

	public List<ProyMens> findAll() {
		Transaction trx = ProyMensDAO.getSession().beginTransaction();
		List<ProyMens> b = ProyMensDAO.findAll();
		trx.commit();
		return b;
	}

	public List<ProyMens> findByExample(ProyMens filters) {
		Transaction trx = ProyMensDAO.getSession().beginTransaction();
		List<ProyMens> b = ProyMensDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}