package aula2;

public class questao04 {
    public static void main(String[] args) {
        char[][] matrix = new char[4][4];
        char ch1 = 'a';
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matrix[i][j] = ch1++;
            }
        }
        for(int lines = 0; lines < 4; lines++){
            for(int col = 0; col < 4; col++){
                System.out.print(matrix[lines][col] + " ");
            }
            System.out.println();
        }
    }
}
