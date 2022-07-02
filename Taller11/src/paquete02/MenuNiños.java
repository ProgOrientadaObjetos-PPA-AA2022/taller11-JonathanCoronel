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
        String cadena = String.format("Menu de niños:\n\tPlato: %s\n"
                + "\tValor inicial: %.2f\n"
                + "\tValor helado: %.2f\n"
                + "\tValor pastel: %.2f\n"
                + "\tValor del menú: %.2f\n",
                nomPlato,
                valInicial,
                valorHelado,
                valorpastel,
                valMenu);
        return cadena;
    }
}
