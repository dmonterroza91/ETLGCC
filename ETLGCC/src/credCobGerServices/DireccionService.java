package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.DireccionDAO;
import credCobGerClasses.Direccion;
import credCobGerClasses.DireccionId;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class DireccionService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DireccionDAO DireccionDAO;

	public DireccionService() {
		DireccionDAO = new DireccionDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(Direccion target) {
		Transaction trx = DireccionDAO.getSession().beginTransaction();
		DireccionDAO.save(target);
		trx.commit();
	}

	public void delete(DireccionId key) {
		Transaction trx = DireccionDAO.getSession().beginTransaction();
		DireccionDAO.delete(key);
		trx.commit();
	}

	public Direccion get(DireccionId key) {
		Transaction trx = DireccionDAO.getSession().beginTransaction();
		Direccion b = DireccionDAO.get(key);
		trx.commit();
		return b;
	}

	public List<Direccion> findAll() {
		Transaction trx = DireccionDAO.getSession().beginTransaction();
		List<Direccion> b = DireccionDAO.findAll();
		trx.commit();
		return b;
	}

	public List<Direccion> findByExample(Direccion filters) {
		Transaction trx = DireccionDAO.getSession().beginTransaction();
		List<Direccion> b = DireccionDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}