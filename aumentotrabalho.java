import java.util.Scanner;
public class aumentotrabalho {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);

        String plano;
        System.out.println("Qual é o seu plano de trabalho? A, B OU C ");
        plano= sc.next().toLowerCase();

        double salario;
        System.out.println("Digite seu salário atual");
        salario=sc.nextDouble();

        double salarionovo;

        switch (plano){
            case "a":
                salarionovo= salario+(salario * 0.10);
                System.out.println("Seu salário atualizado ficou em"+salarionovo);
                break;
            case "b":
                salarionovo= salario+(salario * 0.15);
                System.out.println("Seu salário atualizado ficou em"+salarionovo);
                break;
            case "c":
                salarionovo= salario+(salario * 0.20);
                System.out.println("Seu salário atualizado ficou em"+salarionovo);
                break;
            default:
            System.out.println(" Inválido");
        }
        sc.close();


    }
}
