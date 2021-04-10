package adm_Classes;
import Model.Pessoa;

public class Main01 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("André", "Gomes", "Lisboa", 186, 120);
		Pessoa p2 = new Pessoa("Maria", "Borges", "Porto", 178, 65);
		Pessoa p3 = new Pessoa("Carlos", "Sousa", "Faro", 183, 79);

		Pessoa[] pessoas = { p1, p2, p3, new Pessoa("Alfredo", "Rodrigues", "Coimbra", 190, 90) };

		for (Pessoa p : pessoas) {
			System.out.println(p);
		}

//		p3.setNomeCompleto("Bruno Madeira");
//		System.out.println(p3);
//		System.out.println(p3.getPrimeiroNome());
//		System.out.println(p3.getUltimoNome());
		
	}

}
