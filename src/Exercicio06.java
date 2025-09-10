/**
6. A série de fibonacci é uma conhecida sucessão de números que começam 0 e 1,
e que os demais termos são resultados da soma de seus dois antecessores, como
ilustrado abaixo:
0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, ...
Escreva um programa em java que apresente os 50 primeiros termos desta série.
 */
public class Exercicio06 {
    public static void main(String[] args) {
        int n = 50;
        long soma = 0;
        long termo1 = 0;
        long termo2 = 1;
        System.out.println(termo1);
        for (int i = 0; i <= n; i++) {
            termo1 = termo2;
            termo2 = soma;
            soma =  termo1 + termo2;
            System.out.println(soma);
        }
    }
}
