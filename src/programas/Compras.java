/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
 *
 * @author Master PC
 */
public class Compras {
    public static void main(String[] args) {

        // Datos del cliente
        String nombreCliente = "FRANK";

        // Compras realizadas
        double compra1 = 100.0;
        double compra2 = 200.0;
        double compra3 = 300.0;

        // Cálculos
        double totalCompras = compra1 + compra2 + compra3;
        double promedioCompras = totalCompras / 3;

        // Resultados
        System.out.println("Nombre del cliente : " + nombreCliente);
        System.out.println("Total compras      : " + totalCompras);
        System.out.println("Promedio compras   : " + promedioCompras);
    }
}
