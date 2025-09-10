/*
 2. Escreva um programa em Java que a partir de variáveis definidas no início do
programa e que representem o dia (int) e mês (int) escrevam a data representada,
por extenso. Ex: Se dia = 11 e mês = 6, a saída será igual a “onze de junho”. Utilize a
estrutura switch/case.
 */
public class Exercicio02 {
    public static void main(String[] args) {
        int dia = 11;
        int mes = 6;
        String[] diasPorExtenso = {
                "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
                "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte",
                "vinte e um", "vinte e dois", "vinte e três", "vinte e quatro", "vinte e cinco", "vinte e seis",
                "vinte e sete", "vinte e oito", "vinte e nove", "trinta", "trinta e um"
        };
        String mesPorExtenso = "";
        switch (mes) {
            case 1:
                mesPorExtenso = "janeiro";
                break;
            case 2:
                mesPorExtenso = "fevereiro";
                break;
            case 3:
                mesPorExtenso = "março";
                break;
            case 4:
                mesPorExtenso = "abril";
                break;
            case 5:
                mesPorExtenso = "maio";
                break;
            case 6:
                mesPorExtenso = "junho";
                break;
            case 7:
                mesPorExtenso = "julho";
                break;
            case 8:
                mesPorExtenso = "agosto";
                break;
            case 9:
                mesPorExtenso = "setembro";
                break;
            case 10:
                mesPorExtenso = "outubro";
                break;
            case 11:
                mesPorExtenso = "novembro";
                break;
            case 12:
                mesPorExtenso = "dezembro";
                break;
            default:
                mesPorExtenso = "mês inválido";
        }
        if (dia >= 1 && dia <= 31 && mesPorExtenso != "mês inválido") {
            System.out.println(diasPorExtenso[dia] + " de " + mesPorExtenso);
        } else {
            System.out.println("Data inválida!");
        }
    }
}
