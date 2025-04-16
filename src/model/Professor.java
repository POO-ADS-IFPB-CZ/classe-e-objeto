package model;

import java.time.LocalDate;

public class Professor {
    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private float salario;

    public Professor(String nome, String cpf,
             LocalDate nascimento, float salario){
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.salario = salario;
    }

    //TODO: Fazer getters e setters

}
