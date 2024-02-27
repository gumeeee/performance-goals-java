package locawebfilmes.model;

public class Comedia extends Filme{

	public Comedia(String nomeFilme, int id, int categoria, int anoLancamento, String diretor, int avaliacao,
			float precoAluguel) {
		super(nomeFilme, id, categoria, anoLancamento, diretor, avaliacao, precoAluguel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		super.visualizar();
		
		System.out.println("\n Esperamos que ria muito nesse filme hein!!");
	}
	
	

}
