
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, i, media, num, soma = 0;

        System.out.println("Digite quantos números para tirar a média :");
        n = scanner.nextInt();
        
        for (i = 1; i <= n; i = i + 1) {
            System.out.println("Digite um número: ");
            num = scanner.nextInt();
            soma = soma + num;
        }
        media = soma / n;
        System.out.println(media);
    }
}
