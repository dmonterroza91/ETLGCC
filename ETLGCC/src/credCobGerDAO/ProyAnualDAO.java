package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.ProyAnual;
import credCobGerClasses.ProyAnualId;

public class ProyAnualDAO extends HibernateBasicDAOImpl<ProyAnual, ProyAnualId>{

	private static final long serialVersionUID = 1L;
	
	public ProyAnualDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<ProyAnual> getClassTarget() {
		return ProyAnual.class;
	}

}
