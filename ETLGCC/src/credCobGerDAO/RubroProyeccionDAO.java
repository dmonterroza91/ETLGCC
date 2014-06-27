package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.RubroProyeccion;

public class RubroProyeccionDAO extends HibernateBasicDAOImpl<RubroProyeccion, String>{

	private static final long serialVersionUID = 1L;
	
	public RubroProyeccionDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<RubroProyeccion> getClassTarget() {
		return RubroProyeccion.class;
	}

}
