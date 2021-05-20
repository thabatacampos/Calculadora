package calculadorasimples;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        double n1, n2;
        double soma, subtracao, multiplicacao, divisao;
        int op;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        n1 = entrada.nextDouble();
        System.out.println("Informe o segundo valor; ");
        n2 = entrada.nextDouble();

        System.out.println("*Selecione uma operação*");
        System.out.println("[1] - SOMA");
        System.out.println("[2] - SUBTRAÇÃO");
        System.out.println("[3] - MULTIPLICAÇÃO");
        System.out.println("[4] - DIVISÃO");
        System.out.println(" Digitite sua opção: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                soma = n1+n2;
                System.out.println("A soma é: "+soma);
                break;

            case 2:
                subtracao = n1-n2;
                System.out.println("A subtração é: "+subtracao);
                break;

            case 3:
                multiplicacao = n1*n2;
                System.out.println("A multiplicação é: "+multiplicacao);
                break;

            case 4:
                if (n1<n2){
                    System.out.println("Impossivel realizar o calculo");
                }
                else {
                    divisao = n1 / n2;
                    System.out.println("A divisão é: " + divisao);
                }
                break;

            default:
                System.out.println("Operação invalida: ");

        }
    }
}
