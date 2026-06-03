import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int id; String nome; double salario;
    
    System.out.print("Serão quantos funcionários: ");
    int n = sc.nextInt();
    sc.nextLine();

    System.out.println("");


    List<Funcionario> funcionarios = new ArrayList<>();

    for(int i = 0; i < n; i++){
       while (true) {
        System.out.print("Qual o id: ");
        id = sc.nextInt();
        sc.nextLine();

        final int idAtual = id;

        boolean idExiste = funcionarios.stream().anyMatch(f -> f.getId() == idAtual);

        if (!idExiste) {
            break;
        }
        System.out.println("Erro: ID já cadastrado. Digite outro.");
    }

      System.out.print("Qual o nome do funcionario: ");
      nome = sc.nextLine();
      
      System.out.print("Qual o salário: ");
      salario = sc.nextDouble();
      sc.nextLine();

      
      funcionarios.add(new Funcionario(id, nome, salario));
      System.out.println("==========================");

    }

    int opcao;

    do {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Listar funcionários");
        System.out.println("2 - Aumentar salário");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                Funcionario.listarFuncionarios(funcionarios);
                break;

            case 2:
                System.out.print("Informe o ID do funcionário: ");
                int idFuncinario = sc.nextInt();

                Funcionario f = funcionarios.stream().filter(x -> x.getId() == idFuncinario).findFirst().orElse(null);

                if(f == null){
                  System.out.println("Esse id não existe!");
                }else{
                  System.out.print("Informe a porcentagem de aumento: ");
                  Double porcentagem = sc.nextDouble();
                  sc.nextLine();

                  f.aumentarSalario(porcentagem);
                  System.out.println("Salário atualizado com sucesso!");
                  System.out.println(f.toString());
                }
                break;

            case 0:
                System.out.println("Programa encerrado.");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

    } while (opcao != 0);



    sc.close();
  }
}