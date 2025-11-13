// Classe Matricula representa o relacionamento entre um aluno, um curso e um professor.
// Padrão GRASP aplicado: CREATOR
// O Controller é responsável por criar objetos desta classe, pois ele possui as informações necessárias (Aluno, Curso e Professor).
// Justificativa:
// Isso mantém baixo acoplamento e alta coesão.
// Evita que classes externas precisem conhecer a estrutura interna de Matricula.


// Declara o pacote onde a classe Matricula está localizada
package model;

// Declaração da classe pública Matrícula
public class Matricula {

    // Armazena o aluno, o professor e o curso
    private Aluno aluno;
    private Curso curso;
    private Professor professor;

     // Construtor

    public Matricula(Aluno aluno, Curso curso, Professor professor) {
        this.aluno = aluno;          // Atribui o aluno recebido ao atributo aluno
        this.curso = curso;          // Atribui o curso recebido ao atributo curso
        this.professor = professor;  // Atribui o professor recebido ao atributo professor
    }
 
    // Exibe na tela as informações da matrícula (aluno, curso e professor)

    public void exibirDados() {
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Profesor: "+ professor.getNome());
    }
}
