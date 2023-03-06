/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author facom
 */
public class Banco {

    // ContaBancaria conta1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int op = 0;
        ContaPoupanca contap = new ContaPoupanca(1224, 142, "Gabriel",4);
        ContaCorrente contac = new ContaCorrente(1225, 142, "Gabriel",4);

        do {
            System.out.println("\n====Sistema Bancario.====");
            menu();
            op = ler.nextInt();

            switch (op) {
                case 1:
                    System.out.println(contap.ImprimirSaldo());
                    break;
                case 2:
                    System.out.println(contac.ImprimirSaldo());
                    break;
                    
                    
            }

        } while (op != 0);

    }

    public static void menu() {
        System.out.println("[1] - Imprimir saldo conta corrente.");
        System.out.println("[2] - Imprimir saldo conta poupança.");
        System.out.println("[3] - Sacar valor conta corrente.");
        System.out.println("[4] - Sacar valor conta poupança.");
        System.out.println("[5] - Depositar valor conta corrente .");
        System.out.println("[6] - Depositar valor conta poupança .");
        System.out.print("Digite a opção: ");

    }
}
