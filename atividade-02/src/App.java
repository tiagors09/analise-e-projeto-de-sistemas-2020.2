import java.util.Scanner;
import entidades.atores.abstratos.Funcionario;
import basededados.Pessoas;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        boolean shellAtivo = true;
        String linha;
        String[] comandos;
        while(shellAtivo) {
            System.out.println("***Bem-vindo, escolha um perfil abaixo:\n"+
            "1-Gerente\n"+
            "2-Operador de Sistema\n"+
            "3-Sair\n"+
            "Digite a opcao:_<ENTER>");

            linha = in.nextLine();
            comandos = linha.split(" ");
            
        }
    }
}
