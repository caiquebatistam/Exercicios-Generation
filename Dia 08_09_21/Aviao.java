package OrientadoObjetos;

/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

public class Aviao {

	
	private String nome,modelo,cor,anoFabricacao;
	private double quantAssentos,veloMaxima,pesoMaximo;
	
	public Aviao(String nome, String modelo, String cor, String anoFabricacao, double quantAssentos, double veloMaxima,
				double pesoMaximo) 
	{
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.quantAssentos = quantAssentos;
		this.veloMaxima = veloMaxima;
		this.pesoMaximo = pesoMaximo;
	}
	
	public void exibirAviao()
	{
		System.out.println("\nInformações Avião: \n"+"\nNome: "+this.nome+"\nModelo"+this.modelo+"\nCor: "+ this.cor+
							"\nAnoFabricação: "+ this.anoFabricacao +"\nQuantidade de assentos: " +this.quantAssentos+
							"\nVelocidade Máxima: "+this.veloMaxima+"\nPeso Maximo : "+this.pesoMaximo);
							
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public double getQuantAssentos() {
		return quantAssentos;
	}

	public void setQuantAssentos(double quantAssentos) {
		this.quantAssentos = quantAssentos;
	}

	public double getVeloMaxima() {
		return veloMaxima;
	}

	public void setVeloMaxima(double veloMaxima) {
		this.veloMaxima = veloMaxima;
	}

	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	
}
