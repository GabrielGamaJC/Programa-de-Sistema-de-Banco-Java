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
        double valor;
        int senha;
        int op = 0;

        ClientePJ clientepj = new ClientePJ("Gabriel", "422178");
        ClientPF clientepf = new ClientPF("Gabriel", "12170825");
        ContaPoupanca contap = new ContaPoupanca(1224, 142, 4, clientepf);
        ContaCorrente contac = new ContaCorrente(1225, 142, 4, clientepj);

        do {
            System.out.println("\n====Sistema Bancario.====");
            menu();
            op = ler.nextInt();

            switch (op) {
                case 1:
                    System.out.println(contac.ImprimirSaldo());
                    break;
                case 2:
                    System.out.println(contap.ImprimirSaldo());
                    break;
                case 3:

                    System.out.print("Digite o valor a ser sacado: ");
                    valor = ler.nextDouble();
                    System.out.print("Digite a senha: ");
                    senha = ler.nextInt();
                    if (contac.sacar(valor, senha)) {
                        System.out.println("Dinheiro sacado");
                    } else {
                        System.out.println("Senha invalida ou não possuir valor");
                    }
                    break;

                case 4:
                    System.out.print("Digite o valor a ser sacado: ");
                    valor = ler.nextDouble();
                    System.out.print("Digite a senha: ");
                    senha = ler.nextInt();
                    if (contap.sacar(valor, senha)) {
                        System.out.println("Dinheiro sacado");
                    } else {
                        System.out.println("Senha invalida ou não possuir valor");
                    }
                    break;

                case 5:
                    System.out.print("Digite o valor a depositado: ");
                    valor = ler.nextDouble();
                    contac.depositar(valor);

                    break;

                case 6:
                    System.out.print("Digite o valor a depositado: ");
                    valor = ler.nextDouble();
                    contap.depositar(valor);

                    break;

                case 7:
                    System.out.println(contac.toString());

                    break;
                case 8:
                    System.out.println(contap.toString());

                    break;
                case 9:
                    System.out.println(ContaBancaria.ImprimirSaldo(contap));

                    break;

                case 10:
                    ContaBancaria.ImprimirSaldo(contac);

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
        System.out.println("[7] - Imprimir Dados  conta poupança .");
        System.out.println("[8] - Imprimir Dados conta corrente ");
        System.out.println("[9] - Imprimir saldo static conta poupança .");
        System.out.println("[10] - Imprimir saldo static conta corrente ");
        System.out.print("Digite a opção: ");

    }
}
