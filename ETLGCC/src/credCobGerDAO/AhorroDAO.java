package credCobGerDAO;

import credCobGerClasses.Ahorro;
import credCobGerClasses.AhorroId;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;

public class AhorroDAO extends HibernateBasicDAOImpl<Ahorro, AhorroId> {

	private static final long serialVersionUID = 1L;
	
	public AhorroDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public Class<Ahorro> getClassTarget() {
		
		return Ahorro.class;
	}
}
