package Model;

public class DetalheVenda {

	private String produto;
	private double precoUnitario;
	private double quantidade;
	private double iva;
	
	public DetalheVenda(String produto, double precoUnitario, double quantidade, double iva) {
		this.setProduto(produto);
		this.setPrecoUnitario(precoUnitario);
		this.setQuantidade(quantidade);
		this.setIva(iva);
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return this.precoUnitario * this.quantidade;
	}
	
	@Override
	public String toString() {
		return String.format("%-15s %6.2f %6.2f %2.0f%%", this.getProduto() ,
				this.getPrecoUnitario(), this.getQuantidade(), this.getIva()*100);

	}
	
}
