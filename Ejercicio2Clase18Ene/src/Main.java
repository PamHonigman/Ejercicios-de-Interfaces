import entidades.ImpOperacion;

public class Main {
    public static void main(String[] args) {

        ImpOperacion operacion1 = new ImpOperacion();
        operacion1.saludar();
        operacion1.tipoOperacion();
        operacion1.operacion();
    }
}