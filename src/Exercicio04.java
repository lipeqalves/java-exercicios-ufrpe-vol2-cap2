/**
4. A conversão de um valor registrando uma temperatura pode ser apresentada
utilizando graus Celsius ou Fahrenheit. A conversão entre estas escalas é dada pela
fórmula: celsius/5 -> fahrenheit-32/9

Escreva um programa em java que apresente os valores de temperatura entre -10 e
40 graus Celsius convertidos em Fahrenheit.
 */
public class Exercicio04 {
    public static void main(String[] args) {
        // Exercício 04
        double fahrenheit;
        for (int celsius = -10; celsius <= 40; celsius++) {
            fahrenheit = ((double)9/5)*celsius + 32;
            System.out.println("Temperatura em Celsius: " + celsius + "  Temperatura em Fahrenheit: " + fahrenheit);
        }
    }
}
