// Classe Aluno representa uma entidade do sistema.
// Esta classe segue o princípio de Alta Coesão (High Cohesion),
// pois sua responsabilidade está claramente definida:
//armazenar e fornecer dados do aluno.


// Declara o pacote onde a classe Aluno está localizada
package model;

// Declaração da classe pública Aluno
public class Aluno {

    // Armazena o nome e o número de matrícla do aluno
    private String nome;
    private String matricula;

    // Construtor

    public Aluno(String nome, String matricula) {
        this.nome = nome;            // Atribui o nome recebido ao atributo nome
        this.matricula = matricula;  // Atribui a matrícula recebida ao atributo matricula
    }

    // Métodos Getters

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
