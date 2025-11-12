package model;

public class Matricula {
    private Aluno aluno;
    private Curso curso;

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
    }

    public void exibirDados() {
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Curso: " + curso.getNome());
    }
}
