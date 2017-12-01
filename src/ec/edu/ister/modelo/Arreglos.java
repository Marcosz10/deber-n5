package ec.edu.ister.modelo;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author ariel
 */
public class Arreglos {

    private int arrayTemperaturas[];

    public void dimensionar() {
        int dim = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantas temperaturas"));
        arrayTemperaturas = new int[dim];
    }

    public int tamaño() {
        return arrayTemperaturas.length;
    }

    public void llenarArreglo() {
        for (int i = 0; i < tamaño(); i++) {
            arrayTemperaturas[i] = (int) (Math.random() * 10);

        }
    }

    public void imprimir() {
        String acu = "";
        for (int i = 0; i < arrayTemperaturas.length; i++) {
            acu += " " + arrayTemperaturas[i];
        }
        JOptionPane.showMessageDialog(null, acu);
    }

    public void imprimirFacil() {

        JOptionPane.showMessageDialog(null, Arrays.toString(arrayTemperaturas));

    }

    public void ordenar() {
        Arrays.sort(arrayTemperaturas);
    }

     public  void menu(){
    
    int opcion;
    
    do {   
        
       opcion=Integer.parseInt( JOptionPane.showInputDialog("escoger opcion \n\n"
               + "    MENU   \n\n"
               + "1.- DIMENSIONAR \n"
               + "2.- LLENAR ARREGLO\n"
               + "3.- IMPRIMIR FACIL\n"
               + "4.- ORDENAR\n"
               + "5.- SALIR....\n\n"));
        
       switch(opcion){
           
           case 1:
               dimensionar();
               break;
           case 2:
               llenarArreglo();
               break;
           case 3:
               imprimir();
               break;
           case 4:
               ordenar();
               break;
           case 5:
               JOptionPane.showMessageDialog(null, "Fin del programa");
            
       }       
    }while (opcion!=5); 
}
    
        
}