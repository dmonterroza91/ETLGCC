package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.AsociadoDAO;
import credCobGerClasses.Asociado;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class AsociadoService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AsociadoDAO AsociadoDAO;

	public AsociadoService() {
		AsociadoDAO = new AsociadoDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(Asociado target) {
		Transaction trx = AsociadoDAO.getSession().beginTransaction();
		AsociadoDAO.save(target);
		trx.commit();
	}

	public void delete(String key) {
		Transaction trx = AsociadoDAO.getSession().beginTransaction();
		AsociadoDAO.delete(key);
		trx.commit();
	}

	public Asociado get(String key) {
		Transaction trx = AsociadoDAO.getSession().beginTransaction();
		Asociado b = AsociadoDAO.get(key);
		trx.commit();
		return b;
	}

	public List<Asociado> findAll() {
		Transaction trx = AsociadoDAO.getSession().beginTransaction();
		List<Asociado> b = AsociadoDAO.findAll();
		trx.commit();
		return b;
	}

	public List<Asociado> findByExample(Asociado filters) {
		Transaction trx = AsociadoDAO.getSession().beginTransaction();
		List<Asociado> b = AsociadoDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}