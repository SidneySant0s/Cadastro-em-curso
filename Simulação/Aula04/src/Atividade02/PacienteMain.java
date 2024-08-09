
package Atividade02;

import javax.swing.JOptionPane;


public class PacienteMain {

    public static void main(String[] args) {
    String n;
    String rg;
    String e;
    String tel;
    int an;
    String p;
    
    n = JOptionPane.showInputDialog("Digite seu Nome:");
    rg = JOptionPane.showInputDialog("Digite seu RG:");
    e = JOptionPane.showInputDialog("Digite seu endereço:");
    tel = JOptionPane.showInputDialog("Digite seu telefone:");
    an = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você nasceu:"));
    p = JOptionPane.showInputDialog("Digite sua profissão:");
    
    
    
    Paciente p0 = new Paciente();
    
    Paciente p1 = new Paciente(n,rg, e,tel,an,p){};
    
    p1.imprimeDados();
    
    
    JOptionPane.showMessageDialog(null, "Digite os dados de um no paciente: ");
    n = JOptionPane.showInputDialog("Digite seu Nome:");
    rg = JOptionPane.showInputDialog("Digite seu RG:");
    e = JOptionPane.showInputDialog("Digite seu endereço:");
    tel = JOptionPane.showInputDialog("Digite seu telefone:");
    an = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você nasceu:"));
    p = JOptionPane.showInputDialog("Digite sua profissão:");
    
    
    
    p1.cadastraDados(n,rg, e,tel,an,p);
    
    p1.imprimeDados();
    
    }
    
    
    
   
    
    
}
