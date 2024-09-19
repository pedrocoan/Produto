package pooexx.com;

// na classe produtos eu vou criar os atributos e metodos e aplicar toda logica pra instanciar em outra classe obs : na classe LOja/*
public class Produtos {
	// criando os atributos da classe Produtos/*
	String nome;
	String marca;
	double precocusto;
	double precovenda;
	double lucro;
	// criando o construtor e setando os paramentros/*
	public Produtos(String nome, String marca, double precocusto, double precovenda) {
		this.nome = nome;
		this.marca = marca;
		this.precocusto = precocusto;
		this.precovenda = precovenda;
		
	}
	// aplicando a logica e criando o metodo para o calculo de lucro/*
	public double calculodelucro() {
		return precovenda - precocusto;
	}
	
	
	
	

}
