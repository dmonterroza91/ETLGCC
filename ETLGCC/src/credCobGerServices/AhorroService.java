package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.AhorroDAO;
import credCobGerClasses.Ahorro;
import credCobGerClasses.AhorroId;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class AhorroService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AhorroDAO AhorroDAO;

	public AhorroService() {
		AhorroDAO = new AhorroDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(Ahorro target) {
		Transaction trx = AhorroDAO.getSession().beginTransaction();
		AhorroDAO.save(target);
		trx.commit();
	}

	public void delete(AhorroId key) {
		Transaction trx = AhorroDAO.getSession().beginTransaction();
		AhorroDAO.delete(key);
		trx.commit();
	}

	public Ahorro get(AhorroId key) {
		Transaction trx = AhorroDAO.getSession().beginTransaction();
		Ahorro b = AhorroDAO.get(key);
		trx.commit();
		return b;
	}

	public List<Ahorro> findAll() {
		Transaction trx = AhorroDAO.getSession().beginTransaction();
		List<Ahorro> b = AhorroDAO.findAll();
		trx.commit();
		return b;
	}

	public List<Ahorro> findByExample(Ahorro filters) {
		Transaction trx = AhorroDAO.getSession().beginTransaction();
		List<Ahorro> b = AhorroDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}