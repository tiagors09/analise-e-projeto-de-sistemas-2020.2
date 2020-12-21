import java.util.Scanner;

import entidades.atores.*;
import entidades.atores.abstratos.Funcionario;
import basededados.Pessoas;
import entidades.produtos.filme.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(System.in);
        // boolean shellAtivo = true;
        // String linha;
        // String[] comandos;

        Gerente g = new Gerente("Tiago", 0101, "0101", "0101");
        Vhs vhs1 = new Vhs("0001", "Ocean Man", "Terror", false, 1999, 120, false);
        Vhs vhs2 = new Vhs("0002", "Ocean Man 2", "Terror", false, 2000, 120, true);
        Vhs vhs3 = new Vhs("0003", "Ocean Man 3", "Terror", false, 2005, 120, true);
        var bluray = new BluRay("0004", "Avengers", "Heroi", true, 2019, 180, new String[]{"pt-br", "en-gus"});
        g.adicionarProduto(vhs1);
        g.adicionarProduto(vhs2);
        g.adicionarProduto(vhs3);
        g.adicionarProduto(bluray);
        g.listarProdutos();

        var ops = new OperadorSistema("Tiago", 001, "001", "001");
        System.out.println("add");
        var ops2 = new OperadorSistema("Pedro", 002, "002", "002");
        var ops3 = new OperadorSistema("Carlos", 003, "003", "003");
        var c = new Cliente("Lucas", 004, "Rua Jose Pires Chaves", 19, 'M');
        g.adicionarCliente(c);
        g.adicionarOperador(ops);
        g.adicionarOperador(ops2);
        g.adicionarOperador(ops3);
        g.listarOperadores();
        var c2 = g.procurarCliente("4");
        System.out.println(c2);
    }
}
