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
public class ContaBancaria {

    public int numero;
    private int senha;
    protected double saldo;
    public String nometitular;

    public ContaBancaria(int numero, int senha, String nome) {
        this.numero = numero;
        this.senha = senha;
        nometitular = nome;
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
    
    public void depositar(double valor)
    {
     saldo += valor;    
    }
    public String ImprimirSaldo()
    {
    return String.format("Seu saldo é de: %.2f",saldo);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean verificarsenha(int senha)
    {
    if(this.senha == senha)
        return true;
    
    return false;
    }
    
}
