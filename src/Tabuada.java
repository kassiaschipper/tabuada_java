import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um número para gerar a tabuada: ");
        
        int num = in.nextInt();

        System.out.println("Tabela de multiplicação de " + num);

        for (int i = 1; i<11; i++){
            System.out.println(i + " x " + num + " = " + num*i);
        }
    }
}
