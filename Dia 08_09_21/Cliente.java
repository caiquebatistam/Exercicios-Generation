package OrientadoObjetos;

public class Cliente {
	
	private String nome;
	private String endereco;
	private int telefone;

	public Cliente(String nome,String end,int tel)
	{
		this.nome = nome;
		this.endereco = end;
		this.telefone = tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void imprimir()
	{
		System.out.println("\n"+nome+"\n"+endereco+"\n"+telefone);
	}
	
	
	
}
