import java.util.Scanner;


public class DegustacaoDeVinho {

 public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

  String T = scan.nextLine();
  String respostasCompetidores = scan.nextLine();
  String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");

  int count = 0;

  for ( String i : respostasCompetidoresSplit) {

    if(i.equals(T))
    ++count;
  }
  System.out.println(count);

 }
}