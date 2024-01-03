public class ArvoreBinariaDeBusca {
    class No {
        int valor;
        No esquerda;
        No direita;

        public No(int valor) {
            this.valor = valor;
        }
    }

    No raiz;

    public ArvoreBinariaDeBusca() {
        raiz = null;
    }

    private void mostrarOrdem(No raiz) {
        if (raiz != null) {
            mostrarOrdem(raiz.esquerda);
            System.out.print(raiz.valor + " ");
            mostrarOrdem(raiz.direita);
        }
    }

    public void mostrarOrdem() {
        mostrarOrdem(raiz);
        System.out.println();
    }

    private boolean contemRecursivo(No raiz, int valor) {
        if (raiz != null) {
            if (raiz.valor == valor) {
                return true;
            }
            if (valor < raiz.valor) {
                return contemRecursivo(raiz.esquerda, valor);
            } else {
                return contemRecursivo(raiz.direita, valor);
            }
        }
        return false;
    }

    public boolean contemRecursivo(int valor) {
        return contemRecursivo(raiz, valor);
    }

    public boolean contem(int valor) {
        No noAuxiliar = raiz;

        while (noAuxiliar != null) {
            if (valor == noAuxiliar.valor) {
                return true;
            }
            if (valor > noAuxiliar.valor) {
                noAuxiliar = noAuxiliar.direita;
            } else {
                noAuxiliar = noAuxiliar.esquerda;
            }
        }
        return false;
    }

    private void inserirRecursivo(No raiz, No novoNo) {
        if (raiz.valor != novoNo.valor) {
            if (novoNo.valor < raiz.valor) {
                if (raiz.esquerda == null) {
                    raiz.esquerda = novoNo;
                } else {
                    inserirRecursivo(raiz.esquerda, novoNo);
                }
            } else {
                if (raiz.direita == null) {
                    raiz.direita = novoNo;
                } else {
                    inserirRecursivo(raiz.direita, novoNo);
                }
            }
        }
    }

    public void inserirRecursivo(int valor) {
        No novoNo = new No(valor);
        if (raiz == null) {
            raiz = novoNo;
        } else {
            inserirRecursivo(raiz, novoNo);
        }
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (raiz == null) {
            raiz = novoNo;
        } else {
            No noAuxiliar = raiz;

            while (true) {
                if (valor == noAuxiliar.valor) {
                    break;
                }

                if (valor < noAuxiliar.valor) {
                    if (noAuxiliar.esquerda == null) {
                        noAuxiliar.esquerda = novoNo;
                        break;
                    }
                    noAuxiliar = noAuxiliar.esquerda;

                } else {
                    if (noAuxiliar.direita == null) {
                        noAuxiliar.direita = novoNo;
                        break;
                    }
                    noAuxiliar = noAuxiliar.direita;
                }
            }
        }
    }
}
