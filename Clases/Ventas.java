package Clases;
import java.util.Scanner;

public class Ventas{
    double ventas[];
    Scanner scanner = new Scanner(System.in);

    public Ventas(int v){
        this.ventas = new double[v];
    }



    public void setVentas(){
        for(int i = 0; i < ventas.length; i++){
            System.out.print("Ingrese la venta numero: " + (i + 1) + ": ");
            setVentas(i, getScanner());
        }
    }

    public void verVentaMayorA(int c){
        int k = 0;
        int total = 0;
        while(k < ventas.length){
            if(ventas[k] > c){
                System.out.println("La venta numero " + (k + 1) + " es mayor a " + c + " Teniendo un valor de :" + ventas[k]);
                total++;
            }
            k++;
        }
        System.out.println("El total de ventas mayores a " + c + " es: " + total);
    }

    public void setVentas(int lugar, double venta){
    ventas[lugar] = venta;
    }

    public double getScanner(){
        double venta = scanner.nextDouble();
        return venta;
    }

    public double getVenta(int lugar){
        double venta = ventas[lugar];
        return venta;
    } 



}