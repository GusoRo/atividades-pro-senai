import static java.lang.IO.*;
import java.util.ArrayList;

void main() {

    ArrayList<String> alunos = new ArrayList<String>();
    String opcao;

    do {
        IO.println("\nBem-Vindo ao Sistema de Cadastro");
        IO.println("=======MENU DE OPÇÕES=======");
        IO.println("1- Cadastrar aluno");
        IO.println("2- Listar alunos");
        IO.println("3- Buscar aluno pelo nome");
        IO.println("4- Remover aluno");
        IO.println("5- Sair");

        opcao = readln("\nDigite a opção desejada: ");

        if (opcao.equals("1")) {

            IO.println("\n=== CADASTRO DE ALUNO ===");

            String nome = readln("Digite o nome do aluno: ");
            alunos.add(nome);

            IO.println("Aluno cadastrado com sucesso!");

        } else if (opcao.equals("2")) {

            IO.println("\n=== LISTA DE ALUNOS ===");

            if (alunos.size() == 0) {
                IO.println("Nenhum aluno cadastrado.");
            } else {
                for (int i = 0; i < alunos.size(); i++) {
                    IO.println((i + 1) + " - " + alunos.get(i));
                }
            }

        } else if (opcao.equals("3")) {

            IO.println("\n=== BUSCAR ALUNO ===");

            String nomeBusca = readln("Digite o nome do aluno: ");

            if (alunos.contains(nomeBusca)) {
                IO.println("Aluno encontrado!");
            } else {
                IO.println("Aluno não encontrado.");
            }

        } else if (opcao.equals("4")) {

            IO.println("\n=== REMOVER ALUNO ===");

            String nomeRemover = readln("Digite o nome do aluno: ");

            if (alunos.remove(nomeRemover)) {
                IO.println("Aluno removido com sucesso!");
            } else {
                IO.println("Aluno não encontrado.");
            }

        } else if (opcao.equals("5")) {

            IO.println("\nFINALIZANDO PROGRAMA...");

        } else {

            IO.println("Opção inválida!");

        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    } while (!opcao.equals("5"));
}