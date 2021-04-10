package Model;

import java.util.ArrayList;
import java.util.Iterator;

public class Venda {
	
	private String data;
	private ArrayList<DetalheVenda> detalhes;
	
	public Venda(String data) {
		this.setData(data);
		detalhes = new ArrayList<DetalheVenda>();
	}

	public void addDetalheVenda(String produto, double precoUnitario, double quantidade, double iva) {
		this.detalhes.add(new DetalheVenda(produto, precoUnitario, quantidade, iva));
	}
	
	private void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return this.data;
	}
	
	public double getTotal() {
		double total = 0;
		for(DetalheVenda d : this.detalhes) {
			total += d.getTotal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		String resultado = this.getData() + "\r\n";
		for (int i = 0; i < detalhes.size(); i++) {
			resultado = resultado + String.format(" %2d %s%n",  i , detalhes.get(i));
		}
		resultado = resultado +  String.format("Total: %6.2f", this.getTotal());
		return resultado;
	}
	
	
}
