package ListaEncadeada;

public class ListaEncadeada {
    private No inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    public void inserirElemento(int elemento) {
        No novoNo = new No(elemento);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No noAtual = inicio;
            while (noAtual.proximoNO != null) {
                noAtual = noAtual.proximoNO;
            }
            noAtual.proximoNO = novoNo;
        }
    }

    public void retirarElemento(int elemento) {
        if (inicio == null) {
            System.out.println("Lista vazia. Nada para remover.");
            return;
        }

        if (inicio.elemento == elemento) {
            inicio = inicio.proximoNO;
            System.out.println("Elemento " + elemento + " removido (era o primeiro da lista).");
            return;
        }

        No noAtual = inicio;
        while (noAtual.proximoNO != null && noAtual.proximoNO.elemento != elemento) {
            noAtual = noAtual.proximoNO;
        }

        if (noAtual.proximoNO != null) {
            noAtual.proximoNO = noAtual.proximoNO.proximoNO;
            System.out.println("Elemento " + elemento + " removido com sucesso.");
        } else {
            System.out.println("Elemento " + elemento + " não encontrado na lista.");
        }
    }

    public void exibirElmentos() {
        No noAtual = inicio;
        while (noAtual != null) {
            System.out.print(noAtual.elemento + " -> ");
            noAtual = noAtual.proximoNO;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserirElemento(10);
        lista.inserirElemento(20);
        lista.inserirElemento(30);

        System.out.println("Lista atual:");
        lista.exibirElmentos();

        lista.retirarElemento(20);
        System.out.println("Após remover 20:");
        lista.exibirElmentos();


        lista.retirarElemento(99);
        System.out.println("Após tentar remover 99:");
        lista.exibirElmentos();


    }
}



