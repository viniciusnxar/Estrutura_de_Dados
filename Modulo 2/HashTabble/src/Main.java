public class Main {
    public static void main(String[] args) {
        HashTable hashtable = new HashTable();

        // Inserção de elementos
        hashtable.inserir("chave1", 10);
        hashtable.inserir("chave2", 20);
        hashtable.inserir("chave3", 30);
        hashtable.inserir("chave4", 40);

        // Impressão da tabela
        hashtable.imprimirTabela();

        // Remoção de um elemento
        String chaveRemover = "chave2";
        Integer valorRemovido = hashtable.remover(chaveRemover);

        // Impressão da tabela após a remoção
        System.out.println("\nTabela apos remover a chave '" + chaveRemover + "':");
        hashtable.imprimirTabela();

        // Impressão das chaves restantes
        System.out.println("\nChaves restantes na tabela:");
        String[] chavesRestantes = hashtable.obterChaves();
        for (String chave : chavesRestantes) {
            System.out.println(chave);
        }
    }
}
