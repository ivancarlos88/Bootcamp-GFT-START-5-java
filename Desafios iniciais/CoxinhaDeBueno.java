package Básico;

import java.util.Scanner;

public class CoxinhaDeBueno {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double A = scan.nextDouble();
    double B = scan.nextDouble();
  
//TODO: Complete os espaços em branco com uma possível solução para o desafio
    double media = A / B;

    System.out.printf("%.2f",     media  );
  }
}