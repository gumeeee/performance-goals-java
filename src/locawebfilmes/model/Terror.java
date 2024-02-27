package locawebfilmes.model;

public class Terror extends Filme{

	public Terror(String nomeFilme, int id, int categoria, int anoLancamento, String diretor, int avaliacao,
			float precoAluguel) {
		super(nomeFilme, id, categoria, anoLancamento, diretor, avaliacao, precoAluguel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		super.visualizar();
		
		System.out.println("\n Você é bem corajoso hein!! Aposto que não irá dormir de noite, aproveite o filme...");
	}
	
	

}
