package adm_Classes;
import java.util.ArrayList;
import Model.Pessoa;


public class Main03 {

	public static void main(String[] args) {

		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

		lista.add(new Pessoa("Jo�o", "Silva", "Lisboa", 176, 67));
		lista.add(new Pessoa("Maria", "Borges", "Porto", 178, 65));
		lista.add(new Pessoa("Carlos", "Sousa", "Faro", 183, 79));

		System.out.println(lista);

		Pessoa p = new Pessoa("Alfredo", "Rodrigues", "Coimbra", 190, 90);
		lista.add(p);

		System.out.println("Depois de adicionar o Alfredo:");
		System.out.println(lista);

		System.out.println("A lista cont�m o Alfredo?");
		System.out.println(lista.contains(p));
		System.out.println("O Alfredo ocupa o �ndice " + lista.indexOf(p));
		
		lista.remove(p);
		System.out.println("Depois de remover o Alfredo:");

		System.out.println(lista);
		System.out.println("A lista cont�m o Alfredo?");
		System.out.println(lista.contains(p));
		
		System.out.println("Nr de elementos:" + lista.size());
		System.out.println("Pessoa que est� na posi��o 1: " + lista.get(1));
		
		System.out.println("Depois de colocar o Alfredo na posi��o 2:");
		lista.set(2, p);
		System.out.println(lista);
		
		Pessoa[] array = lista.toArray(new Pessoa[lista.size()]);
		System.out.println("Primeiro objecto do array:" + array[0]);
	}

}
