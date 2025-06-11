package Vetor;

public class Vetor {

    // Array interno que armazena os elementos
    private String[] elementos;

    // Representa o número de elementos atualmente armazenados no vetor
    private int tamanho;

    /**
     * Construtor do vetor, inicializa com a capacidade especificada.
     * @param capacidade Capacidade inicial do vetor
     */
    public Vetor(final int capacidade) {
        this.elementos = new String[capacidade]; // Cria array com a capacidade desejada
        this.tamanho = 0; // Inicialmente o vetor está vazio
    }

    /**
     * Adiciona um elemento no final do vetor.
     * Se o vetor estiver cheio, ele aumenta sua capacidade automaticamente.
     * @param elemento Elemento a ser adicionado
     * @return true se o elemento for adicionado com sucesso
     */
    public boolean add(final String elemento) {
        aumentaCapacidade(); // Verifica se precisa aumentar a capacidade
        if (tamanho < elementos.length) { // Garante que ainda há espaço
            elementos[tamanho] = elemento; // Adiciona o elemento na próxima posição livre
            tamanho++; // Atualiza o tamanho do vetor
            return true;
        }
        return false; // Caso não consiga adicionar (por algum erro), retorna false
    }

    /**
     * Método privado que dobra a capacidade do vetor quando ele estiver cheio.
     */
    private void aumentaCapacidade(){
        if (tamanho == elementos.length){ // So aumenta se o vetor estiver cheio
            // Cria um novo array com o dobro da capacidade atual
            String[] novosElementos = new String[elementos.length * 2];

            // Copia os elementos antigos para o novo array
            for (int i = 0; i < elementos.length; i++) {
                novosElementos[i] = elementos[i];
            }

            // Atualiza a referência para o novo array maior
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
