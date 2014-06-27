package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.Credito;
import credCobGerClasses.CreditoId;

public class CreditoDAO extends HibernateBasicDAOImpl<Credito, CreditoId>{

	private static final long serialVersionUID = 1L;
	
	public CreditoDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<Credito> getClassTarget() {
		return Credito.class;
	}

}
