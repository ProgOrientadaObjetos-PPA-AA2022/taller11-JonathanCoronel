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

    public Cuenta(String nomCl, ArrayList<Menu> men, double iv) {
        nomCliente = nomCl;
        menus = men;
        iva = iv;
    }

    public void establecerNomCliente(String nomCli) {
        nomCliente = nomCli;
    }

    public void establecerMenus(ArrayList<Menu> lista) {
        menus = lista;
    }

    public void calcularValCAncelarTotal() {
        valCancelarTotal = subtotal + (subtotal * iva) / 100;
    }

    public void calcularSubtotal() {
        for (int i = 0; i < menus.size(); i++) {
            subtotal = subtotal + menus.get(i).valMenu;
        }
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

    @Override
    public String toString() {
        String cadena = String.format("Factura\nNombre del Cliente: %s\n",
                 nomCliente);
        for (int i = 0; i < menus.size(); i++) {
            cadena = String.format("%s%s\n", cadena, menus.get(i));
        }
        cadena = String.format("%sSubtotal: %.1f\n"
                + "Iva: %.1f%%\n"
                + "Valor a cancelar total: %.3f\n",
                cadena,
                subtotal,
                iva,
                valCancelarTotal);
        return cadena;
    }

}
