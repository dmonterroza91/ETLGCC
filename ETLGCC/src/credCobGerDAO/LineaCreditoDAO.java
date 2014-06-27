package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.LineaCredito;


public class LineaCreditoDAO extends HibernateBasicDAOImpl<LineaCredito, Integer>{

	private static final long serialVersionUID = 1L;
	
	public LineaCreditoDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<LineaCredito> getClassTarget() {
		return LineaCredito.class;
	}

}
