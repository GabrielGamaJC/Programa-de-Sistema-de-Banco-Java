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
public class ContaPoupanca extends ContaBancaria {

    public double taxarendimento;

    public ContaPoupanca(int numero, int senha, double rendimento, ClientPF cliente) {
        super(numero, senha, cliente);
        taxarendimento = rendimento;

    }

    @Override
    public float getImposto() {
        return (float) (saldo * 0.01);
    }
    
    @Override
    public String toString() {
        return String.format("Nome titular: %s" + "\nSeu saldo é de: %.2f" + "\nNumero da conta: %d" + "\nTaxa de rendimento: %.2f",cliente.nometitular, saldo, numero,taxarendimento);

    }

}
