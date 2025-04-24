package aula4.questao1;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;

    /* public Aluno(){
        nome = "";
        matricula = 0;
        notas = new double[] {-1.1, -1.1, -1.1, -1.1, -1.1, -1.1, -1.1, -1.1, -1.1};
        notas[100] = {0.0};
    }*/
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double[] getNotas() {
        return notas;
    }

    public void adicionarNota(double nota){
        if(nota >= 0 && nota <= 10){
            /* for(int i = 0; i < notas.length; i++){
                if(notas[i] < 0){
                    notas[i] = nota;
                    System.out.println("adicionando nota " + nota + " no numero " + i);
                    break;
                }
            } */
            notas = addToArray(notas.length, notas, nota);
            System.out.print("Notas após adição: ");
        for(int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }
        System.out.println();
        }else {
            System.out.println("Não é possivel adicionar essa nota.");
        }        
    }

    public void calcularMedia(){
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double media;
        int i = 0;
        if(notas.length >= 3){
            System.out.println("O aluno possui 3 ou mais notas \nDeseja remover a menor nota antes de calcular a media? \n(0/1)");
            int resposta = scan.nextInt();
            if(resposta == 1){
                int index = checkMenorNota(notas);
                notas = removerMenorNota(notas, index);
            }
        }
        while( i < notas.length){
            sum+= notas[i];
            i++;
        }
        media = sum/i;
        System.out.printf("A media do aluno é: %.2f\n", media);
        scan.close();
    }
    
    public int checkMenorNota(double[] notas){
        double notaBase = 10.1;
        int index = -1;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] < notaBase){
                notaBase = notas[i];
                index = i;
            }
        }
        return index;
    }

    public static double[] removerMenorNota(double[] arr, int in) {

        if (arr == null || in < 0 || in >= arr.length) {
            return arr;
        }

          double[] arr2 = new double[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == in)
                continue;
            
              arr2[k++] = arr[i];
        }

        return arr2;
    }

    public void exibirInformacoes(){
        double notas[] = getNotas();
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.print("Notas: ");
        for(int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }
        System.out.println();
    }

    public static double[] addToArray(int n, double arr[], double x){

        double newarr[] = new double[n + 1];

        for(int i = 0; i < n; i++){
            newarr[i] = arr[i];
            newarr[n] = x;
        }
        return newarr;
    }
   
}
