# Estrutura de Dados - Vetor Dinâmico em Java

Este projeto apresenta a implementação de um **vetor dinâmico (array dinâmico)** em Java, capaz de armazenar elementos do tipo `String` e aumentar sua capacidade automaticamente quando necessário.

##  Funcionalidades

A classe `Vetor` implementa as seguintes funcionalidades:

- Armazenar elementos do tipo `String`.
- Adicionar elementos ao final do vetor.
- Aumentar automaticamente a capacidade do vetor quando ele estiver cheio.

## Complexidade de Tempo - Big O
A complexidade das operações em um vetor dinâmico pode variar dependendo da situação:
    | Operação                        | Complexidade Média | Complexidade Pior Caso | Justificativa                                                                                        |
| ------------------------------- | ------------------ | ---------------------- | ---------------------------------------------------------------------------------------------------- |
| `add()` (sem redimensionamento) | O(1)               | O(n)                   | Inserção direta na próxima posição livre é constante. Redimensionar exige copiar todos os elementos. |
| `add()` (com redimensionamento) | —                  | O(n)                   | Quando o vetor está cheio, é necessário alocar novo array e copiar os dados.                         |
| Acesso por índice               | O(1)               | O(1)                   | Acesso direto ao índice é instantâneo.                                                               |
| Busca linear                    | O(n)               | O(n)                   | É necessário percorrer todos os elementos em caso de busca.                                          |

 - Observação: Apesar de o redimensionamento ter custo O(n) no pior caso, o vetor dinâmico possui desempenho amortizado eficiente, pois a operação de redimensionar não ocorre frequentemente (dobro da capacidade).

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

- Estrutura de dados: Vetor (array).
- Crescimento dinâmico de arrays.
- Programação orientada a objetos (POO) em Java.
- Encapsulamento.
