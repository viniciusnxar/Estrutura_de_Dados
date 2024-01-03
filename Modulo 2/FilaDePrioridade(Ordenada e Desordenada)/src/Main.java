class Main {
    public static void main(String[] args) throws Exception {
        FilaPrioridadeDesordenada filaPrioridade = new FilaPrioridadeDesordenada();
    System.out.println("Desordenada");
    filaPrioridade.inserir(1, "Koa");
    filaPrioridade.inserir(6, "Suporta");
    filaPrioridade.inserir(3, "Mit");
    filaPrioridade.inserir(1, "Ichy");
    filaPrioridade.inserir(5, "Vatares");
    filaPrioridade.inserir(0, "Me");
    filaPrioridade.imprimirFila();

    System.out.println();
    filaPrioridade.removerMin();
    filaPrioridade.imprimirFila();
 
    System.out.println();
    System.out.println();


    FilaPrioridadeOrdenada filaPrioridade2 = new FilaPrioridadeOrdenada();
    System.out.println("Ordenada");
    filaPrioridade2.inserir(1, "Koa");
    filaPrioridade2.inserir(6, "Suporta");
    filaPrioridade2.inserir(3, "Mit");
    filaPrioridade2.inserir(1, "Ichy");
    filaPrioridade2.inserir(5, "Vatares");
    filaPrioridade2.inserir(0, "Me");
    filaPrioridade2.imprimirFila();

    System.out.println();

    filaPrioridade2.removerMin();
    filaPrioridade2.imprimirFila();
    }
}