package pooexx.com;



// nessa classe vou criar o objeto a partir do odelo da outra classe e fazer os procedimentos para mostrar tds os atributos na tela/*
public class Loja {

	public static void main(String[] args) {
	Produtos p1 = new Produtos("Tv 45 polegadas 4k", "LG",2277.00,5000.00);
	System.out.println("Nome do produto : " + p1.nome);
	System.out.println("Marca do produto : " + p1.marca);
	System.out.println(" Custo do produto  : R$" + p1.precocusto);
	System.out.println("valor de venda do produto : R$" +p1.precovenda);
	 p1.lucro = p1.calculodelucro();
	 System.out.println("o lucro com o produto é de R$  : " + p1.lucro);

	
	

	}

}
