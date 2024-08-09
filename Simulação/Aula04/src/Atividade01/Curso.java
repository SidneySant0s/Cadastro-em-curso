package Atividade01;

public class Curso {

    String nome;
    int quantidadedealunos;
    String turma;
    float Mensalidade;

    Curso() {
    }

    ;
    Curso(String n, int q, String t, float m) {
        this.nome = n;
        this.quantidadedealunos = q;
        this.turma = t;
        this.Mensalidade = m;

    }

    void cadastraCurso(String n, int q, String t, float m) {
        this.nome = n;
        this.quantidadedealunos = q;
        this.turma = t;
        this.Mensalidade = m;
     

    }

    ;
    
    void imprimeDados() {
        System.out.println("Dados de usuario: "
                + "\n nome do aluno(a): " + nome
                + "\n Turma: " + turma
                + "\n Quantidade de alunos: " + quantidadedealunos
                + "\n Mensalidade: " + Mensalidade);
    }

    ;
    
    float calculaTotalMensalidade() {
        float Totalm;
        Totalm = Mensalidade * 12;
        return Totalm;

    }

}
