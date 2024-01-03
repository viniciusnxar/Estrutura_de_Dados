public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        fila.imprimirFila(); // Saída: 1 2 3

        fila.desenfileirar();
        fila.imprimirFila(); // Saída: 2 3

        fila.enfileirar(4);
        fila.enfileirar(5);

        fila.imprimirFila(); // Saída: 2 3 4 5
    }
}
