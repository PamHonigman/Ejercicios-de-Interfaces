import entidades.ImpBiblioteca;

public class Main {
    public static void main(String[] args) {
        ImpBiblioteca libro1 = new ImpBiblioteca();
        libro1.crearLibro();
        libro1.crearAutor();
        libro1.mostrarLibro();

        System.out.println("");

        ImpBiblioteca libro2 = new ImpBiblioteca();
        libro2.crearLibro();
        libro2.crearAutor();
        libro2.mostrarLibro();

        System.out.println("");

        ImpBiblioteca libro3 = new ImpBiblioteca();
        libro3.crearLibro();
        libro3.crearAutor();
        libro3.mostrarLibro();
    }
}