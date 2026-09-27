package br.com.techcorp.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ControleDeAcesso {
    private final List<Funcionario> historicoCatraca = new ArrayList<>();
    private final Set<Funcionario> autorizadosSalaSegura = new HashSet<>();

    public void registrarPassagem(Funcionario f) { historicoCatraca.add(f); }

    public void concederAcessoSala(Funcionario f) {
        if (autorizadosSalaSegura.add(f)) {
            System.out.println("Acesso liberado para a Sala Segura");
        } else {
            System.out.println("Aviso: Matrícula já registrada na sala. Acesso não permitido.");
        }
    }

    public List<Funcionario> getHistoricoCatraca() { return List.copyOf(historicoCatraca); }
    public Set<Funcionario> getAutorizadosSalaSegura() { return Set.copyOf(autorizadosSalaSegura); }
}
