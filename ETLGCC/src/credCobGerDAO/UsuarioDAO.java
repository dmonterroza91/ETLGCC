package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.Usuario;

public class UsuarioDAO extends HibernateBasicDAOImpl<Usuario, String>{

	private static final long serialVersionUID = 1L;
	
	public UsuarioDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<Usuario> getClassTarget() {
		return Usuario.class;
	}

}
