import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static ArrayList<String> listaDePessoas = new ArrayList<>(Arrays.asList("Allana","Ângelo","Caio", "Carlos", "Diego C", "Diego A", "Eduarda", "Esther", "Felipe", "Gabriel", "Giovana R", "Giovana F", "Giovana V", "Henrique", "Julia", "Laura", "Lucas", "Nicole"));
    static Scanner entrada = new Scanner(System.in);
    static Random random = new Random();

    public static void mostrarPessoas(){
        System.out.printf("Nossa lista possui %d pessoas\n", listaDePessoas.size());
        System.out.println(listaDePessoas);
    }

    public static void adicionarPessoas(String nome){
        listaDePessoas.add(nome);
        System.out.printf("Agora nossa lista possui %d pessoas\n", listaDePessoas.size());
        System.out.println(listaDePessoas);
        System.out.println();
    }

    public static void removerMetade(){
        int quantosRemover;
        int tamanho = listaDePessoas.size();
        if (tamanho == 0){
            System.out.println("Nossa lista já acabou, possuem 0 pessoas");
        } else {
            if (tamanho % 2 == 0){
                quantosRemover = tamanho/2;
            } else {

                quantosRemover = (tamanho / 2) + 1;
            }
            System.out.printf("Nossa lista possui %d pessoas, logo vamos remover %d delas\n", tamanho, quantosRemover);
            for (int i = 0; i < quantosRemover; i++) {
                int remover = random.nextInt(tamanho - i);
                listaDePessoas.remove(remover);
            }
            System.out.printf("Sobraram essas %d pessoas: ", listaDePessoas.size());
            System.out.println(listaDePessoas);
        }
    }

    public static void main(String[] args) {
        while (true) {
            try{
                System.out.println("--------------------------------");
                System.out.println("--- REMOVER METADE ---\n1 - Vizualizar Lista de Pessoas\n2 - Adicionar Pessoas\n3 - Remover Metade\n4 - Sair");
                System.out.println("--------------------------------");
                int opcao = entrada.nextInt();
                switch (opcao){
                    case 1:{
                        mostrarPessoas();
                        break;
                    }
                    case 2:{
                        System.out.println("Quantas pessoas você deseja adicionar?");
                        int quantidade = entrada.nextInt();
                        entrada.nextLine();
                        for (int i = 0; i < quantidade; i++) {
                            System.out.println("Digite o nome da Pessoa:");
                            String pessoa = entrada.nextLine();
                            adicionarPessoas(pessoa);
                        }
                        break;
                    }
                    case 3:{
                        removerMetade();
                        break;
                    }
                    case 4:{
                        break;
                    }
                    default:{
                        System.out.println("Esse número não é válido");
                    }
                }
                if (opcao == 4){
                    break;
                }
            } catch (Exception e) {
                entrada.nextLine();
                System.out.println("Erro");
            }
        }
    }
}
