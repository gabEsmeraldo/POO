package aula2;
import java.util.Random;
public class questao03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = {0,0,0,0,0,0,0,0,0,0};
        for(int index = 0; index < 10; index++){
            vetor[index] = (random.nextInt(10000));
        }
        int menor = vetor[0];
        int maior = vetor[0];
        for(int i = 0; i < (vetor.length); i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        for(int i = 0; i < (vetor.length); i++){
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }
        System.out.println("O maior numero é " + maior);
        System.out.println("O menor numero é " + menor);
        for(int i = 0; i < 10; i++){
            System.out.print(vetor[i]+ " ");
        }
    }
}
