package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.TipoUsuario;

public class TipoUsuarioDAO extends HibernateBasicDAOImpl<TipoUsuario, Integer>{

	private static final long serialVersionUID = 1L;
	
	public TipoUsuarioDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<TipoUsuario> getClassTarget() {
		return TipoUsuario.class;
	}

}
