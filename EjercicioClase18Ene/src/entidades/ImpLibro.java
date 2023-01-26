package entidades;

public class ImpLibro implements Libro{

    @Override
    public void titulo() {
        System.out.println("Nombre: Juego de Tronos");
    }

    @Override
    public void cantPaginas() {
        System.out.println("Cantidad total de páginas: 694");
    }

    @Override
    public void autor() {
        System.out.println("Autor: George R.R. Martin");
    }
}
