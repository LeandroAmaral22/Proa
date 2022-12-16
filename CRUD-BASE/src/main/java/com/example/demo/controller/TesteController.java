package com.example.demo.controller;

import com.example.demo.repository.AlunoRepository;
import com.example.demo.modelo.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Marca como um controlador REST ou como uma API
@RequestMapping("/oi") //URL base desse controlador
public class TesteController {

      /*
        GetMapping - trazer dados do banco
        PostMapping - enviar dados para o banco
        DeleteMapping - apagar dados do banco
        PutMapping - atualiza dados do banco
     */


    @Autowired //Instancia um novo Objeto esse em especifico conecta com o Banco de dados
    AlunoRepository alunoBd;


    @PostMapping("/salva") // RESPONSAVEL POR SALVAR FDOS NO BANCO
    public String salva(@RequestBody Aluno aluno){

        alunoBd.save(aluno);
        return "oi " + aluno.getNome();
    }

    @GetMapping("/todos")// MOSTRA TODOS OS DADOS DO BANCO
    public List<Aluno> todosAlunos(){
        return alunoBd.findAll();
    }

    @GetMapping("/nome/{nome}") // MOSTRA OS DADOS COM BASE NO NOME, NÃO ESQUEÇAM O GET
    public Aluno buscaPorNome(@PathVariable String nome) {
        return alunoBd.findAlunoByNome(nome).get();
    }

    @DeleteMapping("/apagar/nome/{nome}") // APAGA UM DADO COM BASE NO NOME, NÃO ESQUEÇAM O GET
    public String deletaPorNome(@PathVariable String nome) {

        Aluno aluno = alunoBd.findAlunoByNome(nome).get();

        alunoBd.delete(aluno);

        return "Apagou";
    }

    @PutMapping("/atualizar/nome/{nome}") // ATUALIZA COM BASE NO NOME, NÃO ESQUEÇAM O GET
    public Aluno atualizaPorNome(@PathVariable String nome, @RequestBody Aluno alunoUsuario) {

        Aluno aluno = alunoBd.findAlunoByNome(nome).get();

        aluno.setNome(alunoUsuario.getNome());
        aluno.setSobrenome(alunoUsuario.getSobrenome());
        aluno.setCpf(alunoUsuario.getCpf());
        aluno.setTurma(alunoUsuario.getTurma());

        alunoBd.save(aluno);

        return aluno;
    }


}
