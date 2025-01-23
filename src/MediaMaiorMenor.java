import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaMaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();

        System.out.println("Digite números (ou 'fim' para terminar):");

        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            try {
                double numero = Double.parseDouble(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número ou 'fim'.");
            }
        }

        if (numeros.isEmpty()) {
            System.out.println("Nenhum número foi fornecido.");
        } else {
            double soma = 0;
            double maior = numeros.get(0);
            double menor = numeros.get(0);

            for (double numero : numeros) {
                soma += numero;
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }

            double media = soma / numeros.size();
            System.out.printf("Média: %.2f%n", media);
            System.out.printf("Maior número: %.2f%n", maior);
            System.out.printf("Menor número: %.2f%n", menor);
        }

        scanner.close();
    }
}
