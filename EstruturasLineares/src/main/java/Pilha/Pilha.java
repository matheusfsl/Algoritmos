package Pilha;


public class Pilha {
    private int [] elementos;
    private  int topo;

    public Pilha(int capacidade){
        elementos = new int[capacidade];
        topo = -1;
    }
    public void push (int valor){
        if (topo == elementos.length-1){
            throw new RuntimeException("A pilha se encontra cheia");
        }
        elementos[++topo]=valor;

    }
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("A pilha se encontra vazia");
        }
        return elementos[topo--];
    }
    public int peek(){
        return elementos[topo];
    }
    public boolean isEmpty(){
        if (topo== -1){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Pilha pilha = new Pilha(3);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.pop();
        System.out.println("Elemento do topo: "+ pilha.peek());


    }
}

