public class FilaCircular extends Fila {

    public FilaCircular() {
        super();
    }

    public FilaCircular(int valor) {
        super(valor);
        ultimo.proximo = primeiro;
    }

    @Override
    public void imprimirFila() {
        No noAuxiliar = primeiro;
        for (int i = 0; i < tamanho; i++) {
            System.out.print(noAuxiliar.valor + " ");
            noAuxiliar = noAuxiliar.proximo;
        }
        System.out.println();
    }

    @Override
    public void enfileirar(int valor) {
        super.enfileirar(valor);
        ultimo.proximo = primeiro;
    }

    @Override
    public int desenfileirar() {
        int valor = super.desenfileirar();
        if (tamanho != 0) {
            ultimo.proximo = primeiro;
        }
        return valor;
    }

    public void rotacionar() {
        primeiro = primeiro.proximo;
        ultimo = ultimo.proximo;
    }
}
