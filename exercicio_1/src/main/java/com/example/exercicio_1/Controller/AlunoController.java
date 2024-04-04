package com.example.exercicio_1.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/ex3")
public class AlunoController {

    private List<Alunos> alunos = new ArrayList<>();

    public AlunoController() {
      alunos.add(new Alunos("Valentina", "Buarque", 19, 'F', "Medicina"));
      alunos.add(new Alunos("Vania", "Fontanive", 20, 'F', "Direito"));
      alunos.add(new Alunos("Marcelo", "Boaroto", 22, 'M', "Engenharia Mecânica"));
      alunos.add(new Alunos("Ícaro", "Júnior", 21, 'M', "Análise e Desenvolvimento de Sistemas"));
        
    }

    @GetMapping
    public List<Alunos> getAllAlunos() {
        return alunos;
    }

    @GetMapping("/alunos/{index}")
    public Alunos getAlunoByIndex(@PathVariable int index) {
        if (index >= 0 && index < alunos.size()) {
            return alunos.get(index);
        } else {
            return null;
        }
    }

    @PostMapping("/add")
    public Alunos createAluno(@RequestBody Alunos aluno) {
        alunos.add(aluno);
        System.out.println("Aluno adicionado: " + aluno);
        return aluno;
    }

    @PutMapping("/alunos/{index}")
    public Alunos updateAluno(@PathVariable int index, @RequestBody Alunos aluno) {
        if (index >= 0 && index < alunos.size()) {
            alunos.set(index, aluno);
            System.out.println("Atualização: " + alunos);
            return aluno;
        } else {
            System.out.println("Aluno não encontrado");
            return null;
        }
    }

    @DeleteMapping("/alunos/{index}")
    public void deleteAlunos(@PathVariable int index) {
        if (index >= 0 && index < alunos.size()) {
            alunos.remove(index);
        }
    }
}
