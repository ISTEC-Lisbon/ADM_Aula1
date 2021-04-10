package adm_Classes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import Model.Venda;

public class Main04 {

	public static void main(String[] args) {
		
		Venda v = new Venda(LocalDate.now().toString());
		v.addDetalheVenda("Lápis", 1.2, 3, 0.23);
		v.addDetalheVenda("Borracha", 1.6, 1, 0.23);
		v.addDetalheVenda("Leite", .95, 6, 0.06);

		System.out.println(v);
	}

}
