package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.CreditoDAO;
import credCobGerClasses.Credito;
import credCobGerClasses.CreditoId;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class CreditoService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CreditoDAO CreditoDAO;

	public CreditoService() {
		CreditoDAO = new CreditoDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(Credito target) {
		Transaction trx = CreditoDAO.getSession().beginTransaction();
		CreditoDAO.save(target);
		trx.commit();
	}

	public void delete(CreditoId key) {
		Transaction trx = CreditoDAO.getSession().beginTransaction();
		CreditoDAO.delete(key);
		trx.commit();
	}

	public Credito get(CreditoId key) {
		Transaction trx = CreditoDAO.getSession().beginTransaction();
		Credito b = CreditoDAO.get(key);
		trx.commit();
		return b;
	}

	public List<Credito> findAll() {
		Transaction trx = CreditoDAO.getSession().beginTransaction();
		List<Credito> b = CreditoDAO.findAll();
		trx.commit();
		return b;
	}

	public List<Credito> findByExample(Credito filters) {
		Transaction trx = CreditoDAO.getSession().beginTransaction();
		List<Credito> b = CreditoDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}