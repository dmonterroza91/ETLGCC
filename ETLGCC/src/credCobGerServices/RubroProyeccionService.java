package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.RubroProyeccionDAO;
import credCobGerClasses.RubroProyeccion;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class RubroProyeccionService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private RubroProyeccionDAO RubroProyeccionDAO;

	public RubroProyeccionService() {
		RubroProyeccionDAO = new RubroProyeccionDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(RubroProyeccion target) {
		Transaction trx = RubroProyeccionDAO.getSession().beginTransaction();
		RubroProyeccionDAO.save(target);
		trx.commit();
	}

	public void delete(String key) {
		Transaction trx = RubroProyeccionDAO.getSession().beginTransaction();
		RubroProyeccionDAO.delete(key);
		trx.commit();
	}

	public RubroProyeccion get(String key) {
		Transaction trx = RubroProyeccionDAO.getSession().beginTransaction();
		RubroProyeccion b = RubroProyeccionDAO.get(key);
		trx.commit();
		return b;
	}

	public List<RubroProyeccion> findAll() {
		Transaction trx = RubroProyeccionDAO.getSession().beginTransaction();
		List<RubroProyeccion> b = RubroProyeccionDAO.findAll();
		trx.commit();
		return b;
	}

	public List<RubroProyeccion> findByExample(RubroProyeccion filters) {
		Transaction trx = RubroProyeccionDAO.getSession().beginTransaction();
		List<RubroProyeccion> b = RubroProyeccionDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}