/**
 7. Um número é considero primo se ele só divisível por si próprio e por um. Escreva
um programa em Java que a partir de um valor definido em uma variável no início
do programa, apresenta todos os números primos de 1 até o número escolhido.
Dica: Use laços aninhados.
 */
public class Exercicio07 {
    public static void main(String[] args) {
        int n = 10;
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i%j == 0) {
                    cont++;
                }
            }
            if (i == 1 || cont > 2) {
                System.out.println(i + " Não Primo");
            } else {
                System.out.println(i + " Primo");
            }
            cont = 0;
        }
    }
}
