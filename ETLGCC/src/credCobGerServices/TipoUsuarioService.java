package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.TipoUsuarioDAO;
import credCobGerClasses.TipoUsuario;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class TipoUsuarioService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TipoUsuarioDAO TipoUsuarioDAO;

	public TipoUsuarioService() {
		TipoUsuarioDAO = new TipoUsuarioDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(TipoUsuario target) {
		Transaction trx = TipoUsuarioDAO.getSession().beginTransaction();
		TipoUsuarioDAO.save(target);
		trx.commit();
	}

	public void delete(Integer key) {
		Transaction trx = TipoUsuarioDAO.getSession().beginTransaction();
		TipoUsuarioDAO.delete(key);
		trx.commit();
	}

	public TipoUsuario get(Integer key) {
		Transaction trx = TipoUsuarioDAO.getSession().beginTransaction();
		TipoUsuario b = TipoUsuarioDAO.get(key);
		trx.commit();
		return b;
	}

	public List<TipoUsuario> findAll() {
		Transaction trx = TipoUsuarioDAO.getSession().beginTransaction();
		List<TipoUsuario> b = TipoUsuarioDAO.findAll();
		trx.commit();
		return b;
	}

	public List<TipoUsuario> findByExample(TipoUsuario filters) {
		Transaction trx = TipoUsuarioDAO.getSession().beginTransaction();
		List<TipoUsuario> b = TipoUsuarioDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}