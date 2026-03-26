# Exercício de Teoria dos Grafos em Java 

Este repositório contém a implementação de um exercício prático de Estrutura de Dados e Teoria dos Grafos, desenvolvido em Java. O objetivo do projeto é modelar a estrutura fundamental de um grafo orientada a objetos (Grafo, Vértices e Arestas) e calcular as suas principais propriedades matemáticas.

## 🚀 O que foi implementado:

O projeto foi construído para extrair automaticamente as seguintes informações da estrutura:

Na classe **Grafo**:
* *Ordem:* Cálculo da quantidade total de vértices no grafo ($|V|$).
* *Tamanho:* Cálculo da quantidade total de arestas no grafo ($|E|$).
* Inferência automática para identificar se o grafo é direcionado ou não com base nas conexões.

Na classe **Vertice**:

* *In-degree (Grau de Entrada):* Quantidade de arestas que chegam ao vértice.
* *Out-degree (Grau de Saída):* Quantidade de arestas que partem do vértice.
* *Grau Total:* A soma do in-degree e out-degree.
* *Lista de Adjacências:* Mapeamento dos vértices sucessores (que recebem arestas provenientes do vértice em questão).
* *Lista de Adjacentes:* Mapeamento dos vértices predecessores (que enviam arestas para o vértice em questão).

## 🛠️ Tecnologias Utilizadas

* Java
* Gradle (Gerenciamento de dependências)
* Project Lombok (Utilizado para manter o código limpo, automatizando a geração de Getters, Setters e Construtores)

## ⚙️ Como testar?

A execução do projeto se dá pela classe Main.java.\
Ao rodar a aplicação, o código instancia um grafo de exemplo, adiciona os vértices de 1 a 6, cria as conexões (arestas) entre eles e imprime no console:
* O resumo do grafo (sua ordem e tamanho). 
* O detalhamento individual de vértices específicos, mostrando seus graus e suas listas de adjacências/adjacentes preenchidas dinamicamente.