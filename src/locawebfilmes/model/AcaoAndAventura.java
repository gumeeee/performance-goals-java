package locawebfilmes.model;

public class AcaoAndAventura extends Filme{

	public AcaoAndAventura(String nomeFilme, int id, int categoria, int anoLancamento, String diretor, int avaliacao,
			float precoAluguel) {
		super(nomeFilme, id, categoria, anoLancamento, diretor, avaliacao, precoAluguel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		super.visualizar();
		
		System.out.println("Você vai ter uma GRANDE AVENTURA!! Esse filme vai ser incrivel");
	}
	
	

}
