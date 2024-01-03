public class Main {
    public static void main(String[] args) {
        FilaCircular filaCircular = new FilaCircular();

        // Enfileirando alguns elementos
        filaCircular.enfileirar(1);
        filaCircular.enfileirar(2);
        filaCircular.enfileirar(3);

        // Imprimindo a fila
        System.out.println("Fila original:");
        filaCircular.imprimirFila();

        // Rotacionando a fila
        filaCircular.rotacionar();

        // Imprimindo a fila após a rotação
        System.out.println("\nFila apos a rotaçao:");
        filaCircular.imprimirFila();

        // Desenfileirando um elemento
        int valorDesenfileirado = filaCircular.desenfileirar();

        // Imprimindo a fila após a desenfileiração
        System.out.println("\nFila apos desenfileirar um elemento:");
        filaCircular.imprimirFila();

        // Imprimindo o valor desenfileirado
        System.out.println("\nValor desenfileirado: " + valorDesenfileirado);
    }
}
