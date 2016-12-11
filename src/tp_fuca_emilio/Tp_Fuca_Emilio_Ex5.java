/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_fuca_emilio;

import javax.swing.JOptionPane;

/**
 *  Metodi
 * 
 * @author tss
 */
public class Tp_Fuca_Emilio_Ex5 {

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
        
        double ivaItalia;
        double ivaUsa;
        double prezzo;
        
        // chiedo l'input all'utente
        input = JOptionPane.showInputDialog("Quanto vale la Sterlina?");
        sterlina = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Quanto vale il Franco Svizzero?");
        francoSvizzero = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Quanto vale il Dollaro?");
        dollaro = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Importo in Euro da cambiare?");
        euro = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Di quale importo vuoi conoscere il prezzo al \n "
                + "netto dell'imposta?");
        prezzo = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("A quanto corrisponde l'Iva in Italia?");
        ivaItalia = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("A quanto corrisponde l'Iva in Usa?");
        ivaUsa = Double.parseDouble(input);
        
        // elaboro i dati inseristi
        double convSterlina = cambioSterlina(euro, sterlina);
        double convFranco = cambioFranco(euro, francoSvizzero);
        double convDollaro = cambioDollaro(euro, dollaro);
        
        double scorporoIvaItalia = scIvaItalia(prezzo, ivaItalia);
        double scorporoIvaUsa = scIvaUsa(prezzo, ivaUsa);
        
        // restituisco il risultato
        JOptionPane.showMessageDialog(null, "Il valore inserito in Euro corrisponde a: \n" + "\n" + "Sterline: " 
                + convSterlina + "\n" + "Franchi Svizzeri :" + convFranco + "\n" + "Dollari :" + convDollaro);
        JOptionPane.showMessageDialog(null, "Il valore inserito corrisponde a: \n" + "\n" + "Iva Italia: " 
                + ivaItalia + "% - prezzo netto " + scorporoIvaItalia + "\n" + "Iva Usa: " + ivaUsa + "% - prezzo netto " 
                + scorporoIvaUsa + "\n");
         }
    
    static double cambioSterlina (double euro, double sterlina) {
        double risSterlina;
        risSterlina = euro / sterlina;
        risSterlina = Math.round(risSterlina * 100);
        risSterlina = risSterlina / 100;
        return risSterlina;
    }
    static double cambioFranco (double euro, double francoSvizzero) {
        double risFranco = 0;
        risFranco = euro / francoSvizzero;
        risFranco = Math.round(risFranco * 100);
        risFranco = risFranco / 100;
        return risFranco;
    }
    static double cambioDollaro (double euro, double dollaro) {
        double risDollaro = 0;
        risDollaro = euro / dollaro;
        risDollaro = Math.round(risDollaro * 100);
        risDollaro = risDollaro / 100;
        return risDollaro;
    }
    static double scIvaItalia(double prezzo, double ivaItalia) {
        ivaItalia = ((100 * prezzo) / (100 + ivaItalia));  // in questo caso 122 equivale al totale + iva (22 %)
        ivaItalia = Math.round(ivaItalia * 100);
        ivaItalia = ivaItalia / 100;
        return ivaItalia;
    }
    static double scIvaUsa(double prezzo, double ivaUsa) {
        ivaUsa = ((100 * prezzo) / (100 + ivaUsa));  // in questo caso 105 equivale al totale + iva (5 %)
        ivaUsa = Math.round(ivaUsa * 100);
        ivaUsa = ivaUsa / 100;
        return ivaUsa;
    }

}

/*
5)
creazione metodi

riprendere esercizio 1)

e creare metodo per fare il cambio
con parametri importo e cambio odierno
aggiungere metodi estrarre iva 
esempio 
importo 122 euro
calcoloivaitalia con 22% ritorna 100 (100+22=122)

calcolo_ivaItalia (22%)
calcolo_ivaUsa (5%)
*/