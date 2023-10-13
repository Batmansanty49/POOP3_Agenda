/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3_agenda;
/**
 * Bibliotecas utilizadas en el programa
 */
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * @author Ruiz Ramírez Santiago
 * Clase que realiza una agenda guardando datos del contacto
 */
public class POOP3_Agenda {

    /**
     * @param args the command line arguments
     * Funcion main
     */
    public static void main(String[] args) {
        System.out.println("\n----Ejercicio 2");
        System.out.println("\nInstrucciones: Realizar una agenda con 5 registros guardando nombre de persona y su cumpleaños usando Hashtable y Calendar e imprimir todos los elementos.");
        System.out.println("\n     >> AGENDA <<");
        Hashtable<String, Calendar> agenda = new Hashtable<String, Calendar>();
        
        /**
         * Agrega las fechas de cumpleaños de cada contacto
         */
        Calendar cumplea = Calendar.getInstance();
        cumplea.set(Calendar.MONTH, Calendar. OCTOBER);
        cumplea.set(Calendar. DAY_OF_MONTH, 17);
        
        Calendar cumpleb = Calendar.getInstance();
        cumpleb.set(Calendar.MONTH, Calendar. JUNE);
        cumpleb.set(Calendar. DAY_OF_MONTH, 1);
        
        Calendar cumplec = Calendar.getInstance();
        cumplec.set(Calendar.MONTH, Calendar. SEPTEMBER);
        cumplec.set(Calendar. DAY_OF_MONTH, 21);
        
        Calendar cumpled = Calendar.getInstance();
        cumpled.set(Calendar.MONTH, Calendar. OCTOBER);
        cumpled.set(Calendar. DAY_OF_MONTH, 20);
        
        Calendar cumplee = Calendar.getInstance();
        cumplee.set(Calendar.MONTH, Calendar. MAY);
        cumplee.set(Calendar. DAY_OF_MONTH, 17);
        
        /**
         * Añade los nombres a los contactos y se les asigna su respectiva fecha de cumpleaños
         */
        agenda.put("Maia Hernandez ", cumplea);
        agenda.put("Maria Bermudez ", cumpleb);
        agenda.put("Federico Rivas ", cumplec);
        agenda.put("Amparo Ramirez ", cumpled);
        agenda.put("Alejandro Ruiz", cumplee);
       
        /**
         * Imprime los datos de la agenda
         */
        Enumeration<String> nombres = agenda.keys ();
        
        SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yyyy");
        while (nombres.hasMoreElements())
        {
            String nombre = nombres.nextElement();
            Calendar cumpleaños = agenda.get(nombre);
            System.out.println("\nPersona: " + nombre + "\nCumpleaños: "+ fecha.format(cumpleaños.getTime()));
        }
    }
    
}
