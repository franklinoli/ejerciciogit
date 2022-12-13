import java.util.Scanner;

public class EjercicioStringsGit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ejercicio6;
        int posi1;
        
        System.out.println("Escriba una palabra o frase");
        ejercicio6 = sc.nextLine();
        System.out.println("Escriba un número entre 0 y " + (ejercicio6.length() - 1));
        posi1 = sc.nextInt();
        System.out.println("Dímelo");
        
    }
}
