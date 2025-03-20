import java.util.Scanner;

public class MetodosMaiorMenor{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = scanner.nextInt();
        int resultado1 = min(n1,n2);
        int resultado2 = max(n1,n2);
        System.out.println("Resultado do metodo min: "+ resultado1);
        System.out.println("Resultado do metodo max: "+ resultado2);

        scanner.close();
    }

    static int min(int n1, int n2){
        if(n1 < n2){
            return n1;
        }
        else{
            return n2;
        }
    }

    static int max(int n1, int n2){
        if(n1 > n2){
            return n1;
        }
        else{
            return n2;
        }
    }
}