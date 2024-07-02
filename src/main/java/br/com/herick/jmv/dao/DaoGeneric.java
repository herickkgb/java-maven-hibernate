package br.com.herick.jmv.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.herick.jmv.HibernateUtil;

public class DaoGeneric<E> {

	private EntityManager entityManager = HibernateUtil.getEntityManager();

	public void salvar(E entity) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(entity); 
		transaction.commit();
	}
}
