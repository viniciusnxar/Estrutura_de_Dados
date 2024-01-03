public class Fila {
    No primeiro;
    No ultimo;
    int tamanho;

    public Fila() {
        primeiro = null;
        ultimo = null;
        tamanho = 0;
    }

    public Fila(int valor) {
        No novoNo = new No(valor);
        primeiro = novoNo;
        ultimo = novoNo;
        tamanho = 1;
    }

    public void imprimirFila() {
        No noAuxiliar = primeiro;
        while (noAuxiliar != null) {
            System.out.print(noAuxiliar.valor + " ");
            noAuxiliar = noAuxiliar.proximo;
        }
        System.out.println();
    }

    public void enfileirar(int valor) {
        No novoNo = new No(valor);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            ultimo.proximo = novoNo;
        }
        ultimo = novoNo;
        tamanho++;
    }

    public int desenfileirar() {
        if (primeiro == null) {
            throw new RuntimeException("Fila vazia!");
        }

        int valor = primeiro.valor;

        if (tamanho == 1) {
            primeiro = null;
            ultimo = null;
        } else {
            No noAuxiliar = primeiro;
            primeiro = primeiro.proximo;
            noAuxiliar.proximo = null;
        }

        tamanho--;
        return valor;
    }
}
