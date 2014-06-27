package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.Otorga;
import credCobGerClasses.OtorgaId;

public class OtorgaDAO extends HibernateBasicDAOImpl<Otorga, OtorgaId>{

	private static final long serialVersionUID = 1L;
	
	public OtorgaDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<Otorga> getClassTarget() {
		return Otorga.class;
	}

}
