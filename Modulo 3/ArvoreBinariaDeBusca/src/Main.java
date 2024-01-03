public class Main {
    public static void main(String[] args) throws Exception {
        ArvoreBinariaDeBusca abb = new ArvoreBinariaDeBusca();

        abb.inserirRecursivo(47);
        abb.inserirRecursivo(23);
        abb.inserirRecursivo(15);
        abb.inserirRecursivo(80);
        abb.inserirRecursivo(33);
        abb.inserirRecursivo(60);
        abb.inserirRecursivo(35);
        abb.inserirRecursivo(27);
        abb.mostrarOrdem();
        System.out.println(abb.contemRecursivo(60));
        abb.mostrarOrdem();
    }
}
