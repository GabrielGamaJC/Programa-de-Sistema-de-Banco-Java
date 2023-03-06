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

    public ContaCorrente(int numero, int senha, String nome, double limite) {
        super(numero, senha, "Gabriel");
        limiteespecial =  limite;
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

}
