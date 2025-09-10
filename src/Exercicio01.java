/**
1. Escreva um programa em Java que a partir de variáveis definidas no início do
programa e que representem duas notas e o número de faltas do aluno, apresente
uma mensagem de acordo com as seguintes regras.
a) Se o número de faltas for maior que 15, a mensagem será: “Aluno reprovado
por faltas”;
b) Se o número de faltas for menor que 15, e a média das duas notas for maior ou
igual a 7, a mensagem será: “Aluno aprovado”;
c) Se o número de faltas for menor que 15, e a média das duas notas for menor
que 7 e maior ou igual a 4, a mensagem será: “Aluno de recuperação”;
d) Se o número de faltas for menor que 15, e a média das duas notas for menor
que 4, a mensagem será: “Aluno reprovado”;
**/
public class Exercicio01 {
    public static void main(String[] args) {
        double nota1 = 10;
        double nota2 = 8;
        int faltas =5 ;
        double media = (nota1+ nota2)/2;
        System.out.println("######################### \n");
        System.out.println("##### Resultado ###### \n");
        if(faltas >= 15){
            System.out.println("Aluno REPROVADO por faltas\n");
            System.out.println("####################### \n");
        }else if((faltas < 15) && (media >= 7)){
            System.out.println("Aluno APROVADO por media\n");
            System.out.println("####################### \n");
        }else if((faltas < 15) && (media < 7 && media >= 4) ){
                System.out.println("Aluno em RECUPERAÇÃO\n");
                System.out.println("###################### \n");
        }else{
                System.out.println("Aluno REPROVADO\n");
                System.out.println("###################### \n");
            }
    }
}

