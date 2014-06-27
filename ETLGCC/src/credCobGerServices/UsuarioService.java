package credCobGerServices;


import java.io.Serializable;
import java.util.List;

import credCobGerDAO.UsuarioDAO;
import credCobGerClasses.Usuario;
import persistence.HibernateUtilsCredCobGer;

import org.hibernate.Transaction;



/**
 * @author Diego
 * 
 */
public class UsuarioService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UsuarioDAO UsuarioDAO;

	public UsuarioService() {
		UsuarioDAO = new UsuarioDAO(HibernateUtilsCredCobGer.sessionFactory);
	}

	public void save(Usuario target) {
		Transaction trx = UsuarioDAO.getSession().beginTransaction();
		UsuarioDAO.save(target);
		trx.commit();
	}

	public void delete(String key) {
		Transaction trx = UsuarioDAO.getSession().beginTransaction();
		UsuarioDAO.delete(key);
		trx.commit();
	}

	public Usuario get(String key) {
		Transaction trx = UsuarioDAO.getSession().beginTransaction();
		Usuario b = UsuarioDAO.get(key);
		trx.commit();
		return b;
	}

	public List<Usuario> findAll() {
		Transaction trx = UsuarioDAO.getSession().beginTransaction();
		List<Usuario> b = UsuarioDAO.findAll();
		trx.commit();
		return b;
	}

	public List<Usuario> findByExample(Usuario filters) {
		Transaction trx = UsuarioDAO.getSession().beginTransaction();
		List<Usuario> b = UsuarioDAO.findByExample(filters);
		trx.commit();
		return b;
	}
}