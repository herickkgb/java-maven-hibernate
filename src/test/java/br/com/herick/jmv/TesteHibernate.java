package br.com.herick.jmv;

import org.junit.Test;
import br.com.herick.jmv.dao.DaoGeneric;
import br.com.herick.jmv.model.UsuarioPessoa;

public class TesteHibernate {

    @Test
    public void testeHibernateUtil() {
        DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<>();

        UsuarioPessoa pessoa = new UsuarioPessoa(1L, "testeNome", "Alves", "teste01@gmail.com", "login", "123");
        
        daoGeneric.salvar(pessoa);
    }
}
