// Classe principal responsável por executar o sistema.
// Aplica o princípio de Baixo Acoplamento (Low Coupling), pois delega toda a lógica de negócio ao Controller.


// Importa as classes necessárias de outros pacotes
import controller.SistemaAcademicoController;
import model.Aluno;
import model.Curso;
import model.Matricula;
import model.Professor;

// Classe principal que contém o método main (ponto de entrada do programa)
public class Main {
    public static void main(String[] args) {

        // Cria os objetos necessários (Aluno, Curso e Professor)

        Aluno aluno = new Aluno("Camilly Reis", "375920");
        Curso curso = new Curso("Programação Orientada a Objetos", 60);
        Professor professor = new Professor("Carolina Duarte", "556470", "Programação Orientada a Objetos");
        
        // Utiliza o Controller para realizar a matrícula
        
        SistemaAcademicoController controller = new SistemaAcademicoController();
        Matricula matricula = controller.matricularAluno(aluno, curso, professor);

        // Saída dos dados 

        System.out.println("\n--- Dados da Matrícula ---");
        matricula.exibirDados();
    }
}
