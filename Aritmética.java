//Pacote do programa
package aritmética;

//Importando a classe Scanner do pacote java.util para utilizar os métodos de entrada de dados pelo teclado
import java.util.Scanner;

//Declaração da classe
public class Aritmética
{
    //Método principal inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
        //Declarando variáveis
        int num1;
        int num2;
        
        //Declarando um objeto "input" à classe Scanner
        Scanner input = new Scanner(System.in);
        
        //Imprimindo a frase abaixo
        System.out.print("Digite o primeiro numero: ");
        //Variável num1 recebendo o objeto input da classe Scanner para receber um valor pelo teclado
        num1 = input.nextInt();
        
        //Imprimindo a frase abaixo
        System.out.print("Digite o segundo numero: ");
        //Variável num2 recebendo o objeto input da classe Scanner para receber um valor pelo teclado
        num2 = input.nextInt();
        
        //Declaração de variável do tipo int para calcular a soma de num1 com num2
        int soma = num1 + num2;
		
        //Declaração de variável do tipo int para calcular a diferença de num1 com num2
        int subtracao = num1 - num2;
		
        //Declaração de variável do tipo int para calcular o produto de num1 com num2
        int multiplicacao = num1 * num2;
		
        //Declaração de variável do tipo double para calcular a divisão de num1 por num2		
        double divisao = (double) num1 / num2;
        
        //Imprimindo as frases com suas respectivas variáveis
        System.out.print("\nA soma dos numeros digitados e: " + soma);
        System.out.print("\nA subtracao dos numeros digitados e: " + subtracao);
        System.out.print("\nA multiplicacao dos numeros digitados e: " + multiplicacao);
        System.out.print("\nA divisao dos numeros digitados e: " + divisao);
        System.out.print("\n\n");
        
    }//Fim do método main
}//Fim da classe
