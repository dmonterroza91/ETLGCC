package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.Direccion;
import credCobGerClasses.DireccionId;

public class DireccionDAO extends HibernateBasicDAOImpl<Direccion, DireccionId>{

	private static final long serialVersionUID = 1L;
	
	public DireccionDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<Direccion> getClassTarget() {
		return Direccion.class;
	}

}
