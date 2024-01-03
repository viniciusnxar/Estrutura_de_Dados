public class Main {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilhar(3);
        pilha.empilhar(2);
        pilha.empilhar(1);

        pilha.imprimirPilha(); // Saída: [1], [2], [3]

        pilha.empilhar(4);
        pilha.empilhar(5);

        pilha.imprimirPilha(); // Saída: [5], [4], [1], [2], [3]

        int valorNoTopo = pilha.espiar();
        System.out.println("Valor no topo da pilha: " + valorNoTopo); // Saída: Valor no topo da pilha: 5

        pilha.desempilhar();
        pilha.imprimirPilha(); // Saída: [4], [1], [2], [3]

        pilha.desempilhar();
        pilha.imprimirPilha(); // Saída: [1], [2], [3]
    }
}
