import java.util.Scanner;
public class imprimames {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int mes;
        System.out.println(" Digite um número de 1 a 12");
        mes = sc.nextInt();

        while (mes < 1 || mes > 12) {
            System.out.println(" Número errado, por favor digite um número entre 1 a 12");
            mes = sc.nextInt();

        }

        switch (mes) {
            case 1:
                System.out.println("1- Janeiro");
                break;
            case 2:
                System.out.println("2- Fevereiro");
                break;
            case 3:
                System.out.println("3- Março");
                break;
            case 4:
                System.out.println("4- Abril");
                break;
            case 5:
                System.out.println("5- Maio");
                break;
            case 6:
                System.out.println("6- Junho");
                break;
            case 7:
                System.out.println("7- Julho");
                break;
            case 8:
                System.out.println("8- Agosto");
                break;
            case 9:
                System.out.println("9- Setembro");
                break;
            case 10:
                System.out.println("10- Outubro");
                break;
            case 11:
                System.out.println("11- Novembro");
                break;
            case 12:
                System.out.println("12- Dezembro");
                break;

        }
        sc.close();
    }

}
