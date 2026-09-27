package br.com.techcorp.model;

import java.util.Objects;

public class Funcionario {
    private final String matricula;
    private final String nome;
    private final String cargo;

    public Funcionario(String matricula, String nome, String cargo) {
        this.matricula = Objects.requireNonNull(matricula);
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public String getCargo() { return cargo; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Funcionario outro = (Funcionario) obj;
        return Objects.equals(matricula, outro.matricula);
    }

    @Override
    public int hashCode() { return Objects.hash(matricula); }

    @Override
    public String toString() { return matricula + " | " + nome + " | " + cargo; }
}
