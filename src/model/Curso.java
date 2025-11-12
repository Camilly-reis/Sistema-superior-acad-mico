// Declara o pacote onde a classe Curso está localizada
package model;

// Declaração da classe pública Curso

public class Curso {

    // Armazena o nome e a carga horaria
    private String nome;
    private int cargaHoraria;

    // ===== CONSTRUTOR =====

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;                  // Atribui o nome recebido ao atributo nome
        this.cargaHoraria = cargaHoraria;  // Atribui a carga horaria recebido ao atributo caraga horaria
    }

    // ===== MÉTODOS GETTERS =====

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
