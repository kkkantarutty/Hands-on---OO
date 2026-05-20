package students;
import java.util.Scanner;
import java.util.HashSet;

public class Students {

    public static void main(String[] args) {
        HashSet<String> alunos = new HashSet<>();
        alunos.add("Ana");
        alunos.add("Bruno");
        alunos.add("Carlos");
        alunos.add("Ana");
        alunos.add("Bruno");

        System.out.println("Alunos presentes: " + alunos);
        System.out.println("Quantidade de alunos presentes: " + alunos.size());
    }
    
}
