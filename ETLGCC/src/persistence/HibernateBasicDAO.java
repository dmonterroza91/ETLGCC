package persistence;


import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Estblece todos los metodos que se implementaran en HibernateBasicDAOImpl
 * 
 * @author Diego
 * 
 * @see HibernateBasicDAOImpl
 * 
 */
public interface HibernateBasicDAO<T, K extends Serializable> {

	SessionFactory getSessionFactory();

	void save(T target);
	
	void update(T target);

	void delete(K key);

	T get(K key);

	List<T> findAll();

	List<T> findByExample(T filters);

	Session getSession();
}