package modells;

public class Funcionario {
    
    private String nome;
    private String cpf;
    private String mes;
    private Double horas;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMes(){
        return mes;
    }
    public void setMes( String mes) {
        this.mes = mes;
    }

    public Double gethoras(){
        return horas;
    }
    public void setHoras( Double horas) {
        this.horas = horas;
    }


    @Override
    public String toString() {
        return 
            "Nome: " + nome + 
            " | CPF: " + cpf+
            "| Horas: " + horas+
            "Mes: " + mes;

            
    }
    

    

}
