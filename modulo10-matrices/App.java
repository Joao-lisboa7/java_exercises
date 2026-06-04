import java.util.Scanner;

public class App{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();
    int [][] matriz = new int[n][n];

    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.print("Diagonal principal:");
    for(int i = 0; i < n; i++){
      System.out.print(matriz[i][i] + " ");
    }

    System.out.println();

    int quantNegativos = 0;
    sc.nextLine();

    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if(matriz[i][j] < 0){
          quantNegativos++;
        }
      }
    }

    System.out.println("Quantidade de numeros negativos: " + quantNegativos);

    sc.close();
  }
}