import java.util.Scanner;

import basededados.Pessoas;
import entidades.atores.Cliente;
import entidades.atores.Gerente;
import entidades.atores.OperadorSistema;
import entidades.atores.abstratos.Funcionario;

public class Shell {
    private Scanner en;
    private boolean shellAtivo;

    public Shell() {
        en = new Scanner(System.in);
        shellAtivo = true;
    }

    private int telaPerfil() {
        System.out.println("****Bem-vindo, escolha um perfil abaixo:\n"+
        "1-Gerente\n"+
        "2-Operador de Sistema\n"+
        "3-Sair\n"+
        "Digite a opção:_<ENTER>");
        return en.nextInt();
    }
    
    private Funcionario telaLogin() {
        System.out.print("***Faça seu Login****\n");
        System.out.print("Digite seu login:_<ENTER> ");
        var login = en.next();
        System.out.print("Digite sua senha:_<ENTER> ");
        var senha = en.next();
        if (Pessoas.obterInstancia().getPessoas().containsKey(login))
           return (Funcionario) Pessoas.obterInstancia().getPessoas().get(login);
        return null;
    }
    
    private void visaoGerente(Funcionario f) {
        System.out.println("****Olá Gerente <"+f.getNome()+">*****\n"+
        "1 – Cadastrar Produto\n"+
        "2 – Cadastrar Cliente\n"+
        "3 – Cadastrar Operador\n"+
        "4 – Listar Produtos\n"+
        "5 – Listar Clientes\n"+
        "6 – Listar Operadores\n"+
        "7 – Procurar Produto\n"+
        "8 – Procurar Cliente\n"+
        "9 – Procurar Operador\n"+
        "10 – Sair\n"+
        "Digite a opção:_<ENTER>");
        respostaGerente(en.nextInt(), f);
    }
    
    private void visaoOperador(Funcionario f) {
        System.out.println("****Olá Operador <"+f.getNome()+">****\n"+
        "1 – Fazer locação\n"+
        "2 – Dar baixa em locação\n"+
        "3 – Excluir locação\n"+
        "4 – Procurar Produto\n"+
        "5 – Procurar Cliente\n"+
        "6 – Sair\n"+
        "Digite a opção:_<ENTER>");
        respostaOperador(en.nextInt(), f);
    }    

    private void respostaGerente(int op, Funcionario f) {
        Gerente g = (Gerente) f;
        switch (op) {
            case 1:
                g.adicionarCliente(new Cliente());
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                g.listarClientes();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                shellAtivo = false;
                break;
            default:
                break;
        }
    }

    private void respostaOperador(int op, Funcionario f) {
        switch (op) {
            case 6:
                shellAtivo = false;
                break;
            default:
                break;
        }
    }

    public void run() {
        while(shellAtivo) {
            switch (telaPerfil()) {
                case 1:
                    if(telaLogin() == null) 
                        visaoGerente(new Gerente("Tiago", 1, "1"));
                    else visaoGerente(telaLogin());
                    break;
                case 2:
                    visaoOperador(telaLogin());
                    break;
                case 3:
                    shellAtivo = false;
                    break;
                default:
                    break;
            }
        }
    }
}
