package Pilha;


public class Pilha {
    private int[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        elementos = new int[capacidade];
        topo = -1;
    }

    public void push(int valor) {
        if (isFull()) {
            throw new RuntimeException("A pilha se encontra cheia");
        }
        elementos[++topo] = valor;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha se encontra vazia");
        }
        return elementos[topo--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha se encontra vazia");
        }
        return elementos[topo];
    }

    public boolean isFull() {
        return topo == elementos.length - 1;
    }

    public boolean isEmpty() {
        if (topo == -1) {
            return true;
        }
        return false;
    }
    public void listarElementos() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        System.out.println("Elementos da pilha (do topo para a base):");
        for (int i = topo; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }


    public static void main(String[] args) {
        Pilha pilha = new Pilha(4);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.pop();
        pilha.pop();
        System.out.println("Elemento do topo: " + pilha.peek());
        pilha.listarElementos();
    }
}

