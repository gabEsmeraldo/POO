package aula3;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o tamanho do array?");
        int tamanhoVetor = scan.nextInt();
        int[] numeros = new int[tamanhoVetor];
        for(int i = 0; i < tamanhoVetor; i++){
            System.out.println("Qual o numero da posição " + (i+1) + "?");
            numeros[i] = scan.nextInt();
        }
        System.out.print("Números presentes no array: ");
        for(int s = 0; s < tamanhoVetor; s++){
            System.out.print(numeros[s] + " ");
        }
        scan.close();
    }
}