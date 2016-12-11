/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_fuca_emilio;

import javax.swing.JOptionPane;

/**
 *  Convertitore di valuta
 * 
 * @author tss
 */
public class Tp_Fuca_Emilio_Ex1 {

    /**
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // dichiaro le variabili
        String input;
        
        double euro;
        double sterlina;
        double francoSvizzero;
        double dollaro;
        
        // chiedo l'input all'utente
        input = JOptionPane.showInputDialog("Quanto vale la Sterlina?");
        sterlina = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Quanto vale il Franco Svizzero?");
        francoSvizzero = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Quanto vale il Dollaro?");
        dollaro = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Quanto vuoi cambiare?");
        euro = Double.parseDouble(input);
        
        // faccio il calcolo della conversione dichiarando il tipo di dato che voglio
        double convS = euro * sterlina;
        double convF = euro * francoSvizzero;
        double convD = euro * dollaro;
        
        // chiedo l'output della mia elaborazione
        JOptionPane.showMessageDialog(null, "Il valore inserito in Euro corrisponde a: \n" + "Sterline: " + convS + "\n" 
                + "Franchi Svizzeri :" + convF + "\n" + "Dollari :" + convD);
    }
    
}

/* input output dichiarazioni variabili e calcoli
conversione nel tipo di dato corretto
programma sequenza semplice

chiedere il cambio della sterlina (vale 0.85)
chiedere il cambio del franco svizzero (vale 1.07)
chiedere il cambio del dollaro (vale 1.06)

chiedere l'importo della valuta da cambiare
*/