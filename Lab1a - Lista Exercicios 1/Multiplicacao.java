import java.util.Scanner;

public class Multiplicacao{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float num1 = scanner.nextFloat();
        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();
        float resultado = mulComAdicao(num1, num2);
        System.out.println("Resultado: "+ resultado);

        scanner.close();
    }

    static float mulComAdicao(float num1, int num2){
        if(num2 == 0){
            return 0;
        }
        else{
            return num1 + mulComAdicao(num1, num2 -1);
        }
    }
}
