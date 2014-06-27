package persistence;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;

/**
 * Representa el acceso a la base de datos.
 * 
 * @author Diego
 * 
 * @param <T>
 *            Representa al objeto model de un registro de la base de datos.
 * @param <K>
 *            Representa al objeto de llave primaria del registro.
 * 
 */
public abstract class HibernateBasicDAOImpl<T, K extends Serializable>
		implements Serializable, HibernateBasicDAO<T, K> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SessionFactory sessionFactory;

	public HibernateBasicDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}


	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(T target) {
		getSession().save(target);
	}

	@Override
	public void update(T target) {
		getSession().update(target);
	}


	@Override
	public void delete(K key) {
		getSession().delete(get(key));
	}


	@Override
	@SuppressWarnings("unchecked")
	public T get(K key) {
		return (T) getSession().get(getClassTarget(), key);
	}


	@Override
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		Criteria criteria = getSession().createCriteria(getClassTarget());
		return criteria.list();
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}


	@Override
	@SuppressWarnings("unchecked")
	public List<T> findByExample(T filters) {
		Example filter = Example.create(filters).enableLike(MatchMode.ANYWHERE)
				.excludeNone().excludeZeroes().ignoreCase();
		Criteria criteria = getSession().createCriteria(getClassTarget());

		criteria.add(filter);
		return criteria.list();
	}

	public abstract Class<T> getClassTarget();
}