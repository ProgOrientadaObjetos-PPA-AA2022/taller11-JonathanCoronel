/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALAI
 */
public class MenuEconomico extends Menu {

    private double descuento;

    public MenuEconomico(String nomp, double valIni, double des) {
        super(nomp, valIni);
        descuento = des;
    }

    public void establecerDescuento(double des) {
        descuento = des;
    }

    @Override
    public void calularValMenu() {
        valMenu = valInicial - (valInicial * descuento) / 100;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico:\n\tPlato: %s\n"
                + "\tValor inicial: %.2f\n"
                + "\tPorcentaje descuento: %.2f\n"
                + "\tValor del menú: %.2f\n",
                nomPlato,
                valInicial,
                descuento,
                valMenu);
        return cadena;
    }
}
