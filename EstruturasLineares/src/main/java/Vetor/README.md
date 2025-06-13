# Estrutura de Dados - Vetor Dinâmico em Java

Este projeto apresenta a implementação de um **vetor dinâmico (array dinâmico)** em Java, capaz de armazenar elementos do tipo `String` e aumentar sua capacidade automaticamente quando necessário.

##  Funcionalidades

A classe `Vetor` implementa as seguintes funcionalidades:

- Armazenar elementos do tipo `String`.
- Adicionar elementos ao final do vetor.
- Aumentar automaticamente a capacidade do vetor quando ele estiver cheio.

##  Exemplo de uso

```java
public static void main(String[] args) {
    Vetor nomes = new Vetor(3); // Cria vetor com capacidade inicial 3
    nomes.add("Matheus");
    nomes.add("Lucas");
    nomes.add("Pedro");
}
```
Caso mais elementos sejam adicionados além da capacidade inicial, o vetor dobra de tamanho automaticamente:
```java
nomes.add("João"); // O vetor aumentará a capacidade automaticamente
```

##  Conceitos Aplicados
Estrutura de dados: Vetor (array)

Crescimento dinâmico de arrays

Programação orientada a objetos (POO) em Java

Encapsulamento
