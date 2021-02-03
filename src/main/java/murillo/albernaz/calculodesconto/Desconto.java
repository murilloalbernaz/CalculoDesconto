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
public abstract class Desconto {
    public final double calculoValorFinal(double valor){
        return aplicarDesconto(valor);
    };
    
    public abstract double aplicarDesconto(double valor);
}
