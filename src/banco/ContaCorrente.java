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
public class ContaCorrente extends ContaBancaria {

    public double limiteespecial;

    public ContaCorrente(int numero, int senha, double limite, ClientePJ cliente) {
        super(numero, senha, cliente);
        limiteespecial = limite;

    }

    @Override
    public boolean sacar(double valor, int senha) {
        if (verificarsenha(senha)) {
            if ((saldo > 0 && saldo > valor) || (limiteespecial > 0 && valor < limiteespecial)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public float getImposto() {
        return (float) (saldo * 0.01);
    }
    
    @Override
    public String toString() {
        return String.format("Nome titular: %s" + "\nSeu saldo é de: %.2f" + "\nNumero da conta: %d" + "\nLimite especial: %.2f",cliente.nometitular, saldo, numero,limiteespecial);

    }

}
