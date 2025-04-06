/*
Lendy Naiara Carpio Pacheco - 10428525
Victor Reis da Silva - 10420297
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");
        String palavra = entrada.nextLine();

        try {
            Palindromo p = new Palindromo(palavra);
            if(p.verificar()) {
                System.out.println("E palindromo");
            } else {
                System.out.println("Nao e palindromo");
            }
        } catch(Exception e) {
            System.out.println("O texto não pode ser nulo");
        }
    }
}