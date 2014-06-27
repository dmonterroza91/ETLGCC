package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.Aportacion;
import credCobGerClasses.AportacionId;

public class AportacionDAO extends HibernateBasicDAOImpl<Aportacion, AportacionId>{

	private static final long serialVersionUID = 1L;
	
	public AportacionDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<Aportacion> getClassTarget() {
		return Aportacion.class;
	}

}
