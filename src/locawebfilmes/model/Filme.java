package locawebfilmes.model;

public abstract class Filme {
	private String nomeFilme;
	private int id;
	private int categoria;
	private int anoLancamento;
	private String diretor;
	private int avaliacao;
	private boolean disponivelParaAluguel;
	private float precoAluguel;

	public Filme(String nomeFilme, int id, int categoria, int anoLancamento, String diretor, int avaliacao,
			float precoAluguel) {
		this.nomeFilme = nomeFilme;
		this.id = id;
		this.categoria = categoria;
		this.anoLancamento = anoLancamento;
		this.diretor = diretor;
		this.avaliacao = avaliacao;
		this.precoAluguel = precoAluguel;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public boolean isDisponivelParaAluguel() {
		return disponivelParaAluguel;
	}

	public void setDisponivelParaAluguel(boolean disponivelParaAluguel) {
		this.disponivelParaAluguel = disponivelParaAluguel;
	}

	public float getPrecoAluguel() {
		return precoAluguel;
	}

	public void setPrecoAluguel(float precoAluguel) {
		this.precoAluguel = precoAluguel;
	}

	public void visualizar() {
		String tipoFilme = "";

		switch (this.categoria) {
		case 1:
			tipoFilme = "Ação e Aventura";
			break;
		case 2:
			tipoFilme = "Terror";
			break;
		case 3:
			tipoFilme = "Comédia";
		default:
			tipoFilme = "Tipo de Conta invalida";
		}

		System.out.println("************************************");

		System.out.println("			Dados do Filme			");

		System.out.println("************************************");

		System.out.println("Nome do Filme: " + this.nomeFilme);
		System.out.println("ID do Filme: " + this.id);
		System.out.println("Tipo da conta: " + tipoFilme);
		System.out.println("Ano de Lançamento: " + this.anoLancamento);
		System.out.println("Diretor: " + this.diretor);
		System.out.println("Avaliação: " + this.avaliacao);
		System.out.println("Disponivel para Aluguel? " + this.disponivelParaAluguel);
		System.out.println("Preço do aluguel: " + this.precoAluguel);
		System.out.println("");
		System.out.println("************************************");
		System.out.println("");

	}

}
