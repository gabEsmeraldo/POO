package aula2;
import java.util.Scanner;
import java.util.Random;
public class questao02 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int[] vetor = {0,0,0,0,0,0,0,0,0,0};
        for(int index = 0; index < 10; index++){
            vetor[index] = (random.nextInt(100));
        }
        System.out.println("Qual o numero que deseja procurar?");
        int numberSearch = scan.nextInt();
        int count = 0;
        int i = 0;
        while(i < (vetor.length)){
            if(vetor[i] == numberSearch){
                count++;
                break;
            }
            i++;
        }
        if(count != 0){
            System.out.println("O numero esta presente no indice " + i);
        } else{
            System.out.println("O numero não esta presente.");
        }
        scan.close();
    }
}
