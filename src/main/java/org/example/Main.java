package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String formatado;
        double saldo = 0;
        double saque = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    saldo = scanner.nextDouble();
                    formatado = String.format("%.1f", saldo);
                    System.out.println("Saldo atual: " + formatado);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    saque = scanner.nextDouble();
                    if(saque > saldo)
                        System.out.println("Saldo insuficiente.");
                    if(saque <= saldo){
                        saldo = saldo - saque;
                        formatado = String.format("%.1f", saldo);
                        System.out.println("Saldo atual: " + formatado);
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    formatado = String.format("%.1f", saldo);
                    System.out.println("Saldo atual: " + formatado);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}