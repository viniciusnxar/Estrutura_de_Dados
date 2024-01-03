public class Main {
    public static void main(String[] args) {
        ListaEncadeadaSimples<Integer> lista = new ListaEncadeadaSimples<>();
        
        lista.inserirFim(1);
        lista.inserirFim(2);
        lista.inserirFim(3);

        lista.exibirLista(); // Output: [1, 2, 3]

        lista.inserirPosicao(1, 10);
        lista.exibirLista(); // Output: [1, 10, 2, 3]

        int valorNaPosicao2 = lista.retornaValor(2);
        System.out.println("Valor na posicao 2: " + valorNaPosicao2); // Output: Valor na posição 2: 2
    }
}