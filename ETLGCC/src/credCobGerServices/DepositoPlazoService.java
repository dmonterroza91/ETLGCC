package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.DepositoPlazoDAO;
import credCobGerClasses.DepositoPlazo;
import credCobGerClasses.DepositoPlazoId;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class DepositoPlazoService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DepositoPlazoDAO DepositoPlazoDAO;

	public DepositoPlazoService() {
		DepositoPlazoDAO = new DepositoPlazoDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(DepositoPlazo target) {
		Transaction trx = DepositoPlazoDAO.getSession().beginTransaction();
		DepositoPlazoDAO.save(target);
		trx.commit();
	}

	public void delete(DepositoPlazoId key) {
		Transaction trx = DepositoPlazoDAO.getSession().beginTransaction();
		DepositoPlazoDAO.delete(key);
		trx.commit();
	}

	public DepositoPlazo get(DepositoPlazoId key) {
		Transaction trx = DepositoPlazoDAO.getSession().beginTransaction();
		DepositoPlazo b = DepositoPlazoDAO.get(key);
		trx.commit();
		return b;
	}

	public List<DepositoPlazo> findAll() {
		Transaction trx = DepositoPlazoDAO.getSession().beginTransaction();
		List<DepositoPlazo> b = DepositoPlazoDAO.findAll();
		trx.commit();
		return b;
	}

	public List<DepositoPlazo> findByExample(DepositoPlazo filters) {
		Transaction trx = DepositoPlazoDAO.getSession().beginTransaction();
		List<DepositoPlazo> b = DepositoPlazoDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}