public class FilaPrioridadeOrdenada extends FilaPrioridade {

    @Override
    public void inserir(int chave, String valor) {
        No novoNo = new No(chave, valor);

        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            No noAuxiliar = primeiro;
            while (noAuxiliar != null && novoNo.chave >= noAuxiliar.chave) {
                noAuxiliar = noAuxiliar.proximo;
            }

            if (noAuxiliar == null) {
                novoNo.anterior = ultimo;
                ultimo.proximo = novoNo;
                ultimo = novoNo;
            } else if (noAuxiliar == primeiro) {
                novoNo.proximo = primeiro;
                primeiro.anterior = novoNo;
                primeiro = novoNo;
            } else {
                novoNo.proximo = noAuxiliar;
                novoNo.anterior = noAuxiliar.anterior;
                noAuxiliar.anterior.proximo = novoNo;
                noAuxiliar.anterior = novoNo;
            }
        }
        tamanho++;
    }

    @Override
    public Entrada min() {
        No noMin = noMinimo();
        return new Entrada(noMin.chave, noMin.valor);
    }

    @Override
    protected No noMinimo() {
        if (primeiro == null) {
            return null;
        }
        return primeiro;
    }

    @Override
    public Entrada removerMin() {
        No noMin = noMinimo();
        if (tamanho == 1) {
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.proximo;
            primeiro.anterior.proximo = null;
            primeiro.anterior = null;
        }
        tamanho--;
        return new Entrada(noMin.chave, noMin.valor);
    }
}

