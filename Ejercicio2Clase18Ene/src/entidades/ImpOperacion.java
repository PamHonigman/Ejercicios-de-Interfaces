package entidades;

import java.util.Scanner;

public class ImpOperacion implements Operacion, Suma{

    @Override
    public void saludar() {
        System.out.println("Hola! Vamos a realizar la operación:");
    }

    @Override
    public void tipoOperacion() {
        System.out.println("SUMA");
    }

    @Override
    public int operacion() {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el valor 1");
        int valor1 = in.nextInt();
        System.out.println("Ingrese el valor 2");
        int valor2 = in.nextInt();
        int resultado = valor1 + valor2;
        System.out.println("El resultado de la suma es = " + resultado);

        return resultado;
    }
}
