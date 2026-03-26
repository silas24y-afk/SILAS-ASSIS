import java.util.Scanner;
public class recebadoisnumeros {
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);

        double num1;
        System.out.println("Digite o primeiro número");
        num1=sc.nextDouble();

        double num2;
        System.out.println("Digite o seu segundo número");
        num2=sc.nextDouble();

        String opcao;
        System.out.println("Escolha a opção:");
        System.out.println("M: Média entre os números digitados");
        System.out.println("S: Diferença do maior pelo menor");
        System.out.println("P: Produto entre os números digitados");
        System.out.println("D: Divisão do primeiro pelo segundo");
        opcao= sc.next().toLowerCase();//toLowecase é para rodar tudo em letra minúscula, o case precisa ser minúsculo


        double calculo;
        double diferenca;

        switch (opcao){
            case "m":
                calculo= (num1 + num2)/2;
                System.out.println("A sua média atual é:"+calculo);
                break;
            case "s":
                if ( num1 > num2){
                    calculo= num1 - num2;

                }
                else {
                    calculo= num2 - num1;
                }
                System.out.println("A diferença do maior pelo menor é:"+calculo);
                break;
            case "p":
                calculo= num1* num2;
                System.out.println("O produto entre os número digitados é:"+calculo);
                break;
            case "d":
                calculo= num1 / num2;
                System.out.println("A divisão do primeiro pelo segundo é:"+calculo);
                break;

            default:
                System.out.println("Opções inváldas");
        }
        sc.close();
    }


}
