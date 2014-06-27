package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.ProyMens;
import credCobGerClasses.ProyMensId;

public class ProyMensDAO extends HibernateBasicDAOImpl<ProyMens, ProyMensId>{

	private static final long serialVersionUID = 1L;
	
	public ProyMensDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<ProyMens> getClassTarget() {
		return ProyMens.class;
	}

}
