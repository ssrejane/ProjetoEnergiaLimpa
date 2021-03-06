package ProjetoEnergiaLimpa;

public class Fisica extends Cliente implements Interface{
	
	private String cpf;
	private float renda;
	
	
	public Fisica(String nome, String telefone, String endereco, String numeroInstalacao, double valorConta,
			double kgLixo, String cpf, float renda) 
	{
		super(nome, telefone, endereco, numeroInstalacao, valorConta, kgLixo);
		this.cpf = cpf;
		this.renda = renda;
	}
	
	
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public float getRenda() {
		return renda;
	}


	public void setRenda(float renda) {
		this.renda = renda;
	}
	
	
	@Override
	public double reducaoValor()
	{
		getKgLixo();
		double desconto = valorConta - pesoLixo(kgLixo);
		return desconto;
	}


	@Override
	public void imprimirInfo() 
	{
		System.out.printf("\n"
				+ "\n DADOS DO CLIENTE: "
				+ "\n\n Cliente: %s"
				+ "\n Telefone: %s"
				+ "\n Endere?o: %s"
				+ "\n N?mero de Instala??o: %s"
				+ "\n Valor da fatura: R$%2.2f"
				+ "\n Peso mensal do lixo: %2.0fkg",
				nome, telefone, endereco, numeroInstalacao, valorConta, kgLixo);

		
	}
	
	


	

}
