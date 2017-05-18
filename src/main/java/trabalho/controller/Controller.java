package trabalho.controller;

import trabalho.model.dao.ProdutoDAO;
import trabalho.view.*;

import java.sql.SQLException;

/**
 * Created by rodrigo on 17/05/17.
 */
public class Controller {

    public void menuPrincipal() {
        MenuPrincipal menu = new MenuPrincipal();
        int opcao;

        do {
            opcao = menu.menuPrincipal();

            switch (opcao) {
                case 1:
                    cadastro();
                    break;

                case 2:
                    movimentacao();
                    break;

                case 3:
                    reajusteDePreco();
                    break;

                case 4:
                    relatorios();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção invalida!!!\n");
                    break;
            }
        } while (true);
    }


    public void cadastro() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Cadastro cadastro = new Cadastro();
        int opcao;

        do {
             opcao = cadastro.menuCadastro();

            switch (opcao) {
                case 1:
                    try {
                        produtoDAO.inserir(cadastro.inclusao());
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 2:
                    try {
                        produtoDAO.alterar(cadastro.alteracao(produtoDAO.consultarPorNome(cadastro.consultaPorNome())));
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 3:
                    try {
                        produtoDAO.excluir(cadastro.exclusao(produtoDAO.consultarPorNome(cadastro.consultaPorNome())));
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 4:
                    try {
                        cadastro.consultaResultado(produtoDAO.consultarPorNome(cadastro.consultaPorNome()));
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 0:
                    opcao = 0;
                    break;

                default:
                    System.out.println("Opção invalida!!!\n");
                    break;
            }
        } while (opcao != 0);
    }

    public void movimentacao() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Movimentacao movimentacao = new Movimentacao();
        int opcao;

        do {
            opcao = movimentacao.menuMovimentacao();

            switch (opcao) {
                case 1:
                    try {
                        produtoDAO.alterarQuantidade(movimentacao.entrada(produtoDAO.consultarPorNome(movimentacao.consultaPorNome())));
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 2:
                    try {
                        produtoDAO.alterarQuantidade(movimentacao.saida(produtoDAO.consultarPorNome(movimentacao.consultaPorNome())));
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 0:
                    opcao = 0;
                    break;

                default:
                    System.out.println("Opção invalida!!!\n");
                    break;
            }
        } while (opcao != 0);
    }

    public void reajusteDePreco() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        ReajusteDePreco reajusteDePreco = new ReajusteDePreco();
        int opcao;

        do {
            opcao = reajusteDePreco.menuReajusteDePrecos();

            switch (opcao) {
                case 1:
                    try {
                        produtoDAO.alterarPreco(reajusteDePreco.reajustarPreco(produtoDAO.consultarPorNome(reajusteDePreco.consultaPorNome())));
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 0:
                    opcao = 0;
                    break;

                default:
                    System.out.println("Opção invalida!!!\n");
                    break;
            }
        } while (opcao != 0);
    }

    public void relatorios() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Relatorios relatorios = new Relatorios();
        int opcao;

        do {
            opcao = relatorios.menuRelatorios();

            switch (opcao) {
                case 1:

                    break;

                case 2:

                    break;

                case 0:
                    opcao = 0;
                    break;

                default:
                    System.out.println("Opção invalida!!!\n");
                    break;
            }
        } while (opcao != 0);
    }
}
