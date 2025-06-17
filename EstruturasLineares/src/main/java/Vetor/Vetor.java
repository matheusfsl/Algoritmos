package Vetor;

public class Vetor {

    private String[] elementos;

    private int tamanho;


    public Vetor(final int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }


    public boolean add(final String elemento) {
        aumentaCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            return true;
        }
        return false;
    }


    private void aumentaCapacidade(){
        if (tamanho == elementos.length){
            String[] novosElementos = new String[elementos.length * 2];

            for (int i = 0; i < elementos.length; i++) {
                novosElementos[i] = elementos[i];
            }
            elementos = novosElementos;
        }

    }

    public static void main(String[] args) {
        Vetor nomes = new Vetor(3);
        nomes.add("Matheus");
        nomes.add("Lucas");
        nomes.add("Pedro");
    }
}
