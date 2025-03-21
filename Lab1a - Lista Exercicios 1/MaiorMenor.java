/*
Lendy Naiara Carpio Pacheco - 10428525
Victor Reis da Silva - 10420297
*/
import java.util.Scanner;

public class MaiorMenor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
    
        for (int i = 0; i <numeros.length; i++){
            System.out.print("digite o " + i + " numero (use ponto para decimais): ");
            numeros[i] = scanner.nextDouble();
        }

        double maior = numeros[0]; 
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }

        double menor = numeros[0];  
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("o maior numero digitado foi: " + maior);
        System.out.println("o menor numero digitado foi: " + menor);
        
        scanner.close();
    }
}
