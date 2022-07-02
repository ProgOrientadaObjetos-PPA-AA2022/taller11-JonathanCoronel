/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Menu;
import paquete02.MenuNiños;
import paquete02.MenuEconomico;
import paquete02.MenuDia;
import paquete02.MenuCarta;
import paquete02.Cuenta;

/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Menu> listaMenus = new ArrayList<>();

        MenuNiños men1 = new MenuNiños("Niños 01", 2, 1, 1.5);
        MenuNiños men2 = new MenuNiños("Niños 02", 3, 1, 1.5);
        MenuEconomico menec = new MenuEconomico("Econo 001", 4, 25);
        MenuDia mend = new MenuDia("Dia 001", 5, 1, 1);
        MenuCarta mec = new MenuCarta("Carta001", 6, 1.5, 2, 10);

        listaMenus.add(men1);
        listaMenus.add(men2);
        listaMenus.add(menec);
        listaMenus.add(mend);
        listaMenus.add(mec);
        for (int i = 0; i < listaMenus.size(); i++) {
            listaMenus.get(i).calularValMenu();
        }

        Cuenta cuenta1 = new Cuenta("René Elizalde", listaMenus, 10);
        cuenta1.calcularSubtotal();
        cuenta1.calcularValCAncelarTotal();
        System.out.printf("%s\n", cuenta1);

    }

}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50
        
Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

 */
