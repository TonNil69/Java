package trabalho.view;

import java.util.Scanner;

/**
 * Created by rodrigo on 14/05/17.
 */
public class Relatorios {

    public int menuRelatorios() {
        StringBuilder menu = new StringBuilder("");
        Scanner scanner = new Scanner(System.in);
        int opcao;

        menu.append("\tXYZ COMERCIO DE PRODUTOS LTDA.\n");
        menu.append("\tSISTEMA DE CONTROLE DE ESTOQUE\n\n");
        menu.append("RELATÒRIOS\n\n");
        menu.append("1 - LISTA DE PREÇOS\n");
        menu.append("2 - BALANÇO FISÌCO/FINANCEIRO\n");
        menu.append("0 - RETORNAR\n\n");
        menu.append("OPÇÃO: ");

        try {
            System.out.print(menu.toString());
            opcao = Integer.parseInt(scanner.nextLine());

            return opcao;
        } catch (Exception e) {
            return 101;
        }
    }

    //TODO criar os metodos para exibir os 2 relatorios.
}
