package locawebfilmes.repository;

import locawebfilmes.model.Filme;

public interface FilmeRepository {
	//CRUD
	
	public void procurarPorId(int id);
	
	public void listarFilmes();
	
	public void cadastrar(Filme filme);
	
	public void atualizar(Filme filme);
	
	public void deletar(int id);
	
	//Métodos locadora
	
	public void alugarFilme(int id);
	
	public void disponivelParaAlugar(boolean disponivel);
}
