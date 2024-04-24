import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // EXIBIR MENSAGEM NO CONSOLE
        System.out.printf("Hello and welcome!");

        // VARIÁVEIS (PRIMITIVAS) - byte, short, int, long, char, double, float, boolean
        // tipo nome = valor;
        byte idade = 19;
        char sexo = 'm';
        boolean brasileiro = true;
        float salario = 1320F;

        // VARIÁVEIS (NÃO PRIMITIVAS - CLASSE) - String
        String nome = "Guilherme";
        Integer anoNascimento = 2005;

        // VARIÁVEIS DE ESCOPO - É UTILIZAVEL APENAS NO ESCOPO ONDE FOI DECLARADA
        // é obrigatorio atrubuir um valor inicial durante a declaração da variável
        // var nome = valor;

        // CONDIÇÃO IF E ELSE
        if (idade >= 60){
            System.out.println("Maior de idade - Idoso!");
        } else if (idade >= 18) {
            System.out.println("Maior de idade - Adulto!");
        } else {
            System.out.println("Menor de idade!");
        }

        // VETOR (ARRAY) - TAMANHO FIXO
        // tipo[] nome;
        // int[] numeros = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        // int[] numeros = new int[10];
        // numeros.lenght -> RETORNA O TAMANHO DO ARRAY

        // ARRAYLIST - LISTA DINÂMICA - TAMANHO DINÂMICO
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.remove(0); // EXCLUI ELEMENTO DE ÍNDICE 0
        numeros.get(1); // PEGA ELEMENTO DE ÍNDICE 1
        numeros.size(); // RETORNA O TAMANHO DO ARRAY DINÂMICO

        // LOOPING FOR
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // LOOPING WHILE
        int x = 15;
        while(x > 0){
            System.out.println("x = " + x);
            x--;
        }

        // CASTING - CONVERTER NÚMERO DE INT PARA DOUBLE E VICE-VERSA
        // CASTING IMPLÍCITO
        int numeroInteiro = 22;
        double numeroDouble = numeroInteiro;

        // CASTING EXPLÍCITO
        // numeroInteiro = numeroDouble;  -> ERRO
        numeroInteiro = (int) numeroDouble;
    }
}