import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
  /*  Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
  Você receberá 1 valor inteiro N, onde N > 0.
  Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
   */