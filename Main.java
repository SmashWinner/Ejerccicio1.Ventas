// Created by: [Jael]
import Clases.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de ventas: ");

        Ventas ventas = new Ventas(scanner.nextInt());
        ventas.setVentas();
        System.out.print("Ingrese el valor de la venta mayor a buscar: ");
        ventas.verVentaMayorA(scanner.nextInt());
        scanner.close();
    }

}