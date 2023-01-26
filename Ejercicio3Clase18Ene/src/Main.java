import entidades.ImpVehiculo;

public class Main {
    public static void main(String[] args) {
        ImpVehiculo auto = new ImpVehiculo();
        auto.marca();
        auto.color();
        auto.velocidad();
        auto.patente();
        auto.mostrarDatos();

        System.out.println("");

        ImpVehiculo moto = new ImpVehiculo();
        moto.color();
        moto.patente();
        moto.velocidad();
        moto.marcaCubierta();
        moto.mostrarDatos();


    }
}