package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.LineaCreditoDAO;
import credCobGerClasses.LineaCredito;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class LineaCreditoService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LineaCreditoDAO LineaCreditoDAO;

	public LineaCreditoService() {
		LineaCreditoDAO = new LineaCreditoDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(LineaCredito target) {
		Transaction trx = LineaCreditoDAO.getSession().beginTransaction();
		LineaCreditoDAO.save(target);
		trx.commit();
	}

	public void delete(Integer key) {
		Transaction trx = LineaCreditoDAO.getSession().beginTransaction();
		LineaCreditoDAO.delete(key);
		trx.commit();
	}

	public LineaCredito get(Integer key) {
		Transaction trx = LineaCreditoDAO.getSession().beginTransaction();
		LineaCredito b = LineaCreditoDAO.get(key);
		trx.commit();
		return b;
	}

	public List<LineaCredito> findAll() {
		Transaction trx = LineaCreditoDAO.getSession().beginTransaction();
		List<LineaCredito> b = LineaCreditoDAO.findAll();
		trx.commit();
		return b;
	}

	public List<LineaCredito> findByExample(LineaCredito filters) {
		Transaction trx = LineaCreditoDAO.getSession().beginTransaction();
		List<LineaCredito> b = LineaCreditoDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}