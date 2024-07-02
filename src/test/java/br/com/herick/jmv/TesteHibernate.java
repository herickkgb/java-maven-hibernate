package br.com.herick.jmv;

import org.junit.Test;

import br.com.herick.jmv.HibernateUtil;

public class TesteHibernate {
	
	@Test
	public void testeHibernateUtil() {
		HibernateUtil.getEntityManager();
	}
}
