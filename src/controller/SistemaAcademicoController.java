package controller;

import model.Aluno;
import model.Curso;
import model.Matricula;
import model.Professor;

public class SistemaAcademicoController {

    public Matricula matricularAluno(Aluno aluno, Curso curso, Professor professor) {
        System.out.println("Realizando matrícula...");
        Matricula matricula = new Matricula(aluno, curso, professor);
        return matricula;
    }
}
