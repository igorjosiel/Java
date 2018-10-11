
public class Matematica
{
    public static void main(String[] args)
    {
        double num1 = 10.00;
        double num2 = 10.00;
        //Variáveis que serão passadas por parâmetros para um possível método
        int escolha = 3;
        //Variável de escolha, que será responsável por definir qual método irá chamar
        
        Operacoes oper1 = new Operacoes();
        //Atribuição de um objeto "oper1" da classe "Operacoes"
        
        if (escolha == 1)
        {
            oper1.somaNumeros(num1, num2);
            //Se for atribuído á variável "escolha" o valor 1, chamará o método "somaNumeros" 
            //e somará os números passados por parâmetro
            System.out.println("A soma dos números é: " + oper1.somaNumeros(num1, num2));
            //Imprime a frase com o valor do retorno do método "somaNumeros"
        }
        else if (escolha == 2)
        {
            oper1.subtrNumeros(num1, num2);
            //Se for atribuído á variável "escolha" o valor 2, chamará o método "subtrNumeros" 
            //e subtrará os números passados por parâmetro
            System.out.println("A subtração dos números é: " + oper1.subtrNumeros(num1, num2));
            //Imprime a frase com o valor do retorno do método "subtrNumeros"
        }
        else if (escolha == 3)
        {
            oper1.multNumeros(num1, num2);
            //Se for atribuído á variável "escolha" o valor 3, chamará o método "multNumeros" 
            //e multiplicará os números passados por parâmetro
            System.out.println("A multiplicação dos números é: " + oper1.multNumeros(num1, num2));
            //Imprime a frase com o valor do retorno do método "multNumeros"
        }
        else if (escolha == 4)
        {
            oper1.divNumeros(num1, num2);
            //Se for atribuído á variável "escolha" o valor 4, chamará o método "divNumeros" 
            //e dividirá os números passados por parâmetro
            System.out.println("A divisão dos números é: " + oper1.divNumeros(num1, num2));
            //Imprime a frase com o valor do retorno do método "divNumeros"
        }
        //Fará a varredura para identificar qual método irá chamar de acordo com 
        //a variável de escolha "escolha"
    }
}
