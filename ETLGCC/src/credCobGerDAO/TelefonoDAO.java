package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.Telefono;
import credCobGerClasses.TelefonoId;

public class TelefonoDAO extends HibernateBasicDAOImpl<Telefono, TelefonoId>{

	private static final long serialVersionUID = 1L;
	
	public TelefonoDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<Telefono> getClassTarget() {
		return Telefono.class;
	}

}
