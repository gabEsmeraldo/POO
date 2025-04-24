package aula3;

import java.util.Scanner;

public class PrincipalProcurar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o tamanho do array?");
        int tamanhoVetor = scan.nextInt();
        int[] numeros = new int[tamanhoVetor];
        for(int i = 0; i < tamanhoVetor; i++){
            System.out.println("Qual o numero da posição " + (i+1) + "?");
            numeros[i] = scan.nextInt();
        }
        System.out.println("Qual número você quer procurar?");
        int numeroProcurar = scan.nextInt();
        int count = 0;
        String presente ="";
        for(int i = 0; i < tamanhoVetor; i++){
            if(numeros[i] == numeroProcurar){
                count++;
            }
        }
        if(count > 0){
            presente = "O número está presente!";
        }else{
            presente = "O número não está presente!";
        }
        System.out.println(presente);
        scan.close();
    }
}
