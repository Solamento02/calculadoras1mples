import java.util.Scanner;

public class Calculando {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    

    int A, B , SOMA;

    A = sc.nextInt();
    B = sc.nextInt();

    SOMA = A + B;

    int C, D , SUBTRAÇÃO;

    C = sc.nextInt();
    D = sc.nextInt();

    SUBTRAÇÃO = C - D;

    int E, F , DIVISÃO;

    E = sc.nextInt();
    F = sc.nextInt();

    DIVISÃO = E/F;

    int G, H , MULTIPLICAÇÃO;

    G = sc.nextInt();
    H = sc.nextInt();

    MULTIPLICAÇÃO = G*H;

    int I,J, POTENCIAÇÃO;

    I = sc.nextInt();
    J = sc.nextInt();

    POTENCIAÇÃO = (int)Math.pow(I,J);

    System.out.println("Ok..ok..Seus resultados: Soma: " + SOMA + "| Subtração: " + SUBTRAÇÃO + " | Divisão: " + DIVISÃO + "| Multiplicação: " + MULTIPLICAÇÃO + "| Potência: " + POTENCIAÇÃO);

    sc.close();
    
  }
}
