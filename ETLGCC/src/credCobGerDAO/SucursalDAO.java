package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.Sucursal;

public class SucursalDAO extends HibernateBasicDAOImpl<Sucursal, Integer>{

	private static final long serialVersionUID = 1L;
	
	public SucursalDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

	@Override
	public Class<Sucursal> getClassTarget() {
		return Sucursal.class;
	}

}
