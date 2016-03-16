package dao;


import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import table.Club;


/**
 * A data access object (DAO) providing persistence and search support for Club
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see table.Club
 * @author MyEclipse Persistence Tools
 */

public class ClubDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ClubDAO.class);
	// property constants
	public static final String CLUBNAME = "clubname";
	public static final String CONTENT = "content";
	public static final String CHRAGEID = "chrageid";
	public static final String COMMENT = "comment";
	public static final String FLAG = "flag";

	public void save(Club transientInstance) {
		log.debug("saving Club instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Club persistentInstance) {
		log.debug("deleting Club instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Club findById(java.lang.Integer id) {
		log.debug("getting Club instance with id: " + id);
		try {
			Club instance = (Club) getHibernateTemplate().get(Club.class, id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Club instance) {
		log.debug("finding Club instance by example");
		try {
			List results = getSession().createCriteria(Club.class).add(
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
		log.debug("finding Club instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Club as model where model." 
					+ propertyName + " = '" + value + "'";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByClubname(Object clubname) {
		return findByProperty(CLUBNAME, clubname);
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List findByChrageid(Object chrageid) {
		return findByProperty(CHRAGEID, chrageid);
	}

	public List findByComment(Object comment) {
		return findByProperty(COMMENT, comment);
	}

	public List findByFlag(Object flag) {
		return findByProperty(FLAG, flag);
	}

	public List findAll() {
		log.debug("finding all Club instances");
		try {
			String queryString = "from Club";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	public List listAllClubActivated() {
		log.debug("finding all Club instances");
		try {
			String queryString = "from Club where flag = 1";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	public Club merge(Club detachedInstance) {
		log.debug("merging Club instance");
		try {
			Club result = (Club) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Club instance) {
		log.debug("attaching dirty Club instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Club instance) {
		log.debug("attaching clean Club instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}