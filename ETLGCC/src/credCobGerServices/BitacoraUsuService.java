package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.BitacoraUsuDAO;
import credCobGerClasses.BitacoraUsu;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class BitacoraUsuService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BitacoraUsuDAO BitacoraUsuDAO;

	public BitacoraUsuService() {
		BitacoraUsuDAO = new BitacoraUsuDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(BitacoraUsu target) {
		Transaction trx = BitacoraUsuDAO.getSession().beginTransaction();
		BitacoraUsuDAO.save(target);
		trx.commit();
	}

	public void delete(Integer key) {
		Transaction trx = BitacoraUsuDAO.getSession().beginTransaction();
		BitacoraUsuDAO.delete(key);
		trx.commit();
	}

	public BitacoraUsu get(Integer key) {
		Transaction trx = BitacoraUsuDAO.getSession().beginTransaction();
		BitacoraUsu b = BitacoraUsuDAO.get(key);
		trx.commit();
		return b;
	}

	public List<BitacoraUsu> findAll() {
		Transaction trx = BitacoraUsuDAO.getSession().beginTransaction();
		List<BitacoraUsu> b = BitacoraUsuDAO.findAll();
		trx.commit();
		return b;
	}

	public List<BitacoraUsu> findByExample(BitacoraUsu filters) {
		Transaction trx = BitacoraUsuDAO.getSession().beginTransaction();
		List<BitacoraUsu> b = BitacoraUsuDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}