# Estrutura de Dados - Pilha em Java

Este projeto demonstra a implementação de uma estrutura de **Pilha (Stack)** utilizando Java puro. A pilha é uma estrutura de dados do tipo **LIFO (Last In, First Out)**, onde o último elemento inserido é o primeiro a ser removido.

##  Funcionalidades

A classe `Pilha` possui os seguintes métodos:

- `push(int valor)`: Insere um elemento no topo da pilha.
- `pop()`: Remove e retorna o elemento do topo da pilha.
- `peek()`: Retorna o elemento do topo sem removê-lo.
- `isFull()`: Verifica se a pilha está cheia.
- `isEmpty()`: Verifica se a pilha está vazia.
- `listarElementos()`: Exibe todos os elementos da pilha do topo para a base.

##  Exemplo de uso

```java
public static void main(String[] args) {
    Pilha pilha = new Pilha(4); // Cria uma pilha com capacidade para 4 elementos

    pilha.push(10);
    pilha.push(20);
    pilha.push(30);
    pilha.push(40);

    pilha.pop(); // Remove o 40
    pilha.pop(); // Remove o 30

    System.out.println("Elemento do topo: " + pilha.peek()); // Deve mostrar 20

    pilha.listarElementos(); // Exibe os elementos restantes da pilha
}
```
##  Sobre a Implementação
A pilha foi implementada usando um array de inteiros.

O controle do topo da pilha é feito através do índice topo.

A capacidade da pilha é definida no momento da criação do objeto.

##  Conceitos Envolvidos
Estrutura de dados do tipo Pilha (Stack)

Programação orientada a objetos (POO) em Java

Tratamento de exceções básicas
