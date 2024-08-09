package Atividade02;

import javax.swing.JOptionPane;

public class Paciente {

    String nome;
    String rg;
    String endereco;
    String Telefone;
    int anoNascimento;
    String profissao;

    Paciente() {
    };
    
    
    Paciente(String n, String rg, String e, String tel, int an, String p) {
        this.nome = n;
        this.rg = rg;
        this.endereco = e;
        this.Telefone = rg;
        this.anoNascimento= an;
        this.profissao= p;
    };
     
    void cadastraDados(String n, String rg, String e, String tel, int an, String p) {        
        this.nome = n;
        this.rg = rg;
        this.endereco = e;
        this.Telefone = rg;
        this.anoNascimento= an;
        this.profissao= p;
    };
     
    int calculaIdade() {
        int idade;
        idade = 2024 - anoNascimento;
        return idade;
    };
    
    void imprimeDados(){
        System.out.println("Dados do paciente: " + 
                "\n Nome do paciente: " + nome +
                "\n rg: " + rg +
                "\n Endereço: " + endereco +
                "\n telefone: " + Telefone + 
                "\n Ano que nasceu: " + anoNascimento + " Idade: " + String.valueOf(calculaIdade()) + 
                "\n Profissao: " + profissao
        );
    };

}
