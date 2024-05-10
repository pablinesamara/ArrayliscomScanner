import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome :");
        String nome = sc.nextLine();
        System.out.println("Informe a sua idade :");
        int idade = sc.nextInt();
        ArrayList<String>nomes= new ArrayList<String>();*/
        scan=new Scanner(System.in);
        ArrayList<Integer>idades=new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            System.out.println("Digite o valor da posição : "+i);
            idades.add(scan.nextInt());
            System.out.println("ESTE É O MEU ARRAYLIST: "+idades);
        }


    }
}
