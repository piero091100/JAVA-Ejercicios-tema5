public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        System.out.println(cocheCrud.guardar());
        System.out.println(cocheCrud.buscar());
        System.out.println(cocheCrud.eliminar());
    }
}