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
public class ContaBancaria implements tributavel {

    public int numero;
    protected int senha;
    protected double saldo;
    protected Cliente cliente;

    public ContaBancaria(int numero, int senha, Cliente cliente) {
        this.numero = numero;
        this.senha = senha;
        this.cliente = cliente;

    }

    public boolean sacar(double valor, int senha) {

        if (this.senha == senha) {
            if (saldo > 0 && saldo > valor) {
                saldo -= valor;
                return true;
            }
        }
        return false;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Foi depositado " + valor);
    }

    public String ImprimirSaldo() {
        return String.format("Seu saldo é de: %.2f", saldo);
    }
    
     public static String ImprimirSaldo(ContaBancaria conta) {
        return String.format("Seu saldo é de: %.2f", conta.saldo);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean verificarsenha(int senha) {
        if (this.senha == senha) {
            return true;
        }

        return false;
    }

    public String toString() {
        return String.format("Nome titular: %s" + "\nSeu saldo é de: %.2f" + "\nNumero da conta: %d",cliente.nometitular, saldo, numero);

    }

    public float getImposto() {
        return (float) (saldo * 0.01);
    }

}
