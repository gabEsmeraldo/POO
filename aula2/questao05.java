package aula2;
import java.util.Random;
public class questao05 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[3][3];
        for(int lines = 0; lines < 3; lines++){
            for(int col = 0; col < 3; col++){
                matrix[lines][col] = (random.nextInt(100));
            }
        }
        /*for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }*/
        for(int i = 0; i < 3; i++){
            int sum = 0;
            for(int j = 0; j < 3; j++){
                sum += matrix[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + sum);
        }
    }
}
