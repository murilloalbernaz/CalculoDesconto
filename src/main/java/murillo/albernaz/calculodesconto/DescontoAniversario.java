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
public class DescontoAniversario extends Desconto{
    @Override
    public double aplicarDesconto(double valor) {
        valor = valor * 0.85;
        return valor;
    }
    
}
