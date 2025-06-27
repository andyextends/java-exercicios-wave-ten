import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Crie um programa que receba uma lista de números inteiros do usuário e use streams para:
//1. Filtrar os números ímpares.
//2. 3. Dobrar os valores dos números ímpares.
//Ordenar os números resultados em ordem crescente.
//4. Exibir a lista final.
public class NumerosInteiros {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                List<Integer> numeros = new ArrayList<>();
                System.out.println("Digite números inteiros (digite 0 para encerrar):");
                while (true) {
                    int num = sc.nextInt();
                    if (num == 0) break;
                    numeros.add(num);
                }
                // Processar: filtrar ímpares, dobrar, ordenar e exibir
                List<Integer> resultado = numeros.stream()
                        .filter(n -> n % 2 != 0)     // apenas ímpares
                        .map(n -> n * 2)             // dobrar
                        .sorted()                    // ordenar crescente
                        .collect(Collectors.toList());
                System.out.println("Resultado final:");
                resultado.forEach(System.out::println);
            }
        }


