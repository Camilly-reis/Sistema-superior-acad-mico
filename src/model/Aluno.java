// Declara o pacote onde a classe Aluno está localizada
package model;

// Declaração da classe pública Aluno
public class Aluno {

    // Armazena o nome e o número de matrícla do aluno
    private String nome;
    private String matricula;

    // ===== CONSTRUTOR =====

    public Aluno(String nome, String matricula) {
        this.nome = nome;            // Atribui o nome recebido ao atributo nome
        this.matricula = matricula;  // Atribui a matrícula recebida ao atributo matricula
    }

    // ===== MÉTODOS GETTERS =====

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
