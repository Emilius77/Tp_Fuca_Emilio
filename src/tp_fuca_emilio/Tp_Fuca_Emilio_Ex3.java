/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_fuca_emilio;

import javax.swing.JOptionPane;

/**
 *  
 * 
 * @author tss
 */
public class Tp_Fuca_Emilio_Ex3 {

    /**
     * Cicli WHILE
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // dichiaro le variabili da utilizzare
        String input = "";
        String risultato = "Elenco vetture \n";
        
        
        boolean fine = false;        
        
        // chiedo l'input all'utente
        
        
        // elaboro i dati inseristi
        while (fine == false) {
            input = JOptionPane.showInputDialog("Inserire l'elenco delle autovetture");
            if (input.equalsIgnoreCase("fine")) // non fa differenza tra Maiuscole e minuscole
                        {
                            fine = true;
                        } else {
                
                risultato = risultato + "#" + (input) + "\n";   //questa forma di aggregazione mi è ancora poco chiara
            }
        } 
        
        // restituisco il risultato
        JOptionPane.showMessageDialog(null, risultato);
        
         }
    
}

/*
3) cicli no array while

chiedere 5 nomi di auto [o usare frase exit per terniare prima]
preparando un report e poi stamparlo

es.
ford, fiat,ferrari,honda,opel

report
1# ford
2# fiat
3# ferrari
4# honda
5# opel
*/