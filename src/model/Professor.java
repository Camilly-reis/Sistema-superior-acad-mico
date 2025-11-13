// Classe Professor representa o docente responsável por ministrar um curso.
// Aplica o princípio GRASP de Alta Coesão (High Cohesion), pois sua responsabilidade está claramente limitada a armazenar
//fornecer informações sobre o professor.



// Declara o pacote onde a classe Professor está localizada
package model;

// Declaração da classe pública Professor
public class Professor {

    // Armazena o nome, o número de matrícla do professor e a disciplina que o professor leciona
    private String nome;
    private String matricula;
    private String disciplina;

    // Construtor
    
    public Professor(String nome, String matricula, String disciplina) {
        this.nome = nome;             // Atribui o nome recebido ao atributo nome
        this.matricula = matricula;   // Atribui a matrícula recebida ao atributo matricula
        this.disciplina = disciplina; // Atribui a disciplina recebida ao atributo disciplina
    }

    // Métodos Getters
   
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }
}