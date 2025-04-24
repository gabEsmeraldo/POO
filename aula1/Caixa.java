package aula1;
public class Caixa{
	private String cor;
	private int etiqueta;
	private int numero;
	
	public Caixa(){
		cor = "";
		etiqueta = 0;
		numero = 0;
	}
	public String getCor(){
		return this.cor;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	public int getEtiqueta(){
		return this.etiqueta;
	}
	public void setEtiqueta(int etiqueta){
		this.etiqueta = etiqueta;
	}
	public int getNumero(){
		return this.numero;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
}