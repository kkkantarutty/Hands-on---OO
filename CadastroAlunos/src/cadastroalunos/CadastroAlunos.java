package cadastroalunos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CadastroAlunos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> alunos = new HashMap<>();

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Buscar aluno");
            System.out.println("3 - Remover aluno");
            System.out.println("4 - Mostrar todos os alunos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Digite a matrícula: ");
                    int matricula = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    alunos.put(matricula, nome);

                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:

                    System.out.print("Digite a matrícula do aluno: ");
                    int buscaMatricula = sc.nextInt();

                    if (alunos.containsKey(buscaMatricula)) {
                        System.out.println("Aluno encontrado: " + alunos.get(buscaMatricula));
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }

                    break;

                case 3:

                    System.out.print("Digite a matrícula do aluno que deseja remover: ");
                    int removerMatricula = sc.nextInt();

                    if (alunos.containsKey(removerMatricula)) {
                        alunos.remove(removerMatricula);
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }

                    break;

                case 4:

                    System.out.println("\n=== Lista de Alunos ===");

                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {

                        for (Map.Entry<Integer, String> aluno : alunos.entrySet()) {

                            System.out.println(
                                "Matrícula: " + aluno.getKey() +
                                " | Nome: " + aluno.getValue()
                            );
                        }
                    }

                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

        sc.close();
    }
}
