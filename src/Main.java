import controller.SistemaAcademicoController;
import model.Aluno;
import model.Curso;
import model.Matricula;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Camilly Reis", "375920");
        Curso curso = new Curso("Programação Orientada a Objetos", 60);

        SistemaAcademicoController controller = new SistemaAcademicoController();
        Matricula matricula = controller.matricularAluno(aluno, curso);

        System.out.println("\n--- Dados da Matrícula ---");
        matricula.exibirDados();
    }
}
