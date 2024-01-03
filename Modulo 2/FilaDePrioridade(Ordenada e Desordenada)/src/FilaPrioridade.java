abstract class FilaPrioridade {
    class Entrada {
        private int chave;
        private String valor;
    
        public Entrada(int chave, String valor) {
            this.chave = chave;
            this.valor = valor;
        }
    
        @Override
        public String toString() {
            return "[" + chave + "]: " + valor;
        }
    }
    protected class No {
        int chave;
        String valor;
        No proximo;
        No anterior;

        public No(int chave, String valor) {
            this.chave = chave;
            this.valor = valor;
            proximo = null;
            anterior = null;
        }
    }

    protected No primeiro;
    protected No ultimo;
    protected int tamanho;

    public FilaPrioridade() {
        primeiro = null;
        ultimo = null;
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void imprimirFila() {
        No noAuxiliar = primeiro;
        while (noAuxiliar != null) {
            System.out.println("[" + noAuxiliar.chave + "]: " + noAuxiliar.valor);
            noAuxiliar = noAuxiliar.proximo;
        }
    }

    public abstract Entrada min();

    protected abstract No noMinimo();

    public abstract Entrada removerMin();

    public abstract void inserir(int chave, String valor);
}