// package views;

// public class Principal {
//     package views;

// import utils.Console;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;

        do {
            System.out.println("\n -- Prova -- \n");
            System.out.println("3 - Cadastrar Funcionário");
            System.out.println("5 - Cadastrar Folha de Pagamento");
            System.out.println("6 - Listar Folha de Pagamento");
            System.out.println("7 - Consultar Todas Folhas de Pagamento");
            System.out.println("0 - Sair\n");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao) {
               
                case 3:
                    CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
                    cadastrarFuncionario.renderizar();
                    break;
                // case 4:
                //     ListarFuncionarios listarFuncionarios = new ListarFuncionarios();
                //     listarFuncionarios.renderizar();
                //     break;
                case 5:
                    CadastrarFolhaPagamento cadastrarProduto = new CadastrarFolhaPagamento();
                    cadastrarFolhaPagamento.renderizar();
                    break;
                case 6:
                    ListarFolhaPagamento listarProdutos = new ListarFolhaPagamento();
                    listarFolhaPagamento.renderizar();
                    break;
                case 7:
                    ConsultarFolha  consultarFolha = new ConsultarFolha();
                    consultarFolha.renderizar();
                    break;
    
                case 0:
                    System.out.println("\n -- SAINDO -- \n");
                    break;
                default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
            }

        } while (opcao != 0);
    }
}
    
}
