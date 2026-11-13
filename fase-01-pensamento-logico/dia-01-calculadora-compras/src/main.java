package app;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Garante o uso do ponto (.) como separador decimal na leitura
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE COMPRAS ===");

        System.out.print("Nome do produto: ");
        String produto = scanner.nextLine();

        System.out.print("Preço unitário (R$): ");
        double precoUnitario = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Percentual de desconto (%): ");
        double percentualDesconto = scanner.nextDouble();

        // Cálculos principais
        double subtotal = precoUnitario * quantidade;
        double valorDesconto = subtotal * (percentualDesconto / 100.0);
        double totalFinal = subtotal - valorDesconto;

        // Exibição formatada do resumo
        System.out.println("\n--- RESUMO DO PEDIDO ---");
        System.out.printf("Produto:     %s%n", produto);
        System.out.printf("Quantidade:  %d x R$ %.2f%n", quantidade, precoUnitario);
        System.out.printf("Subtotal:    R$ %.2f%n", subtotal);
        System.out.printf("Desconto:   -R$ %.2f (%.1f%%)%n", valorDesconto, percentualDesconto);
        System.out.printf("TOTAL FINAL: R$ %.2f%n", totalFinal);

        scanner.close();
    }
}