package pooexx.com;

// essa classe vai ser criada os atributos e os metodos e ser aplicada a logica/*
public class Pessoas {
	// criando os atributos/*
	String nomecompleto;
	double altura;
	String datanascimento;
	
	
	
// setando os parametros do construtor/*
	public Pessoas(String nomecompleto, double altura, String datanascimento) {
		this.nomecompleto = nomecompleto;
		this.datanascimento = datanascimento;
		this.altura = altura;
		
		
	}
	//aplicando a logica da geraçao do email/*
	public  String geracaodeemail(String nomesobrenome, String email) {
		return nomesobrenome + email;
		
	}
	
	

	
	
}
