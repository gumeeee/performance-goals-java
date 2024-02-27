package locawebfilmes.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import locawebfilmes.model.Filme;
import locawebfilmes.repository.FilmeRepository;

public class FilmeController implements FilmeRepository {

	private List<Filme> filmes;
	private Scanner sc = new Scanner(System.in);

	public FilmeController() {
		filmes = new ArrayList<>();
	}

	@Override
	public void procurarPorId(int id) {
		var filme = buscarNaCollection(id);

		System.out.println("\n Filme encontrado!");
		System.out.println(" ");
		filme.visualizar();

	}

	@Override
	public void listarFilmes() {
		System.out.println("Listando Filmes: ");

		for (Filme filme : filmes) {
			filme.visualizar();
		}
	}

	@Override
	public void cadastrar(Filme filme) {
		filmes.add(filme);
		System.out.println("\nFilme cadastrado com sucesso!");

	}

	@Override
	public void atualizar(Filme filmeAtualizado) {
		Filme buscarFilme = buscarNaCollection(filmeAtualizado.getId());

		if (buscarFilme != null) {
			filmes.set(filmes.indexOf(buscarFilme), filmeAtualizado);
			System.out.println("\n Filme de nome: " + filmeAtualizado.getNomeFilme() + " e ID: "
					+ filmeAtualizado.getId() + " Atualizado com sucesso!");
		} else {
			System.out.println("\n Filme de nome: " + filmeAtualizado.getNomeFilme() + " e ID: "
					+ filmeAtualizado.getId() + " Não foi encontrado, tente novamente ou não está cadastrado!");

		}

	}

	@Override
	public void deletar(int id) {
		var filmeDeletar = buscarNaCollection(id);
		
		if(filmeDeletar != null) {
			filmes.remove(filmeDeletar);
			
			System.out.println("Filme removido com sucesso! ");
		} else {
			System.out.println("Não foi possivel deletar filme...");
		}

	}

	@Override
	public void alugarFilme(int id) {
		var filmeAlugar = buscarNaCollection(id);
		
		if(filmeAlugar.isDisponivelParaAluguel()) {
			System.out.println("Alugando filme!! Aproveite o seu filme");
		} else {
			System.out.println("EITA! não foi possivel alugar o filme");
		}

	}

	@Override
	public void disponivelParaAlugar(int id) {
		System.out.println("Você tem saldo para alugar o filme? (true/false)");
	    boolean temSaldo = sc.nextBoolean();
	    
	    if(temSaldo) {
	    	var tornarFilmeDisponivel = buscarNaCollection(id);
	    	tornarFilmeDisponivel.setDisponivelParaAluguel(temSaldo);
	    	
	    	System.out.println("\n Filme disponivel para alugar!");
	    } else {
	    	System.out.println("Sem Saldo Sem Filme!! >:(");
	    }

	}

	public Filme buscarNaCollection(int id) {
		for (Filme filme : filmes) {
			if (filme.getId() == id)
				return filme;
		}

		return null;
	}

}
