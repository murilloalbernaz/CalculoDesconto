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
public class DescontoProgressivo extends Desconto{

    @Override
    public double aplicarDesconto(double valor) {
        int percentualDesconto;
        percentualDesconto = (int) (valor/25);
        if(percentualDesconto <= 20){
            valor = valor - (valor*percentualDesconto/100);
        }else{
            valor = valor - (valor*20/100);
        }
        return valor;
    }
    
}
