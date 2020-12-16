package entidades.atores;

import entidades.atores.abstratos.Funcionario;

public class OperadorSistema extends Funcionario {
    /* Funções
     * Fazer uma locação de um produto a um cliente
     * Excluir uma locação
     * Fazer baixa de uma locação, cobrando as diárias e multas, caso existam.
     * Procurar produtos por codigo.
     * Procurar clientes por matricula.
     */

    //Construtor
    public OperadorSistema(String nome, int matricula, String login, String senha) {
        super(nome, matricula, login, senha);
    }
}