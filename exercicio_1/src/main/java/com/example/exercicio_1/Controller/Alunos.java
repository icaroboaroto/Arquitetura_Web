package com.example.exercicio_1.Controller;

public class Alunos {
    private String nome;
    private String sobrenome;
    private int idade;
    private char sexo;
    private String curso;

    public Alunos(String nome, String sobrenome, int idade, char sexo, String curso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sexo = sexo;
        this.curso = curso;
    }

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}