package aula4.questao1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Insira os dados do aluno:");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        aluno.setNome(nome);
        System.out.print("Matricula: ");
        int matricula = scan.nextInt();
        aluno.setMatricula(matricula);
        System.out.println("Quantas notas o aluno possui?");
        int qntdNotas = scan.nextInt();
        double notas[] = new double[qntdNotas];
        for(int i = 0; i<qntdNotas; i++){
            System.out.print("Qual a " + (i+1) + "ª nota? ");
            notas[i] = scan.nextDouble();
            if(notas[i] >= 0 && notas[i] <= 10){
                aluno.setNotas(notas);
            }else{
                System.out.println("Não é possível adicionar esta nota, tente novamente.");
                double[] zerarNotas = {0.0}; 
                aluno.setNotas(zerarNotas);
                break;
            }           
        }
        aluno.exibirInformacoes();
        aluno.adicionarNota(5.0);
        aluno.calcularMedia();
        scan.close();
    }
}
