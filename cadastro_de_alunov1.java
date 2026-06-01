import static java.lang.IO.*;
import java.util.ArrayList;

void main() {

    ArrayList<String> alunos = new ArrayList<String>();
    String opcao;
 \

    do {
        IO.println("Bem-Vindo ao Sistema de Cadastro\n" +
                "=======MENU DE OPÇÕES=======\n" +
                "1- Cadastar aluno\n" +
                "2- Lista alunos\n" +
                "3- Buscar aluno pelo nome\n" +
                "4- Remover aluno\n" +
                "5- Sair");

        opcao = readln("\nDIGITE a opcao desejada: ");


        IO.println("\nOpção escolhida:" + opcao);

        if (opcao.equals("1")) {
            IO.println("\nIniciando Cadastro.....");

        }else if (opcao.equals("2")) {
            IO.println("\nIniciando listangem de alunos.....");

        }else if (opcao.equals("3")) {
            IO.println("\nBuscar aluno.....");

        }else if (opcao.equals("4")) {
            IO.println("\nRemover aluno.....");

        } else if (opcao.equals("5")) {
            IO.println("\nFINALIZANDO PROGRAMA...");
            break;
        }
        try {
            Thread.sleep(3000); // espera 5 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    } while (!opcao.equals("5"));
    {
        IO.println("\nOpção escolhida:" + opcao);
    }


}