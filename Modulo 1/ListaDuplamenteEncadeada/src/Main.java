public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();

        lista.inserirInicio(3);
        lista.inserirInicio(2);
        lista.inserirInicio(1);

        lista.exibirLista(); // Output: [1, 2, 3]

        lista.inserirFim(4);
        lista.inserirFim(5);

        lista.exibirLista(); // Output: [1, 2, 3, 4, 5]

        int valorNaPosicao2 = lista.retornaValor(2);
        System.out.println("Valor na posicao 2: " + valorNaPosicao2); // Output: Valor na posição 2: 3

        lista.inserirPosicao(2, 10);
        lista.exibirLista(); // Output: [1, 2, 10, 3, 4, 5]

        lista.removerInicio();
        lista.exibirLista(); // Output: [2, 10, 3, 4, 5]

        lista.removerFim();
        lista.exibirLista(); // Output: [2, 10, 3, 4]

        lista.removerPosicao(1);
        lista.exibirLista(); // Output: [2, 3, 4]
    }
}
