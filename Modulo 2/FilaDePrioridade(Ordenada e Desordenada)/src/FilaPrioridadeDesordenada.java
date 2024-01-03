public class FilaPrioridadeDesordenada extends FilaPrioridade {

    @Override
    public void inserir(int chave, String valor) {
        No novoNo = new No(chave, valor);
        if (estaVazia()) {
            primeiro = novoNo;
        } else {
            ultimo.proximo = novoNo;
            novoNo.anterior = ultimo;
        }
        ultimo = novoNo;
        tamanho++;
    }

    @Override
    protected No noMinimo() {
        if (estaVazia()) {
            return null;
        }
        No noMinimo = primeiro;
        No noAuxiliar = primeiro.proximo;
        while (noAuxiliar != null) {
            if (noAuxiliar.chave < noMinimo.chave) {
                noMinimo = noAuxiliar;
            }
            noAuxiliar = noAuxiliar.proximo;
        }
        return noMinimo;
    }

    @Override
    public Entrada min() {
        No noMinimo = noMinimo();
        return new Entrada(noMinimo.chave, noMinimo.valor);
    }

    @Override
    public Entrada removerMin() {
        No noMinimo = noMinimo();
        if (noMinimo == null) {
            return null;
        }

        if (tamanho == 1) {
            primeiro = null;
            ultimo = null;

        } else if (noMinimo.anterior == null) {
            primeiro = primeiro.proximo;
            primeiro.anterior = null;
            noMinimo.proximo = null;

        } else if (noMinimo.proximo == null) {
            ultimo = ultimo.anterior;
            ultimo.proximo = null;
            noMinimo.anterior = null;

        } else {
            noMinimo.anterior.proximo = noMinimo.proximo;
            noMinimo.proximo.anterior = noMinimo.anterior;
            noMinimo.proximo = null;
            noMinimo.anterior = null;
        }
        tamanho--;
        return new Entrada(noMinimo.chave, noMinimo.valor);
    }
}
