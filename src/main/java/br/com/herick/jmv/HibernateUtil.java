package br.com.herick.jmv;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	public static EntityManagerFactory factory = null;

	static {
		init();
	}

	private static void init() {
		try {
			if (factory == null) {
				factory = Persistence.createEntityManagerFactory("java-maven-hibernate");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager(); // prover a parte de persistencia
	}

}
