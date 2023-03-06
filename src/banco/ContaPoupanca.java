/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author facom
 */
public class ContaPoupanca extends ContaBancaria{
    
    public double taxarendimento;
    public ContaPoupanca(int numero, int senha, String nome, double rendimento)
    {
    super(numero,senha,nome);
    taxarendimento = rendimento;
    }
    
}
