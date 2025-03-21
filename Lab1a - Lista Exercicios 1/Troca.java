/*
Lendy Naiara Carpio Pacheco - 10428525
Victor Reis da Silva - 10420297
*/
import java.util.Scanner;

public class Troca{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = scanner.nextInt();

        int aux;
        aux = n1;
        n1 = n2;
        n2 = aux;
        System.out.println("Troca realizada: "+ n1 + " " + n2);
        scanner.close();      
    }
}
