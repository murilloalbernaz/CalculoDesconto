/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murillo.albernaz.calculodesconto;

/**
 *
 * @author murillo
 */
public class mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DescontoAniversario d = new DescontoAniversario();
       Double valorFinal = d.calculoValorFinal(15000.0);
        System.out.println(valorFinal.toString());
    }
    
}
