//Crie um programa que armazene uma lista de pessoas (nome e idade) usando um Map.
//1. Armazene as informações em um Map<String, Integer>, onde a chave é o nome e o
//valor é a idade.
//2. 3. Use um Set para armazenar os nomes das pessoas com mais de 30 anos.
//Exiba os nomes das pessoas que possuem mais de 30 anos, ordenados em ordem alfabética.

import java.util.*;

public class Lista {
    public static void main(String[] args) {

                Map<String, Integer> pessoas = new HashMap<>();
                pessoas.put("Ana", 25);
                pessoas.put("Bruno", 35);
                pessoas.put("Carlos", 40);
                pessoas.put("Diana", 28);
                pessoas.put("Eduardo", 32);
                List<String> nomesMaioresDe30 = new ArrayList<>();

                for (Map.Entry<String, Integer> entry : pessoas.entrySet()) {
                    String nome = entry.getKey();
                    int idade = entry.getValue();
                    if (idade > 30) {
                        nomesMaioresDe30.add(nome);
                    }
                }

                Collections.sort(nomesMaioresDe30);

                System.out.println("Pessoas com mais de 30 anos (ordem alfabética):");
                for (String nome : nomesMaioresDe30) {
                    System.out.println(nome);
                }
            }
        }

