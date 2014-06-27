package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.SucursalDAO;
import credCobGerClasses.Sucursal;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class SucursalService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SucursalDAO SucursalDAO;

	public SucursalService() {
		SucursalDAO = new SucursalDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(Sucursal target) {
		Transaction trx = SucursalDAO.getSession().beginTransaction();
		SucursalDAO.save(target);
		trx.commit();
	}

	public void delete(Integer key) {
		Transaction trx = SucursalDAO.getSession().beginTransaction();
		SucursalDAO.delete(key);
		trx.commit();
	}

	public Sucursal get(Integer key) {
		Transaction trx = SucursalDAO.getSession().beginTransaction();
		Sucursal b = SucursalDAO.get(key);
		trx.commit();
		return b;
	}

	public List<Sucursal> findAll() {
		Transaction trx = SucursalDAO.getSession().beginTransaction();
		List<Sucursal> b = SucursalDAO.findAll();
		trx.commit();
		return b;
	}

	public List<Sucursal> findByExample(Sucursal filters) {
		Transaction trx = SucursalDAO.getSession().beginTransaction();
		List<Sucursal> b = SucursalDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}