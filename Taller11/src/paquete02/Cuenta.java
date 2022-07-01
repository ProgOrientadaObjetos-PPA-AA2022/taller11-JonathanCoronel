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

    public void establecerValCAncelarTotal() {
        valCancelarTotal = (subtotal * iva) / 100;
    }

    public void establecerSubtotal() {
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
        String cadena = String.format("Nombre del Cliente: %s\n"
                + "Lista de Menus:\n",
                nomCliente);
        for (int i = 0; i < menus.size(); i++) {
            cadena = String.format("%s%s\n", cadena, menus.get(i));
        }
        cadena = String.format("%s\nValor a cancelar total:%.2f\n"
                + "Subtotal\n"
                + "Iva: %.2f\n",
                cadena,
                valCancelarTotal,
                subtotal,
                iva);
        return cadena;
    }

}
