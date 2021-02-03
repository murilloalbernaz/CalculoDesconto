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
public class DescontoDefinido extends Desconto{

    @Override
    public double aplicarDesconto(double valor) {
        //imagine que tenhamos um banco de dados predifinindo isso, e o codigo fica aqui, irei usar valor estatico somente para respresentação
        int percentualDesconto = 10;
        valor = valor -(valor *percentualDesconto/100);
        return valor;
    }
    
}
