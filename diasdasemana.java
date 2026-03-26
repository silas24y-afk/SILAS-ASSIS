import java.util.Scanner;
public class diasdasemana {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);

        int dias;
        System.out.println(" Digite um número de 1 a 7");
        dias = sc.nextInt();

        while (dias <1 || dias >7 ){
            System.out.println("Não faz parte do número da semana");
            dias = sc.nextInt();

        }

        switch (dias){
            case 1:
                System.out.println("1- Domingo");
                break;
            case 2:
                System.out.println("2- Segunda-Feira");
                break;
            case 3:
                System.out.println("3- Terça-Feira");
                break;
            case 4:
                System.out.println("4- Quarta-Feira");
                break;
            case 5:
                System.out.println("5- Quinta-feira");
                break;
            case 6:
                System.out.println("6- Sexta-feira");
                break;
            case 7:
                System.out.println("7- Sábado");
                break;


        }
        sc.close();


    }
}
