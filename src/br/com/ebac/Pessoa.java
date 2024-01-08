package br.com.ebac;

import java.util.Date;

/**
 * Classe de Pessoa
 * @author Augusto Silverio Soares *
 * @version 1.0.0
 */


public class Pessoa {

    private String nome;
    private Date dataNascimento;
    private String cpf;

    /**
     * Retorna o nome da Pessoa
     * @return String
     */
    public String getNome() {
        return nome;
    }

    /**
     * Seta o nome na classe
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a data (util.date)
     * @return Date
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * seta a data de nascimento (util.date)
     * @param dataNascimento
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
