public class Fila<T> {

    class No<T> {
        T valor;
        No<T> proximo;

        public No(T valor) {
            this.valor = valor;
        }
    }

    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho;

    public Fila() {
        primeiro = null;
        ultimo = null;
        tamanho = 0;
    }

    public Fila(T valor) {
        No<T> novoNo = new No<T>(valor);
        primeiro = novoNo;
        ultimo = novoNo;
        tamanho = 1;
    }

    public void enfileirar(T valor) {
        No<T> novoNo = new No<T>(valor);
        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.proximo = novoNo;
            ultimo = novoNo;
        }
        tamanho++;
    }

    public void desenfileirar() {
        if (primeiro == null) {
            throw new RuntimeException("Fila vazia!");
        }
        No<T> noAuxiliar = primeiro;
        if (tamanho == 1) {
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = noAuxiliar.proximo;
            noAuxiliar.proximo = null;
            tamanho--;
        }
    }

    public void imprimirFila() {
        No<T> noAuxiliar = primeiro;
        while (noAuxiliar != null) {
            System.out.print(noAuxiliar.valor + " ");
            noAuxiliar = noAuxiliar.proximo;
        }
        System.out.println();
    }
}
