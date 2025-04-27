public class Main {
	public static void main(String[] args) {
		Carro c1 = new Carro("BMW X6 M Competition");
		Carro c2 = new Carro("BMW M4 CS");
		Carro c3 = new Carro("BMW M3 Competition");
		Carro c4 = new Carro("BMW i5 M60");
		


		c1.EntrarNoCarro();
		c1.EntrarNoCarro();
		c1.EntrarNoCarro();
		c1.EntrarNoCarro();

		c2.EntrarNoCarro();
		c2.EntrarNoCarro();
		c2.EntrarNoCarro();
		c2.EntrarNoCarro();
		c2.EntrarNoCarro();
		
		c3.EntrarNoCarro();
		c3.EntrarNoCarro();
		c3.EntrarNoCarro();
	
		
		c4.EntrarNoCarro();



		System.out.println("         BMW Group Brasil\n");
		System.out.println("      Informações dos Carros\n");
		System.out.println(c1.getNome() + " | Passageiros: " + c1.getQtdPassageiros()+"/5");
		System.out.println(c2.getNome() + " | Passageiros: " + c2.getQtdPassageiros()+"/5");
		System.out.println(c3.getNome() + " | Passageiros: " + c3.getQtdPassageiros()+"/5");
		System.out.println(c4.getNome() + " | Passageiros: " + c4.getQtdPassageiros()+"/5");

	
		System.out.println("\n     Totais\n ");
		System.out.println("Total de carros: " + Carro.getQtdCarro());
		System.out.println("Total de passageiros em todos os carros: " + Carro.getQtdTotalDePassageiros()+"/20");
	}
}
