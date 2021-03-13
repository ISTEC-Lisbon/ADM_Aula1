package adm_Classes;

import java.util.ArrayList;

import Model.Pessoa;

public class Main02 {

	public static void main(String[] args) {
		//teste
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		lista.add(new Pessoa("André", "Gomes", "Lisboa", 186, 120));
		lista.add(new Pessoa("Inês", "Gomes", "Lisboa", 186, 120));
		lista.add(new Pessoa("Ricardo", "Gomes", "Lisboa", 186, 120));

		System.out.println(lista);

	}

}
