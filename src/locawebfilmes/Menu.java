package locawebfilmes;

import java.util.InputMismatchException;
import java.util.Scanner;

import locawebfilmes.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao = 0;

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

	}
}
