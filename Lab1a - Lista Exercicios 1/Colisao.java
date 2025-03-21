import java.util.Scanner;
public class Colisao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a posição para p1(x,y)");
        System.out.print("x: ");
        double x1 = scanner.nextDouble();
        System.out.print("y: ");
        double y1 = scanner.nextDouble();
        System.out.print("Informe o raio: ");
        double raio1 = scanner.nextDouble();
        System.out.println("Informe a posição para p2(x,y)");
        System.out.print("x: ");
        double x2 = scanner.nextDouble();
        System.out.print("y: ");
        double y2 = scanner.nextDouble();
        System.out.print("Informe o raio: ");
        double raio2 = scanner.nextDouble();
        boolean sobreposicao = haColisaoEntreCirculos(x1, y1, raio1, x2, y2, raio2);

        if (sobreposicao) {
            System.out.println("Os círculos colidem.");
        } else {
            System.out.println("Os círculos não colidem.");
        }
        scanner.close();
    }

    static boolean haColisaoEntreCirculos(double x1, double y1, double raio1, double x2, double y2, double raio2){
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double somaRaios = raio1 + raio2;
        return somaRaios >= distancia;
    }
}
