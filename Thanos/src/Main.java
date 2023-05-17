import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static ArrayList<String> listaDePessoas = new ArrayList<>(Arrays.asList("Allana","Ângelo","Caio", "Carlos", "Diego C", "Diego A", "Eduarda", "Esther", "Felipe", "Gabriel", "Giovana  R", "Giovana F", "Giovana V", "Henique", "Julia", "Laura", "Lucas", "Nicole"));
    static Scanner entrada = new Scanner(System.in);
    static Random random = new Random();

    public static void mostrarPessoas(){
        System.out.println(listaDePessoas);
    }

    public static void adicionarPessoas(String nome){
        listaDePessoas.add(nome);
    }
    public static void main(String[] args) {
        while (true) {
            try{
                System.out.println("--- REMOVER METADE ---\n1 - Vizualizar Lista de Pessoas\n2 - Adicionar Pessoas\n3 - Remover Metade\n4 - Sair");
                int opcao = entrada.nextInt();
                switch (opcao){
                    case 1:{
                        mostrarPessoas();
                    }
                    case 2:{
                        System.out.println("Quantas pessoas você deseja adicionar?");
                        int quantidade = entrada.nextInt();
                        entrada.nextLine();
                        for (int i = 0; i <= quantidade; i++) {
                            System.out.println("Digite o nome da Pessoa:");
                            String pessoa = entrada.nextLine();
                            adicionarPessoas(pessoa);
                        }
                    }
                    case 3:{
                        continue;
                    }
                }
            } catch (Exception e) {
                System.out.println("Erro");
            }
        }
    }
}
