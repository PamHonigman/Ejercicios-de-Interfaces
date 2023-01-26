package entidades;

import java.util.Scanner;

public class ImpVehiculo implements Auto, Moto{

    Scanner in = new Scanner(System.in).useDelimiter("\n");
    protected String marca;
    protected String marcaCubierta;
    protected int velocidad;
    protected String color;
    protected String patente;


    @Override
    public void marca() {
        System.out.println("Ingrese la marca");
        marca = in.nextLine();
    }

    @Override
    public void marcaCubierta() {
        System.out.println("Ingrese la marca de las cubiertas");
        marcaCubierta = in.next();
    }

    @Override
    public void velocidad() {
        System.out.println("Ingrese a qué velocidad va");
        velocidad = in.nextInt();
    }

    @Override
    public void color() {
        System.out.println("Ingrese el color");
        color = in.nextLine();
    }

    @Override
    public void patente() {
        System.out.println("Ingrese la patente");
        patente = in.next();
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Qué tipo de vehículo es? \n1)Auto \n2)Moto");
        int vehiculo = in.nextInt();

        switch (vehiculo){
            case 1:
                System.out.println("Vehículo: AUTO \nMarca: " + marca);
                break;
            case 2:
                System.out.println("Vehículo: MOTO \nMarca Cubierta: " + marcaCubierta);
                break;
        }

        System.out.println("Color: " + color + "\nVelocidad: " + velocidad + "km/h" + "\nPatente: " + patente);
    }
}


