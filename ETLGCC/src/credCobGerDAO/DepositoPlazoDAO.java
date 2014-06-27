package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.DepositoPlazo;
import credCobGerClasses.DepositoPlazoId;

public class DepositoPlazoDAO extends HibernateBasicDAOImpl<DepositoPlazo, DepositoPlazoId>{

	private static final long serialVersionUID = 1L;
	
	public DepositoPlazoDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<DepositoPlazo> getClassTarget() {
		return DepositoPlazo.class;
	}

}
