package dao;

import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import table.Activity;

/**
 * A data access object (DAO) providing persistence and search support for
 * Activity entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see table.Activity
 * @author MyEclipse Persistence Tools
 */

public class ActivityDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ActivityDAO.class);
	// property constants
	public static final String CLUBID = "clubid";
	public static final String ACTNAME = "actname";
	public static final String ACTINFO = "actinfo";
	public static final String FLAG = "flag";

	public void save(Activity transientInstance) {
		log.debug("saving Activity instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Activity persistentInstance) {
		log.debug("deleting Activity instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Activity findById(java.lang.Integer id) {
		log.debug("getting Activity instance with id: " + id);
		try {
			Activity instance = (Activity) getHibernateTemplate().get(Activity.class,
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Activity instance) {
		log.debug("finding Activity instance by example");
		try {
			List results = getSession().createCriteria(Activity.class).add(
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
		log.debug("finding Activity instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Activity as model where model." 
					+ propertyName + " = '" + value + "'";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByClubid(Object clubid) {
		return findByProperty(CLUBID, clubid);
	}

	public List findByActname(Object actname) {
		return findByProperty(ACTNAME, actname);
	}

	public List findByActinfo(Object actinfo) {
		return findByProperty(ACTINFO, actinfo);
	}

	public List findByFlag(Object flag) {
		return findByProperty(FLAG, flag);
	}

	public List findAll() {
		log.debug("finding all Activity instances");
		try {
			String queryString = "from Activity";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Activity merge(Activity detachedInstance) {
		log.debug("merging Activity instance");
		try {
			Activity result = (Activity) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Activity instance) {
		log.debug("attaching dirty Activity instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Activity instance) {
		log.debug("attaching clean Activity instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}