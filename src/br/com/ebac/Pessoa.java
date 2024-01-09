package br.com.ebac;

import java.util.Date;

/**
 * Classe de Pessoa
 * @author Augusto Silverio Soares *
 * @version 1.0.0
 */


public abstract class Pessoa {

    private String nome;
    private String sexo;

    /**
     * Retorna o nome da Pessoa
     * @return String
     */
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Seta o nome na classe
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }


}
