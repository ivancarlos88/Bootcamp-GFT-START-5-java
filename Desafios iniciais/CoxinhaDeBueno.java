package B�sico;

import java.util.Scanner;

public class CoxinhaDeBueno {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double A = scan.nextDouble();
    double B = scan.nextDouble();
  
//TODO: Complete os espa�os em branco com uma poss�vel solu��o para o desafio
    double media = A / B;

    System.out.printf("%.2f",     media  );
  }
}