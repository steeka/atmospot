package com.steeka.atmospot.persistence;

// Generated Mar 1, 2017 10:40:13 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Temperature.
 * @see com.steeka.atmospot.persistence.Temperature
 * @author Hibernate Tools
 */
@Stateless
public class TemperatureHome {

	private static final Log log = LogFactory.getLog(TemperatureHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Temperature transientInstance) {
		log.debug("persisting Temperature instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Temperature persistentInstance) {
		log.debug("removing Temperature instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Temperature merge(Temperature detachedInstance) {
		log.debug("merging Temperature instance");
		try {
			Temperature result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Temperature findById(long id) {
		log.debug("getting Temperature instance with id: " + id);
		try {
			Temperature instance = entityManager.find(Temperature.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
