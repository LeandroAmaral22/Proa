package com.example.demo.modelo;

import javax.persistence.*;
import java.util.UUID;

/*
As entidades são nossas tabelas no banco de dados, chamadas tambem de objetos, tudo que tem aqui é
criado da mesma forma em nosso banco.
 */

/*
OS CONCEITOS DE GETTERS E SETTERS SÃO DIFICIES DE ENTENDER CASO TENHA DUVIDA BASTA PESQUISAR
 */

@Entity //Mosta ao SPRING que é uma tabela
@Table(schema = "tb_aluno") //Da nome a uma tabela ou utiliza uma table existente, caso seja existente todos os campos
                            //devem ser identicos (classe e tabela)
public class Aluno {

    @Id //NECESSARIO MARCAR COMO ID (CHAVE PRIMARIA)
    @GeneratedValue(strategy = GenerationType.AUTO) //GERADOR AUTOMATICO DE ID
    private UUID id;

    private String nome;

    private String sobrenome;

    private String cpf;

    private String turma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
