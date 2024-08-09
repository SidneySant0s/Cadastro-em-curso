package Atividade01;

import javax.swing.JOptionPane;

public class cursoMain {

    public static void main(String[] args) {
        String n;
        String t;
        int q;
        float m;

        n = JOptionPane.showInputDialog("Digite o seu nome: ");
        t = JOptionPane.showInputDialog("Digite qual sua turma no curso: ");
        m = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da mensalidade do curso R$:"));

        Curso c0 = new Curso() {
        };

        Curso c1 = new Curso(n, 26, t,m) {
        };

        c1.imprimeDados();

        c1.calculaTotalMensalidade();
        System.out.println("Total da mensalidade somado em 1 ano: R$" + c1.calculaTotalMensalidade());
        
        JOptionPane.showMessageDialog(null, "Novo cadastro de aluno");
        
        n = JOptionPane.showInputDialog("Digite o seu nome: ");
        t = JOptionPane.showInputDialog("Digite qual sua turma no curso: ");
        m = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da mensalidade do curso R$:"));

        
        c1.cadastraCurso(n, 30, t, m);
        
        c1.imprimeDados();
        c1.calculaTotalMensalidade();
        System.out.println("Total da mensalidade somado em 1 ano: R$" + c1.calculaTotalMensalidade());
        
    }

}
