package credCobGerDAO;

import org.hibernate.SessionFactory;

import persistence.HibernateBasicDAOImpl;
import credCobGerClasses.BitacoraUsu;

public class BitacoraUsuDAO extends HibernateBasicDAOImpl<BitacoraUsu, Integer>{

	private static final long serialVersionUID = 1L;
	
	public BitacoraUsuDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public Class<BitacoraUsu> getClassTarget() {
		return BitacoraUsu.class;
	}

}
