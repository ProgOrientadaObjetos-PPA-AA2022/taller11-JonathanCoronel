/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALAI
 */
public abstract class Menu {

    protected String nomPlato;
    protected double valMenu;
    protected double valInicial;

    public Menu(String nomp, double valIni) {
        nomPlato = nomp;
        valInicial = valIni;
    }

    public void establecerNomPlato(String nompl) {
        nomPlato = nompl;
    }

    public abstract void calularValMenu();

    public void establecerValInicial(double valIn) {
        valInicial = valIn;
    }

    public String obtenerNomPlato() {
        return nomPlato;
    }

    public double obtenerValMenu() {
        return valMenu;
    }

    public double obtenerValInicial() {
        return valInicial;
    }
}
