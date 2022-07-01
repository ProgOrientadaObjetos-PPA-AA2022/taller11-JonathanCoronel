/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALAI
 */
public class MenuNiños extends Menu {

    private double valorHelado;
    private double valorpastel;

    public MenuNiños(String nomp, double valIni, double valorHe,
            double valorPa) {
        super(nomp, valIni);
        valorHelado = valorHe;
        valorpastel = valorPa;
    }

    public void establecerValorHelado(double valHe) {
        valorHelado = valHe;
    }

    public void establecerValorPastel(double valPa) {
        valorpastel = valPa;
    }

    @Override
    public void calularValMenu() {
        valMenu = valInicial + valorHelado + valorpastel;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPorcentaje() {
        return valorpastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu de niños:\nNombre del Plato: %s\n"
                + "Valor inicial del menú: %.2f\n"
                + "Valor de porción de helado: %.2f\n"
                + "valor de porción de pastel: %.2f\n"
                + "Valor del menú: %.2f\n",
                nomPlato,
                valInicial,
                valorHelado,
                valorpastel,
                valMenu);
        return cadena;
    }
}
