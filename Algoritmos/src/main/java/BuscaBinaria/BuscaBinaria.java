package BuscaBinaria;

public class BuscaBinaria {
    public static int buscar(int array[], int valor) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (array[meio] == valor){
                return meio;
            }

            if (array[meio]<valor){
                inicio = meio +1;
            }else {
                fim = meio -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11};
        int valorProcurado = 7;

        int resultado = BuscaBinaria.buscar(numeros, valorProcurado);
        if (resultado != -1) {
            System.out.println("Valor encontrado no índice: " + resultado);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }
}
