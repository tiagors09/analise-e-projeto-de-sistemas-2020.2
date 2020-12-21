package entidades.atores;

import entidades.atores.abstratos.Pessoa;
public class Cliente extends Pessoa {
    private String endereco;
    private int idade;
    private char sexo;

    /**
     * Construtor do Cliente
     * @param nome do cliente
     * @param matricula código do cliente
     * @param endereco local onde cliente mora
     * @param idade do cliente
     * @param sexo do cliente
     */
    public Cliente(String nome, int matricula, String endereco, int idade, char sexo) {
        super(nome, matricula);
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Obtêm endereço
    public String getEndereco() {
        return endereco;
    }

    /*
     * Muda endereço do cliente
     * @param endereco endereco do aluno
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Obtêm idade  
    public int getIdade() {
        return idade;
    }

    /*
     * Muda idade do cliente
     * @param idade idade do cliente
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Obtêm sexo do cliente
    public char getSexo() {
        return sexo;
    }

    /* 
     * Muda sexo do cliente
     * @param sexo caractere F ou M para definir sexo do cliente
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String toString() {
        return "Nome: "+nome+", "+"Idade: "+idade;
    }
}
