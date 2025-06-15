package Fila;

public class Fila {
    private int[] elementos;
    private int inicioDaFila;
    private int fimDaFila;
    private int totalElementos;

    public Fila(int capacidade) {
        this.elementos = new int[capacidade];
        this.inicioDaFila = 0;
        this.fimDaFila = -1;
        this.totalElementos = 0;
    }

    public void inserirElemento(int elemento) {
        fimDaFila = (fimDaFila + 1) % elementos.length;
        elementos[fimDaFila] = elemento;
        totalElementos++;

    }

    public int retirarElemento() {
        if (isEmpty()) {
            throw new RuntimeException("Fila está vazia");
        }
        int elementoRemovido = elementos[inicioDaFila];
        inicioDaFila = (inicioDaFila + 1) % elementos.length;
        totalElementos--;
        return elementoRemovido;
    }


    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila está vazia");
        }
        return elementos[inicioDaFila];
    }

    public boolean isEmpty() {
        return totalElementos == 0;
    }

    public void exibirFila() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
            return;
        }
        System.out.print("Fila: ");
        for (int i = 0; i < totalElementos; i++) {
            int index = (inicioDaFila + i) % elementos.length;
            System.out.print(elementos[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.inserirElemento(10);
        fila.inserirElemento(20);
        fila.inserirElemento(30);

        fila.exibirFila();

        System.out.println("Desenfileirado: " + fila.retirarElemento());

        fila.exibirFila();

        System.out.println("Primeiro da fila: " + fila.peek());
    }

}
