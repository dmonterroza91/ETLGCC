package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.ProyAnualDAO;
import credCobGerClasses.ProyAnual;
import credCobGerClasses.ProyAnualId;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class ProyAnualService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProyAnualDAO ProyAnualDAO;

	public ProyAnualService() {
		ProyAnualDAO = new ProyAnualDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(ProyAnual target) {
		Transaction trx = ProyAnualDAO.getSession().beginTransaction();
		ProyAnualDAO.save(target);
		trx.commit();
	}

	public void delete(ProyAnualId key) {
		Transaction trx = ProyAnualDAO.getSession().beginTransaction();
		ProyAnualDAO.delete(key);
		trx.commit();
	}

	public ProyAnual get(ProyAnualId key) {
		Transaction trx = ProyAnualDAO.getSession().beginTransaction();
		ProyAnual b = ProyAnualDAO.get(key);
		trx.commit();
		return b;
	}

	public List<ProyAnual> findAll() {
		Transaction trx = ProyAnualDAO.getSession().beginTransaction();
		List<ProyAnual> b = ProyAnualDAO.findAll();
		trx.commit();
		return b;
	}

	public List<ProyAnual> findByExample(ProyAnual filters) {
		Transaction trx = ProyAnualDAO.getSession().beginTransaction();
		List<ProyAnual> b = ProyAnualDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}