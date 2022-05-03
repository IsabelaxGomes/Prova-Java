package Controllers;

import java.util.ArrayList;

import modells.Funcionario;

public class FuncionarioController {
    
    private static ArrayList <Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void cadastrar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public ArrayList<Funcionario> listar() {
        return funcionarios;
    }

    public Funcionario buscarPorCpf(String Cpf){
        for (Funcionario funcionarioCadastrado : funcionarios) {
            if(funcionarioCadastrado.getCpf().equals(Cpf)){
                return funcionarioCadastrado;
            }
        }
        return null;
    }

    
}