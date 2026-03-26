import java.util.Scanner;
public class cardapiolanchonete {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);

        String produto;
        System.out.println("Qual é o seu pedido?");
        System.out.printf("100-Cachorro Quente  R$1.20");
        System.out.println("101-Bauru Simple  R$1.30");
        System.out.println("102-Bauru com ovo   R$1.50");
        System.out.println("103-Hambúguer  R$1.20");
        System.out.println("104-Cheeseburguer  R$1.30");
        System.out.println("105-Refrigerante  R$1.00");
        produto=sc.next();

        int quantidade;
        System.out.println(" Qual seria a quantidade?");
        quantidade=sc.nextInt();

        double calculo;

        switch (produto){
            case "100":
                calculo=quantidade * 1.20;
                System.out.println("O valor do cachorro quente ficou: "+calculo);
                break;

            case "101":
                calculo=quantidade * 1.30;
                System.out.println("O valor do bauru simple ficou: "+calculo);
                break;

            case "102":
                calculo=quantidade * 1.50;
                System.out.println("O valor do bauru com ovo ficou: "+calculo);
                break;

            case "103":
                calculo=quantidade * 1.20;
                System.out.println("O valor do hambúguer ficou: "+calculo);
                break;

            case "104":
                calculo=quantidade * 1.00;
                System.out.println("O valor do chessburguer ficou: "+calculo);
                break;

            case "105":
                calculo=quantidade * 1.00;
                System.out.println("O valor do refrigerante ficou: "+calculo);
                break;

            default:
                System.out.println(" Produto inválido");
        }
        sc.close();


    }

}
