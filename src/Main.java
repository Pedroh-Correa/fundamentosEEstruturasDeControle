import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("Bem vindo a calculadora de media");

        System.out.println("Digite a primeira nota:");
        int nota1 =  scanner.nextInt();

        System.out.println("Digite a primeira nota:");
        int nota2 =  scanner.nextInt();

        System.out.println("Digite a primeira nota:");
        int nota3 =  scanner.nextInt();

        double media = (nota1+nota2+nota3) / 3;

        if(media>=7){
            System.out.println("Aprovado");
        }else{
            if(media<7 && media >= 5){
                System.out.println("Recuperacao");
            }else{
                System.out.println("Reprovado");
            }
        }

        System.out.println("Bem vindo a tabuada digital");
        System.out.println("Digite o numero que gostaria de saber a tabuada do 1 ao 10");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(resultado);
        }


        scanner.close();
    }
}
