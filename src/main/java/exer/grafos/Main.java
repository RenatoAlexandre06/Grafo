package exer.grafos;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(); //não dirigido
        grafo.adicionaVertices("1", "2", "3", "4", "5", "6");

        // Adicionando as arestas
        grafo.addAresta("1", "3");
        grafo.addAresta("1", "4");
        grafo.addAresta("1", "5");
        grafo.addAresta("2", "3");
        grafo.addAresta("2", "4");
        grafo.addAresta("2", "5");
        grafo.addAresta("3", "5");
        grafo.addAresta("4", "5");

        System.out.println("=======================================");
        System.out.println("          RESUMO GERAL DO GRAFO        ");
        System.out.println("=======================================");
        // O toString do grafo
        System.out.println(grafo);

        System.out.println("\n=======================================");
        System.out.println("      TESTE DE PROPRIEDADES (VÉRTICES) ");
        System.out.println("=======================================");

        // Testando as propriedades do Vértice 1 (que apenas envia arestas neste escopo)
        imprimirDetalhesDoVertice(grafo, "1");

        // Testando as propriedades do Vértice 5 (que recebe várias arestas)
        imprimirDetalhesDoVertice(grafo, "5");

        // Testando as propriedades do Vértice 3 (que recebe e envia arestas)
        imprimirDetalhesDoVertice(grafo, "3");
    }

    // Método auxiliar para não repetir código de impressão
    private static void imprimirDetalhesDoVertice(Grafo grafo, String nomeVertice) {
        Optional<Vertice> optVertice = grafo.encontraVertice(nomeVertice);

        if (optVertice.isPresent()) {
            Vertice v = optVertice.get();
            System.out.println("VÉRTICE [" + v.getNome() + "]");
            System.out.println(" - Grau Total: " + v.getGrau());
            System.out.println(" - In-Degree (Entrada): " + v.getInDegree());
            System.out.println(" - Out-Degree (Saída): " + v.getOutDegree());
            System.out.println(" - Lista de Adjacências (Saem de " + v.getNome() + " para): " + v.getListaAdjacencias());
            System.out.println(" - Lista de Adjacentes (Chegam em " + v.getNome() + " de): " + v.getListaAdjacentes());
            System.out.println("---------------------------------------");
        } else {
            System.out.println("Vértice " + nomeVertice + " não encontrado.");
        }
    }
}