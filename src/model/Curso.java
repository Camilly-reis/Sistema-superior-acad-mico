// Classe Curso representa os dados básicos de um curso.
// Assim como a classe Aluno, aplica o princípio de Alta Coesão (High Cohesion),
// pois é responsável apenas por armazenar e disponibilizar informações do curso.



// Declara o pacote onde a classe Curso está localizada
package model;

// Declaração da classe pública Curso

public class Curso {

    // Armazena o nome e a carga horaria
    private String nome;
    private int cargaHoraria;

    // Construtor

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;                  // Atribui o nome recebido ao atributo nome
        this.cargaHoraria = cargaHoraria;  // Atribui a carga horaria recebido ao atributo caraga horaria
    }

    // Métodos Getters

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
