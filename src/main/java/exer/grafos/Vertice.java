package exer.grafos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Vertice {
    private String nome;

    // Vértices que recebem arestas provenientes deste vértice (saída / out)
    private List<Vertice> listaAdjacencias;

    // Vértices que enviam arestas para este vértice (entrada / in)
    private List<Vertice> listaAdjacentes;

    public Vertice(String nome) {
        this.nome = nome;
        this.listaAdjacencias = new ArrayList<>();
        this.listaAdjacentes = new ArrayList<>();
    }

    public void adicionarAdjacencia(Vertice destino) {
        this.listaAdjacencias.add(destino);
    }

    public void adicionarAdjacente(Vertice origem) {
        this.listaAdjacentes.add(origem);
    }

    // Grau de Saída
    public int getOutDegree() {
        return this.listaAdjacencias.size();
    }

    // Grau de Entrada
    public int getInDegree() {
        return this.listaAdjacentes.size();
    }

    // Grau Total (In-degree + Out-degree)
    public int getGrau() {
        return getInDegree() + getOutDegree();
    }

    @Override
    public String toString() {
        return nome;
    }
}