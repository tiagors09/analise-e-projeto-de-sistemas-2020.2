import java.util.Scanner;

import entidades.atores.Cliente;
import entidades.atores.Gerente;
import entidades.atores.OperadorSistema;
import entidades.atores.abstratos.Pessoa;

public class Shell {
    private Scanner en;
    private Gerente g;
    private OperadorSistema op;
    private boolean shellAtivo;

    public Shell() {
        en = new Scanner(System.in);
        g = new Gerente();
        op = new OperadorSistema();
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
    
    private Pessoa telaLogin() {
        System.out.print("***Faça seu Login****\n");
        System.out.print("Digite seu login:_<ENTER> ");
        String login = en.next();
        System.out.print("Digite sua senha:_<ENTER> ");
        String senha = en.next();
        return null;
    }
    
    private void visaoGerente(Gerente g) {
        System.out.println("****Olá Gerente <"+g.getNome()+">*****\n"+
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
        respostaGerente(en.nextInt(), g);
    }
    
    private void visaoOperador(OperadorSistema os) {
        System.out.println("****Olá Operador <"+os.getNome()+">****\n"+
        "1 – Fazer locação\n"+
        "2 – Dar baixa em locação\n"+
        "3 – Excluir locação\n"+
        "4 – Procurar Produto\n"+
        "5 – Procurar Cliente\n"+
        "6 – Sair\n"+
        "Digite a opção:_<ENTER>");
        respostaOperador(en.nextInt(), os);
    }    

    private void respostaGerente(int op, Gerente g) {
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

    private void respostaOperador(int op, OperadorSistema os) {
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
                    break;
                case 2:
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
