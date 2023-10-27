package com.projetobasico.model.dao;

import com.projetobasico.model.Pessoa;

public class PessoaJpaDao extends EntityJpaDao<Long, Pessoa> {
    public void salvar(Pessoa pessoa){
        try{
            begin();
            if (pessoa.getId() == 0){
                insert(pessoa);
            } else {
                update(pessoa);
            }
            commit();
        }catch(Exception e){
            e.printStackTrace();
            rollback();
        }
    }

}
