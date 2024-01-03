public class HashTable {
    
    class No {
        private String chave;
        private int valor;
        private No proximo;
        private No anterior;

        public No(String chave, int valor) {
            this.chave = chave;
            this.valor = valor;
        }        
    }

    private No[] hashtable;
    private int tamanho;

    public HashTable() {
        tamanho = 7;
        hashtable = new No[tamanho];
    }

    private int hash(String chave) {
        int hash = 0;
        for (int i = 0; i < chave.length(); i++) {
            hash = hash + chave.charAt(i) * 31;
        }
        return hash % tamanho;
    }

    public void inserir(String chave, int valor) {
        int hash = hash(chave);
        No novoNo = new No(chave, valor);

        if (hashtable[hash] == null) {
            hashtable[hash] = novoNo;
        } else {
            No auxNo = hashtable[hash];
            while (auxNo.proximo != null && !chave.equals(auxNo.chave)) {
                auxNo = auxNo.proximo;
            }
            if (chave.equals(auxNo.chave)) {
                auxNo.valor = valor;
            } else {
                auxNo.proximo = novoNo;
                novoNo.anterior = auxNo;
            }
        }
    }

    public Integer obterValor(String chave) {
        return null; // Implementação necessária
    }

    public Integer remover(String chave) {
        int hash = hash(chave);
        if (hashtable[hash] == null) {
            return null;
        }

        No auxNo = hashtable[hash];
        while (auxNo.proximo != null && !chave.equals(auxNo.chave)) {
            auxNo = auxNo.proximo;
        }

        if (!chave.equals(auxNo.chave)) {
            return null;
        } else {
            if (auxNo == hashtable[hash]) {
                if (auxNo.proximo != null) {
                    hashtable[hash] = auxNo.proximo;
                    auxNo.proximo.anterior = null;
                    auxNo.proximo = null;
                } else {
                    hashtable[hash] = null;
                }
            } else if (auxNo.proximo == null && auxNo.anterior != null) {
                auxNo.anterior.proximo = null;
                auxNo.anterior = null;
            } else {
                auxNo.anterior.proximo = auxNo.proximo;
                auxNo.proximo.anterior = auxNo.anterior;
                auxNo.proximo = null;
                auxNo.anterior = null;
            }

            return auxNo.valor;
        }
    }

    public String[] obterChaves() {
        StringBuilder chaves = new StringBuilder();
        for (int i = 0; i < hashtable.length; i++) {
            No auxNo = hashtable[i];
            while (auxNo != null) {
                chaves.append(auxNo.chave).append(",");
                auxNo = auxNo.proximo;
            }
        }
        return chaves.toString().split(",");
    }

    public void imprimirTabela() {
        for (int i = 0; i < hashtable.length; i++) {
            No auxNo = hashtable[i];
            System.out.println(i + ":");
            while (auxNo != null) {
                System.out.println("   {" + auxNo.chave + "= " + auxNo.valor + "}");
                auxNo = auxNo.proximo;
            }
        }
    }
}
