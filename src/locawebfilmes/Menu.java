package locawebfilmes;

import java.util.InputMismatchException;
import java.util.Scanner;

import locawebfilmes.controller.FilmeController;
import locawebfilmes.model.AcaoAndAventura;
import locawebfilmes.model.Comedia;
import locawebfilmes.model.Terror;
import locawebfilmes.util.Cores;

public class Menu {
	public static void main(String[] args) {

		FilmeController filmes = new FilmeController();

		Scanner sc = new Scanner(System.in);

		String nomeFilme, diretor;
		int id, categoria, anoLancamento, avaliacao;
		float precoAluguel;

		int opcao = 0;

		while (true) {

			System.out.println(Cores.TEXT_BLACK + Cores.ANSI_PURPLE_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("             LOCAWEB-FILMES DO GUIZINHO              ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Filme                          ");
			System.out.println("            2 - Listar todos os Filmes               ");
			System.out.println("            3 - Buscar Filme por ID	                 ");
			System.out.println("            4 - Atualizar Dados do Filme             ");
			System.out.println("            5 - Apagar Filme                         ");
			System.out.println("            6 - Alugar Filme                         ");
			System.out.println("            7 - Verificar Aluguel do Filme           ");
			System.out.println("            8 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				sc.nextLine();
				opcao = 0;
			}

			if (opcao == 8) {
				System.out.println("Agradeçemos por vir aqui, até mais!");
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\n Criando Filme");

				do {
					System.out.println("Digite a Categoria do Filme");
					System.out.println("1- Ação e Aventura 2- Terror 3- Comédia");
					categoria = sc.nextInt();
				} while (categoria < 1 && categoria > 3);

				System.out.println("Digite o ID do filme: ");
				id = sc.nextInt();

				System.out.println("Ano de lançamento: ");
				anoLancamento = sc.nextInt();

				System.out.println("Avaliação do Filme de 1 a 5: ");
				avaliacao = sc.nextInt();

				System.out.println("Valor do filme: ");
				precoAluguel = sc.nextFloat();

				System.out.println("Digite o nome do filme: ");
				nomeFilme = sc.next();

				System.out.println("Digite o nome do diretor do filme: ");
				diretor = sc.next();

				System.out.println("Legal! Cadastrando filme! ");

				switch (categoria) {
				case 1:
					filmes.cadastrar(new AcaoAndAventura(nomeFilme, id, categoria, anoLancamento, diretor, avaliacao,
							precoAluguel));
					break;
				case 2:
					filmes.cadastrar(
							new Terror(nomeFilme, id, categoria, anoLancamento, diretor, avaliacao, precoAluguel));
					break;
				case 3:
					filmes.cadastrar(
							new Comedia(nomeFilme, id, categoria, anoLancamento, diretor, avaliacao, precoAluguel));
					break;
				}
				break;
			case 2:
				filmes.listarFilmes();
				break;
			case 3:
				System.out.println("Procurando por ID: ");

				System.out.println("Digite o id");
				int idProcurado = sc.nextInt();

				filmes.procurarPorId(idProcurado);
				break;

			case 4:
				System.out.println("Atualizando dados: ");

				do {
					System.out.println("Digite a Categoria do Filme");
					System.out.println("1- Ação e Aventura 2- Terror 3- Comédia");
					categoria = sc.nextInt();
				} while (categoria < 1 && categoria > 3);

				System.out.println("Digite o ID do filme: ");
				id = sc.nextInt();

				System.out.println("Ano de lançamento: ");
				anoLancamento = sc.nextInt();

				System.out.println("Avaliação do Filme de 1 a 5: ");
				avaliacao = sc.nextInt();

				System.out.println("Valor do filme: ");
				precoAluguel = sc.nextFloat();

				System.out.println("Digite o nome do filme: ");
				nomeFilme = sc.next();

				System.out.println("Digite o nome do diretor do filme: ");
				diretor = sc.next();

				System.out.println("Legal! Atualizando filme! ");

				switch (categoria) {
				case 1:
					filmes.atualizar(new AcaoAndAventura(nomeFilme, id, categoria, anoLancamento, diretor, avaliacao,
							precoAluguel));
					break;
				case 2:
					filmes.atualizar(
							new Terror(nomeFilme, id, categoria, anoLancamento, diretor, avaliacao, precoAluguel));
					break;
				case 3:
					filmes.atualizar(
							new Comedia(nomeFilme, id, categoria, anoLancamento, diretor, avaliacao, precoAluguel));
					break;
				}
				break;

			case 5:
				System.out.println("Digite o ID do filme que queira deletar: ");
				int idDeletar = sc.nextInt();

				filmes.deletar(idDeletar);

				break;

			case 6:
				System.out.println("Digite o ID do filme que queira alugar: ");
				int idFilmeAluguel = sc.nextInt();

				System.out.println("\nVamos lá alugar!");

				filmes.alugarFilme(idFilmeAluguel);
				break;

			case 7:
				System.out.println("Digite o ID do filme que queira deletar: ");
				int idVerificarAluguel = sc.nextInt();

				System.out.println("Vamos verificar! ");

				filmes.alugarFilme(idVerificarAluguel);
			}

		}

	}
}
