#  Estrutura de Dados - Busca Binária em Java

Este projeto implementa o algoritmo de **Busca Binária** em Java, que é uma técnica eficiente para encontrar um elemento em um vetor ordenado.

##  Funcionalidades

- Busca de um valor dentro de um array **ordenado**
- Retorno do índice do valor caso encontrado
- Retorno `-1` se o valor não for encontrado

##  Estrutura da Classe

### `BuscaBinaria`
- `buscar(int[] array, int valor)`: realiza a busca binária
- `main()`: demonstra o uso do algoritmo

###  Como funciona

A busca binária divide repetidamente o array ao meio, comparando o valor buscado com o elemento central:

1. Compara com o elemento do meio.
2. Se for menor, busca na metade esquerda.
3. Se for maior, busca na metade direita.
4. Repete até encontrar ou esgotar as possibilidades.

### Requisitos:
- O array **deve estar ordenado**.

##  Exemplo de uso

```java
int[] numeros = {1, 3, 5, 7, 9, 11};
int valorProcurado = 7;

int resultado = BuscaBinaria.buscar(numeros, valorProcurado);
```
## Saída esperada:
  ```nginx
  Valor encontrado no índice: 3
  ````
## Complexidade de Tempo - Big O

| Operação | Complexidade Média | Complexidade Pior Caso | Justificativa                                                                                                                                                                  |
| -------- | ------------------ | ---------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| Busca    | O(log n)           | O(log n)               | A cada iteração, elimina metade do array. O número de comparações cresce logaritmicamente com o tamanho da entrada. No pior caso, percorre até o final da divisão logarítmica. |



  Explicação:
  - Melhor caso – O(1): quando o valor procurado está exatamente no meio do array logo na primeira comparação.
  - Caso médio/pior – O(log n): a cada iteração, a busca elimina metade dos elementos restantes, por isso o tempo de execução cresce logaritmicamente em relação ao tamanho do array.
    
  - Importante: A busca binária só funciona corretamente se o array estiver ordenado. Caso contrário, o resultado será imprevisível.
