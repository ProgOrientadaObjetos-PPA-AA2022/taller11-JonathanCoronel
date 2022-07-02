/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALAI
 */
public class MenuCarta extends Menu {

    private double valorGuarni;
    private double valorBebida;
    private double porcentajeAdi;

    public MenuCarta(String nomp, double valIni,
            double valorGu, double valorBe, double porAd) {
        super(nomp, valIni);
        valorGuarni = valorGu;
        valorBebida = valorBe;
        porcentajeAdi = porAd;
    }

    public void establecerValorGuarni(double valGu) {
        valorGuarni = valGu;
    }

    public void establecerValorBebida(double valBe) {
        valorBebida = valBe;
    }

    public void establecerPorcentajeAdi(double por) {
        porcentajeAdi = por;
    }

    @Override
    public void calularValMenu() {
        valMenu = valInicial + valorGuarni + valorBebida
                + ((valInicial * porcentajeAdi) / 100);
    }

    public double obtenerValorGuarni() {
        return valorGuarni;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdi() {
        return porcentajeAdi;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu a la Carta:\n\tPlato: %s\n"
                + "\tValor inicial: %.1f\n"
                + "\tValor guarnición: %.1f\n"
                + "\tValor bebida: %.1f\n"
                + "\tPorcentaje adicional: %.2f\n"
                + "\tValor del menú: %.2f\n",
                nomPlato,
                valInicial,
                valorGuarni,
                valorBebida,
                porcentajeAdi,
                valMenu);
        return cadena;
    }
}
