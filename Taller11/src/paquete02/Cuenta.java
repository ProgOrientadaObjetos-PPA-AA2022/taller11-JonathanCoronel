/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author SALAI
 */
public class Cuenta {

    private String nomCliente;
    private ArrayList<Menu> menus = new ArrayList<>();
    private double valCancelarTotal;
    private double subtotal;
    private double iva;

    public void establecerNomCliente(String nomCli) {
        nomCliente = nomCli;
    }

    public void establecerMenus(ArrayList<Menu> lista) {
        menus = lista;
    }

    public void establecerValCAncelarTotal(double valCanT) {
        valCancelarTotal = valCanT;
    }

    public void establecerSubtotal(double sub) {
        subtotal = sub;
    }

    public void establecerIva(double iv) {
        iva = iv;
    }

    public String obtenerNomCliente() {
        return nomCliente;
    }

    public ArrayList<Menu> obtenerMenus() {
        return menus;
    }

    public double obtenerValCAncelarTotal() {
        return valCancelarTotal;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerNomIva() {
        return iva;
    }

}
