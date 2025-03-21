/*
Lendy Naiara Carpio Pacheco - 10428525
Victor Reis da Silva - 10420297
*/
import java.util.Scanner;

public class VogalConsoante{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = scanner.nextLine();

        String[] vogais = {"a", "e", "i", "o", "u","A","E","I","O","U"};
        String[] consoantes = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z","B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Y","Z"};
        int i;
        for(i = 0; i < vogais.length; i++){
            if(vogais[i].equals(letra)){
                System.out.println("A letra " + letra + " é uma vogal");
            }
        }
        for(i = 0; i < consoantes.length; i++){
            if(consoantes[i].equals(letra)){
                System.out.println("A letra " + letra + " é uma consoante");
            }
        }
        scanner.close();
    }
}
