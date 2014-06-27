package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.Asociado;

public class AsociadoDAO extends HibernateBasicDAOImpl<Asociado, String>{

	private static final long serialVersionUID = 1L;
	
	public AsociadoDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<Asociado> getClassTarget() {
		return Asociado.class;
	}

}
