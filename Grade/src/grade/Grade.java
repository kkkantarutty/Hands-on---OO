package grade;
import java.util.Scanner;
import java.util.ArrayList;
public class Grade {

    public static void main(String[] args) {
       ArrayList<Double> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            notas.add(sc.nextDouble());
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.size();
        System.out.println("Média da turma: " + media);

        if (media >= 7) {
            System.out.println("A turma ficou com média maior ou igual a 7");
        } else {
            System.out.println("A turma ficou com média menor que 7");
        }

        sc.close();
    }
    
}
