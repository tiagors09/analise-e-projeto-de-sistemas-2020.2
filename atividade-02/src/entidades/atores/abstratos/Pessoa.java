package entidades.atores.abstratos;

public abstract class Pessoa {
    /** nome da pessoa */ 
    protected String nome;
    /** matricula da pessoa */
    protected int matricula;

    /** 
     * Construtor Pessoa.
     * @param nome da pessoa.
     * @param matricula código de cadastro.
     * */ 
    public Pessoa(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Obtêm nome
    public String getNome() {
        return nome;
    }

    /*
     * Muda nome da pessoa
     * @param nome nome da pessoa
     */
    protected void setNome(String nome) {
        this.nome = nome;
    }

    // Obtêm matricula da pessoa
    public int getMatricula() {
        return matricula;
    }

    /*
     * Muda matricula
     * @param matricula matricula da pessoa
     */
    protected void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}