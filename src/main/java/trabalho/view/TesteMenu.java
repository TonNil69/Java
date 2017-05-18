package trabalho.view;

import java.sql.SQLException;

import trabalho.model.dao.ProdutoDAO;
import trabalho.model.entity.Produto;

/**
 * Created by rodrigo on 12/05/17.
 */
public class TesteMenu {

    /*public static void main(String[] args) throws SQLException {
        do {
            MenuPrincipal menu = new MenuPrincipal();
            int opcao = menu.menuPrincipal();
            ProdutoDAO pDAO = new ProdutoDAO();
            int opt;

            switch (opcao) {
                case 1:wipe();
                    Cadastro cadastro = new Cadastro();
                    opt = cadastro.menuCadastro();
                    if(opt == 1){
                    	wipe();
                    	pDAO.inserir(cadastro.inclusao());
                    }else if(opt == 2){
                    	wipe();
                    	pDAO.alterar(cadastro.alteracao(cadastro.consultaPorNome()));
                    }else if(opt == 3){
                    	wipe();
                    	pDAO.excluir(cadastro.exclusao(cadastro.consultaPorNome()));
                    }else if(opt == 4){
                    	wipe();
                    	cadastro.consultaResultado(cadastro.consultaPorNome());
                    }
                    wipe();
                    break;

                case 2:
                    wipe();
                    Movimentacao movimentacao = new Movimentacao();
                    opt = movimentacao.menuMovimentacao();
                    if(opt == 1){
                    	pDAO.alterar(movimentacao.entrada(movimentacao.consultaPorNome()));
                    }else if(opt == 2){
                    	pDAO.alterar(movimentacao.saida(movimentacao.consultaPorNome()));
                    }
                    wipe();
                    break;

                case 3:
                    wipe();
                    ReajusteDePreco reajusteDePreco = new ReajusteDePreco();
                    opt = reajusteDePreco.menuReajusteDePrecos();
                    if(opt == 1){
                    	pDAO.alterarPreco(reajusteDePreco.reajustarPreco(reajusteDePreco.consultaPorNome()));
                    }
                    wipe();
                    break;

                case 4:
                    wipe();
                    Relatorios relatorios = new Relatorios();
                    opt = relatorios.menuRelatorios();
                    wipe();
                    if(opt == 1){
                    	StringBuilder rel = new StringBuilder("");
                    	rel.append("+------+-------------------------------+------------------------------+\n");
                    	rel.append("|  id  |             Preço             |             Nome             |\n");
                    	rel.append("+------+-------------------------------+------------------------------+\n");
                    	for(Produto i: pDAO.listar()){
                    	rel.append("   " + i.getId() + "\t             " + i.getPreco() + "\t\t\t\t" + i.getNome() + "\n");
                    	}
                    	rel.append("-----------------------------------------------------------------------\n");
                    	System.out.println(rel);
                    }else if(opt == 2){
                    	
                    }
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    wipe();
                    System.out.println("Opção invalida!!!\n");
                    break;
            }
        } while (true);
    }
    
    public static void wipe(){
    	for(int i = 0; i < 50; i++){
    		System.out.println("\n");
    	}
    }*/
    
}
