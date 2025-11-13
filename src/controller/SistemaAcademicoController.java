// Classe Controller do sistema acadêmico.
// Padrões GRASP aplicados:
// CONTROLLER → centraliza as ações do sistema (baixo acoplamento).
// CREATOR → cria objetos de Matricula, pois tem acesso a Aluno, Curso e Professor.

package controller;

import model.Aluno;
import model.Curso;
import model.Matricula;
import model.Professor;

public class SistemaAcademicoController {

    public Matricula matricularAluno(Aluno aluno, Curso curso, Professor professor) {
        System.out.println("Realizando matrícula...");

        // Aplicação do padrão CREATOR: o Controller cria a matrícula

        Matricula matricula = new Matricula(aluno, curso, professor);
        return matricula;
    }
}
