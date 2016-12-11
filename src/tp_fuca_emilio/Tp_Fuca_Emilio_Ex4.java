/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_fuca_emilio;

import javax.swing.JOptionPane;

/**
 *  ARRAY
 * 
 * @author tss
 */
public class Tp_Fuca_Emilio_Ex4 {

    /**
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // dichiaro le variabili da utilizzare
        int tot_nomi = 0;                  // inizializzo la mia variabile che indica il totale degli input
        
        String report = "\n";               // dichiaro una variabile che userò per l'output dei dati inseriti
        
        
        // chiedo l'input all'utente
        String input = JOptionPane.showInputDialog("Quanti lanciatori ci sono?");  // chiedo l'input all'utente che mi indichi quanto deve essere grande nomi
        tot_nomi = Integer.parseInt(input);         // assegno alla mia variabile "tot_nomi" la grandezza indica dall'input utente
        
        // creo i miei contenitori dei dati (Array)
        String nomi[] = new String [tot_nomi];      // il mio Array nomi prenderà la grandezza assegnata alla variabile tot_nomi
        int lancio[] = new int [tot_nomi];
        
        // chiedo l'input all'utente
        for (int i = 0; i < nomi.length; i++) {
            //input = JOptionPane.showInputDialog("Nome lanciatore"); // vado a popolare il mio array nomi
            //nomi[i] = input;
            input = JOptionPane.showInputDialog("Quanto ha lanciato?"); // vado a popolare il mio array lancio
            lancio[i] = Integer.parseInt(input);
        }
        
        // elaboro i dati inseristi
        
        // inizio le varie elaborazioni necessarie (voto max, voto min, media, report)
        for (int i = 0; i < nomi.length; i++) {
            // ora mi creo un output di stampa che mi restituisca tutti i dati inseriti            
            report += (i + 1) + ") " + lancio[i] + "\n";
        }
        // faccio il controllo all'interno del mio array
            int max = 0;
            for (int i = 0; i < tot_nomi; i++) {
                // guardo un numero per volta e guardo se è il maggiore
                if (lancio[i] > max) {
                    max = lancio[i];
                }
            }
               
            int min = lancio[0];
            for (int i = 0; i < tot_nomi; i++) {
                // guardo un numero per volta e guardo se è il minore
                if (lancio[i] < min) {
                    min = lancio[i];
                }
            }
        
        // restituisco il risultato
        JOptionPane.showMessageDialog(null, report);        //visualizzo l'output richiesto dei dati inseriti
        JOptionPane.showMessageDialog(null, "Il lancio più lungo è di: " + " " + max);  // output del lancio migliore
        JOptionPane.showMessageDialog(null, "Il lancio più corto è di: " + " " + min); // output del lancio peggiore
         }
    
}

/*
4)
chiedere quanti lanciatori di peso
caricare array con i lanci di ognuno
alla fine stamparli uno per riga
presentare il lancio piu' lungo
presentare il lancio piu' corto
*/