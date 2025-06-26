//● Crie um programa que preencha uma matriz 3x3 com números inteiros fornecidos pelo usuário. Em
//seguida, calcule e exiba a soma de todos os elementos da matriz e a soma de cada linha.

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int matriz [] [] = new int[3][3];
        Scanner sc  = new Scanner(System.in);

        for ( int linha= 0; linha < 3; linha ++){
            for ( int coluna= 0; coluna < 3; coluna ++){
                System.out.println("Digite um numero");
                matriz[linha][coluna] = sc.nextInt();
                System.out.println("monstre numero " + matriz[linha][coluna]);
                System.out.println(matriz [linha][coluna]);

            }


        }


        for ( int linha= 0; linha < 3; linha ++){
            for ( int coluna= 0; coluna < 3; coluna ++){
                System.out.printf("%4d", matriz [linha][coluna] );
            }
            System.out.println();
        }

        int soma = 0;

        for ( int linha= 0; linha < 3; linha ++){
            for ( int coluna= 0; coluna < 3; coluna ++){

                soma += matriz[linha][coluna];
            }

        }
        System.out.printf("A soma total dos valores da matriz é: %d\n", soma);



        for ( int linha= 0; linha < 3; linha ++){
            int somaLinha = 0;
            for ( int coluna= 0; coluna < 3; coluna ++){

                somaLinha += matriz[linha][coluna];
            }
            System.out.printf("A soma total dos valores por linha é: %d\n", somaLinha);
        }


    }



}


