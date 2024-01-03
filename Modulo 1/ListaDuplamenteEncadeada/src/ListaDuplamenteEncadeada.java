public class ListaDuplamenteEncadeada<T> {

    class No {
        T valor;
        No proximo;
        No anterior;

        public No(T valor) {
            this.valor = valor;
            this.proximo = null;
            this.anterior = null;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        tamanho = 0;
        inicio = null;
        fim = null;
    }

    public ListaDuplamenteEncadeada(T valor) {
        No novoNo = new No(valor);
        inicio = novoNo;
        fim = novoNo;
        tamanho = 1;
    }

    public void exibirLista() {
        System.out.print("[");
        No noAux = inicio;
        while (noAux != null) {
            System.out.print(noAux.valor);
            noAux = noAux.proximo;
            if (noAux != null) System.out.print(", ");
        }
        System.out.println("]");
    }

    public T retornaValor(int posicao) {
        return retornarNo(posicao).valor;
    }

    private No retornarNo(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posicao " + posicao + " esta fora dos limites!");
        }
        No noAux;
        if (posicao < tamanho / 2) {
            noAux = inicio;
            for (int i = 0; i < posicao; i++) {
                noAux = noAux.proximo;
            }
        } else {
            noAux = fim;
            for (int i = tamanho - 1; i > posicao; i--) {
                noAux = noAux.anterior;
            }
        }
        return noAux;
    }

    public void inserirInicio(T valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
        tamanho++;
    }

    public void inserirFim(T valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
        }
        fim = novoNo;
        tamanho++;
    }

    public void inserirPosicao(int posicao, T valor) {
        if (posicao <= 0) {
            inserirInicio(valor);
        } else if (posicao >= tamanho) {
            inserirFim(valor);
        } else {
            No novoNo = new No(valor);
            No noAux = retornarNo(posicao);
            novoNo.proximo = noAux;
            novoNo.anterior = noAux.anterior;
            noAux.anterior.proximo = novoNo;
            noAux.anterior = novoNo;
            tamanho++;
        }
    }

    public void removerInicio() {
        if (inicio == null) {
            throw new RuntimeException("Lista vazia!");
        }
        if (tamanho == 1) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior.proximo = null;
            inicio.anterior = null;
        }
        tamanho--;
    }

    public void removerFim() {
        if (inicio == null) {
            throw new RuntimeException("Lista vazia!");
        }
        if (tamanho == 1) {
            inicio = null;
            fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo.anterior = null;
            fim.proximo = null;
        }
        tamanho--;
    }

    public void removerPosicao(int posicao) {
        if (posicao <= 0) {
            removerInicio();
        } else if (posicao >= tamanho - 1) {
            removerFim();
        } else {
            No noAux = retornarNo(posicao);
            noAux.anterior.proximo = noAux.proximo;
            noAux.proximo.anterior = noAux.anterior;
            noAux.proximo = null;
            noAux.anterior = null;
            tamanho--;
        }
    }
}
