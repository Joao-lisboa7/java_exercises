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
      id = i + 1;

      System.out.print("Qual o nome do funcionario: ");
      nome = sc.nextLine();
      
      System.out.print("Qual o salário: ");
      salario = sc.nextDouble();
      sc.nextLine();
      
      funcionarios.add(new Funcionario(id, nome, salario));
      System.out.println("==========================");

      id++;
    }

    Funcionario.listarFuncionarios(funcionarios);


    sc.close();
  }
}