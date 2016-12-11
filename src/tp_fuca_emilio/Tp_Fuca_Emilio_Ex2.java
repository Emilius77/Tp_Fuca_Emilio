/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_fuca_emilio;

import javax.swing.JOptionPane;

/**
 *  Utilizzo IF
 * 
 * @author tss
 */
public class Tp_Fuca_Emilio_Ex2 {

    /**
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // dichiaro le variabili da utilizzare
        String input;
        int versMin;
        int versamento;
        
        // chiedo l'input all'utente
        input = JOptionPane.showInputDialog("Impostare il versamento minimo");  //chiedo l'input che serve per inizializzare la mia variabile
        versMin = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Quanto vuoi versare?");  //chiedo l'input che serve per inizializzare la mia variabile
        versamento = Integer.parseInt(input);
        
        // elaboro i dati inseristi
        if (versamento > versMin) {
            JOptionPane.showMessageDialog(null, "Versamento Accettato \n" + "Hai versato: " + versamento);
        } else {
            JOptionPane.showMessageDialog(null, "Versamento RIFIUTATO \n" + "Il versamento minimo è di: " + versMin);
        }
        
        // restituisco il risultato
        JOptionPane.showMessageDialog(null, "Grazie ed Arrivederci"); // eseguo un output finale anche se quello del mio risultato fa già parte dell'elaborazione
        
         }
    
}

/* 2) sequenza con alternative
chiedere un minimo importo da versare
chiedere un importo da versare
presentare un report che indichi
es: 
minimo 50 
verso 45
report
versamento di 45 non accettato - minimo 50
*/