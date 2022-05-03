package views;

import java.io.Console;

import modells.Funcionario;

public class CadastarFuncionario {
   

    public void renderizar(){
        
        Funcionario funcionario = new Funcionario();        
        // Funcionario funcionario = new Funcionario();
        System.out.println("\n -- CADASTRO DE FUNCIONÁRIOS -- \n");
        funcionario.setNome(Console.readString("Digite o nome do funcionário: "));
        funcionario.setCpf(Console.readString("Digite o CPF do funcionário: "));        
        // funcionarioController.cadastrar(funcionario);
        System.out.println("\fFuncionário cadastrado !!!");
    
    
}
}
