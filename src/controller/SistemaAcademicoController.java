package controller;

import model.Aluno;
import model.Curso;
import model.Matricula;

public class SistemaAcademicoController {

    public Matricula matricularAluno(Aluno aluno, Curso curso) {
        System.out.println("Realizando matrícula...");
        Matricula matricula = new Matricula(aluno, curso);
        return matricula;
    }
}
