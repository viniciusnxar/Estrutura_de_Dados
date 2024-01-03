public class Pilha<T> {

    class No<T> {
        T valor;
        No<T> proximo;

        public No(T valor) {
            this.valor = valor;
        }
    }

    private No<T> topo;
    private int altura;

    public Pilha() {
        topo = null;
        altura = 0;
    }

    public Pilha(T valor) {
        No<T> novoNo = new No<T>(valor);
        if (topo == null) {
            topo = novoNo;
        }
        altura = 1;
    }

    public void imprimirPilha() {
        No<T> noAtual = topo;
        while (noAtual != null) {
            System.out.println("[" + noAtual.valor + "]");
            noAtual = noAtual.proximo;
        }
    }

    public T desempilhar() {
        if (topo == null) {
            throw new RuntimeException("Pilha vazia.");
        }
        No<T> noDesempilhado = topo;
        topo = topo.proximo;
        noDesempilhado.proximo = null;
        altura--;
        return noDesempilhado.valor;
    }

    public void empilhar(T valor) {
        No<T> novoNo = new No<T>(valor);
        if (topo == null) {
            topo = novoNo;
        } else {
            novoNo.proximo = topo;
            topo = novoNo;
        }
        altura++;
    }

    public T espiar() {
        return topo.valor;
    }
}
