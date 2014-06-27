package persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * @author Diego
 * 
 */
public class HibernateUtilsCredCobGer {
	public static SessionFactory sessionFactory;

	static {
		Configuration cfg = new Configuration();
		cfg.configure("conexion/CredCobGer.cfg.xml");
		ServiceRegistryBuilder srb = new ServiceRegistryBuilder();
		srb.applySettings(cfg.getProperties());
		sessionFactory = cfg.buildSessionFactory(srb.buildServiceRegistry());
	}

	public HibernateUtilsCredCobGer() {
	}
}