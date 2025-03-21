/*
Lendy Naiara Carpio Pacheco - 10428525
Victor Reis da Silva - 10420297
*/
import java.util.Scanner;

public class ContarVogais {
    public static int contarVogais(String texto) {
        int contador = 0;
        texto = texto.toLowerCase(); 
        for (char c : texto.toCharArray()) { 
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();
        System.out.println("Quantidade de vogais: " + contarVogais(texto));

        scanner.close();
    }
}
