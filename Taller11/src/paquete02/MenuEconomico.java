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
        descuento = (valInicial * descuento) / 100;
    }

    @Override
    public void establecerValMenu() {
        valMenu = valInicial - descuento;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del Plato: %s\n"
                + "Valor inicial del menú: %.2f\n"
                + "Porcentaje de descuento, en referencia al valor inicial del "
                + "menú: %.2f\n"
                + "Valor del menú: %.2f\n",
                nomPlato,
                valInicial,
                descuento,
                valMenu);
        return cadena;
    }
}
