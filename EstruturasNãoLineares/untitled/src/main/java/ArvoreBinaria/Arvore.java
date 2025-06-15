package ArvoreBinaria;

public class Arvore {
    private Folha folha;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore() {
        this.folha = null;
        this.direita = null;
        this.esquerda = null;
    }

    public Arvore(Folha folha) {
        this.folha = folha;
        this.direita = null;
        this.esquerda = null;
    }

    public boolean isEmpty() {
        return this.folha == null;
    }

    public void inserirFolha(Folha novaFolha) {
        if (isEmpty()) {
            this.folha = novaFolha;
        } else {
            Arvore novaArvore = new Arvore(novaFolha);
            if (novaFolha.getValor() < this.folha.getValor()) {
                if (this.esquerda == null) {
                    this.esquerda = novaArvore;
                    System.out.println("Folha: " + novaFolha.getValor() + " a esquerda de: " + this.folha.getValor());
                } else {
                    this.esquerda.inserirFolha(novaFolha);
                }
            } else if (novaFolha.getValor() > this.folha.getValor()) {
                if (this.direita == null) {
                    this.direita = novaArvore;
                    System.out.println("Folha: " + novaFolha.getValor() + " a direita de: " + this.folha.getValor());
                } else {
                    this.direita.inserirFolha(novaFolha);
                }
            }
        }
    }

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
}
