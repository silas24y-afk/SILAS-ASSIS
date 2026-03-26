import java.util.Scanner;
public class peridoaluno {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String periodo;
        System.out.println(" Qual é o seu periodo conforme as inicias das letras? Sendo M- Matutino, V-Vespertino ou N-Noturno");
        periodo= sc.next();

        while (!periodo.equals("M") && !periodo.equals("V") && !periodo.equals("N")) {
            System.out.println(" Por gentileza digitar essas letras de acordo com o seu periodo (M, V OU N");
            periodo = sc.next();


        }
        switch (periodo) {
            case "M":
                System.out.println("M- Matutino");
                break;
            case "V":
                System.out.println("V- Vespertino");
                break;
            case "N":
                System.out.println("N- Noturno");
                break;


        }
        sc.close();
    }
}
