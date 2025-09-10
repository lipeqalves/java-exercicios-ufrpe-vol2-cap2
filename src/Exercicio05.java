/*
5. Escreva um programa em Java que dada a variável x definida no início do programa,
calcule o fatorial deste número.
 */

public class Exercicio05 {
    public static void main(String[] args) {
        int n=5;
        int fatorial = 1;
        if(n == 0){
            System.out.println(fatorial);
        }else{
            for (int i = 1; i <= n; i++) {
                fatorial = fatorial*i;
            }
            System.out.println("O fatorial de " + n + " é " + fatorial);
        }
    }
}
