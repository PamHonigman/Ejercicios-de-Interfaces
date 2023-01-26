package entidades;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class ImpBiblioteca implements Biblioteca{

    protected String nombre;
    protected String apellido;
    protected String titulo;
    protected int paginas;

    Scanner in = new Scanner(System.in).useDelimiter("\n");

    @Override
    public void crearAutor() {
        System.out.println("Ingrese el nombre del autor del libro");
        nombre = in.next();
        System.out.println("Ingrese el apellido del autor del libro");
        apellido = in.next();
    }

    @Override
    public void crearLibro() {
        System.out.println("Ingrese el título del libro");
        titulo = toUpperCase(in.next());
        System.out.println("Ingrese la cantidad de páginas del libro");
        paginas = in.nextInt();
    }

    public void mostrarLibro(){
        System.out.println("Título: " + titulo + "\nAutor: " + apellido + ", " + nombre + "\nCantidad de páginas: " +
                paginas);
    }
}
