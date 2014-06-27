package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.OtorgaDAO;
import credCobGerClasses.Otorga;
import credCobGerClasses.OtorgaId;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class OtorgaService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private OtorgaDAO OtorgaDAO;

	public OtorgaService() {
		OtorgaDAO = new OtorgaDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(Otorga target) {
		Transaction trx = OtorgaDAO.getSession().beginTransaction();
		OtorgaDAO.save(target);
		trx.commit();
	}

	public void delete(OtorgaId key) {
		Transaction trx = OtorgaDAO.getSession().beginTransaction();
		OtorgaDAO.delete(key);
		trx.commit();
	}

	public Otorga get(OtorgaId key) {
		Transaction trx = OtorgaDAO.getSession().beginTransaction();
		Otorga b = OtorgaDAO.get(key);
		trx.commit();
		return b;
	}

	public List<Otorga> findAll() {
		Transaction trx = OtorgaDAO.getSession().beginTransaction();
		List<Otorga> b = OtorgaDAO.findAll();
		trx.commit();
		return b;
	}

	public List<Otorga> findByExample(Otorga filters) {
		Transaction trx = OtorgaDAO.getSession().beginTransaction();
		List<Otorga> b = OtorgaDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}