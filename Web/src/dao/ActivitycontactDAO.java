package dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import table.Activitycontact;
/**
 * A data access object (DAO) providing persistence and search support for
 * Activitycontact entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see table.Activitycontact
 * @author MyEclipse Persistence Tools
 */

public class ActivitycontactDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ActivitycontactDAO.class);
	// property constants
	public static final String ACTID = "actid";
	public static final String UID = "uid";

	public void save(Activitycontact transientInstance) {
		log.debug("saving Activitycontact instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Activitycontact persistentInstance) {
		log.debug("deleting Activitycontact instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Activitycontact findById(java.lang.Integer id) {
		log.debug("getting Activitycontact instance with id: " + id);
		try {
			Activitycontact instance = (Activitycontact) getHibernateTemplate().get(
					Activitycontact.class, id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Activitycontact instance) {
		log.debug("finding Activitycontact instance by example");
		try {
			List results = getSession()
					.createCriteria(Activitycontact.class).add(
							Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Activitycontact instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Activitycontact as model where model." 
					+ propertyName + " = '" + value + "'";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByActid(Object actid) {
		return findByProperty(ACTID, actid);
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findAll() {
		log.debug("finding all Activitycontact instances");
		try {
			String queryString = "from Activitycontact";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Activitycontact merge(Activitycontact detachedInstance) {
		log.debug("merging Activitycontact instance");
		try {
			Activitycontact result = (Activitycontact) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Activitycontact instance) {
		log.debug("attaching dirty Activitycontact instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Activitycontact instance) {
		log.debug("attaching clean Activitycontact instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}