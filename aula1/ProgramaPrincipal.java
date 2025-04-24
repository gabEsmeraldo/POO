package aula1;
import java.util.Scanner;
public class ProgramaPrincipal{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Caixa caixinha = new Caixa();

	System.out.println("Qual a cor da caixa?");
	String cor = scan.nextLine();
	caixinha.setCor(cor);

	System.out.println("Qual a etiqueta da caixa?");
	int etiqueta = scan.nextInt();
	caixinha.setEtiqueta(etiqueta);

	System.out.println("Qual o numero da caixa?");
	int numero = scan.nextInt();
	caixinha.setNumero(numero);

	System.out.println("Cor = " + caixinha.getCor());
	System.out.println("Etiqueta = " + caixinha.getEtiqueta());
	System.out.println("Numero = " + caixinha.getNumero());
	scan.close();
	}
}