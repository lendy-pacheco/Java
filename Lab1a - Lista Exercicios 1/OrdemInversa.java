import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("digite o " + (i + 1) + " numero inteiro: ");
            while (!scanner.hasNextInt()) { 
                System.out.println("entrada invalida. por favor, digite um numero inteiro.");
                scanner.next(); // 
            }
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("numeros na ordem inversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }        
        scanner.close();
    }
}
