/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALAI
 */
public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nomp, double valIni, double valPos, double valorBe) {
        super(nomp, valIni);
        valorPostre = valPos;
        valorBebida = valorBe;
    }

    public void establecerValorPostre(double valPos) {
        valorPostre = valPos;
    }

    public void establecerValorBebida(double valBe) {
        valorBebida = valBe;
    }

    @Override
    public void calularValMenu() {
        valMenu = valInicial + valorPostre + valorBebida;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu del Dia:\n\tPlato: %s\n"
                + "\tValor inicial: %.2f\n"
                + "\tValor postre: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tValor del menú: %.2f\n",
                nomPlato,
                valInicial,
                valorPostre,
                valorBebida,
                valMenu);
        return cadena;
    }
}
