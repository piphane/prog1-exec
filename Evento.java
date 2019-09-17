class Evento{
	private int id; 
	private Data ocorrencia; 
	private String nome;

	public Evento() 
	{
		this.ocorrencia = new Data();
	}

	public void setId (int d)
	{
		this.id = d;
	}

	public int getId() 
	{
		return this.id; 
	}

	public void setOcorrencia(Data o) {

		this.ocorrencia = o; 
	}


	public Data getOcorrencia() {

		return this.ocorrencia; 
	}


	public void setNome(String n) {

		this.nome = n; 
	}


	public String getNome() 
	{
		return this.nome; 
	}
}