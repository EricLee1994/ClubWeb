package dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import table.Clubcontact;

/**
 * A data access object (DAO) providing persistence and search support for
 * Clubcontact entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see table.Clubcontact
 * @author MyEclipse Persistence Tools
 */

public class ClubcontactDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ClubcontactDAO.class);
	// property constants
	public static final String CLUBID = "clubid";
	public static final String UID = "uid";

	public void save(Clubcontact transientInstance) {
		log.debug("saving Clubcontact instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Clubcontact persistentInstance) {
		log.debug("deleting Clubcontact instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Clubcontact findById(java.lang.Integer id) {
		log.debug("getting Clubcontact instance with id: " + id);
		try {
			Clubcontact instance = (Clubcontact) getHibernateTemplate().get(
					Clubcontact.class, id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Clubcontact instance) {
		log.debug("finding Clubcontact instance by example");
		try {
			List results = getSession().createCriteria(Clubcontact.class)
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Clubcontact instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Clubcontact as model where model." 
					+ propertyName + " = '" + value + "'";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	//根据社团id和学员id获取映射表
	public List<Clubcontact> findByClubidAndUid(String Clubid, String Uid) {
		log.debug("finding Clubcontact instance with Clubid: " + Clubid
				+ ", Uid: " + Uid);
		try {
			String queryString = "from Clubcontact as model where model.clubid='" 
					+ Clubid + "' and   model.uid ='" + Uid + "'";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find by Clubid and Uid failed", re);
			throw re;
		}
	}
	
	//根据学员id获取已经批准的社团
	public List<Clubcontact> findByUserIdActivite(String UserId) {
		log.debug("finding Clubcontact instance");
		try {
			String queryString = "from Clubcontact as model where model.uid='" 
					+ UserId + "' and  flag = 1";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find by Clubid and Uid failed", re);
			throw re;
		}
	}
	
	//根据学员id获取已经批准的社团
	public List<Clubcontact> findByUserIdNotActivite(String UserId) {
		log.debug("finding Clubcontact instance");
		try {
			String queryString = "from Clubcontact as model where model.uid='" 
					+ UserId + "' and  flag = 0";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find by Clubid and Uid failed", re);
			throw re;
		}
	}
	
	public List findByClubid(Object clubid) {
		return findByProperty(CLUBID, clubid);
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List<Clubcontact> findAll(String clubid) {
		log.debug("finding all Clubcontact instances");
		try {
			String queryString = "from Clubcontact where clubid = "+clubid;
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public List<Clubcontact> findAllActivated(String clubid) {
		log.debug("finding all Clubcontact instances");
		try {
			String queryString = "from Clubcontact where flag = 1 and clubid = "+clubid;
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public List<Clubcontact> findAllNotActivated(String clubid) {
		log.debug("finding all Clubcontact instances");
		try {
			String queryString = "from Clubcontact where flag = 0 and clubid = "+clubid;
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	public Clubcontact merge(Clubcontact detachedInstance) {
		log.debug("merging Clubcontact instance");
		try {
			Clubcontact result = (Clubcontact) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Clubcontact instance) {
		log.debug("attaching dirty Clubcontact instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Clubcontact instance) {
		log.debug("attaching clean Clubcontact instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}