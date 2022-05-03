package views;
 import Controllers.FuncionarioController;

public class ListarFuncionario {
    

    public void renderizar(){
        FuncionarioController funcionarioController = new FuncionarioController(); 
        System.out.println("\n -- LISTAGEM DE FUNCIONÁRIOS -- \n");
        for (funcionario funcionarioCadastrado : FuncionarioController.listar()) {
            System.out.println(funcionarioCadastrado);
        }
    }
    
}

