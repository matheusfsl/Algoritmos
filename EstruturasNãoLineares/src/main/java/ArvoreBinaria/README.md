#  Estrutura de Dados - Árvore Binária de Busca (ABB) em Java

Este projeto implementa uma **Árvore Binária de Busca** simples em Java, composta por nós chamados de `Folha`, onde cada elemento é inserido respeitando a ordenação binária: valores menores vão para a esquerda, e valores maiores vão para a direita.

##  Funcionalidades

- Inserção de novos nós (`Folha`) na árvore respeitando a ordenação binária.
- Impressão da posição de inserção (esquerda ou direita) no console.
- Verificação se a árvore está vazia.

##  Estrutura de Classes

- `Arvore`: Representa a árvore binária.
  - Possui referências para um nó (folha) e suas subárvores esquerda e direita.
  - Contém os métodos de inserção e verificação de estado.
- `Folha`: Representa um nó da árvore.
  - Armazena um valor inteiro.

## Complexidade de Tempo - Big O
  A performance da Árvore Binária de Busca depende da sua altura. Em uma árvore balanceada, o desempenho é ótimo. No entanto, em uma árvore desequilibrada, os custos aumentam.
  | Operação             | Complexidade Média | Complexidade Pior Caso | Justificativa                                                                                        |
| -------------------- | ------------------ | ---------------------- | ---------------------------------------------------------------------------------------------------- |
| Inserção             | O(log n)           | O(n)                   | Em média, percorre metade da altura da árvore. No pior caso (desequilibrada), percorre todos os nós. |
| Busca                | O(log n)           | O(n)                   | Segue o mesmo raciocínio da inserção.                                                                |
| Remoção (se existir) | O(log n)           | O(n)                   | Também depende da altura da árvore.                                                                  |
-  Observação: n representa o número de nós na árvore. Para garantir desempenho ideal, seria necessário usar uma árvore balanceada (como AVL ou Red-Black Tree).
  
##  Exemplo de uso

```java
public static void main(String[] args) {
    Arvore arvore = new Arvore(new Folha(20));
    arvore.inserirFolha(new Folha(15));
    arvore.inserirFolha(new Folha(26));
    arvore.inserirFolha(new Folha(4));
    arvore.inserirFolha(new Folha(19));
    arvore.inserirFolha(new Folha(50));
    arvore.inserirFolha(new Folha(60));
    arvore.inserirFolha(new Folha(21));
}
```
## Saída esperada no console:

```java
Folha: 15 a esquerda de: 20
Folha: 26 a direita de: 20
Folha: 4 a esquerda de: 15
Folha: 19 a direita de: 15
Folha: 50 a direita de: 26
Folha: 60 a direita de: 50
Folha: 21 a esquerda de: 26
```
  ## Representação visual:
              20
            /    \
          15      26
         /  \    /  \
        4   19  21   50
                       \
                        60

##  Conceitos abordados

- Árvore binária de busca (Binary Search Tree - BST)
- Recursividade
- Encapsulamento em Java
- Comparação e inserção ordenada
