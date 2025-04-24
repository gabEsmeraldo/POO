package aula2;

import java.util.Scanner;
public class Ola {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = scan.nextLine();
        System.out.println("Olá, " + nome + "!");
        scan.close();
    }
}
