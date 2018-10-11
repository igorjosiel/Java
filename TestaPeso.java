
public class TestaPeso
{
    public static void main(String[] args)
    {
        double altura = 1.70;
        double peso = 70.0;
        //Variáveis que serão usadas para passar como parâmetro do Construtor 
        //os valores dos atributos "altura" e "peso".
        
        FaixaDePeso FaixaPeso;
        //Atribuição de um objeto "FaixaPeso" da classe "FaixaDePeso"
        
        FaixaPeso = new FaixaDePeso(altura, peso);
        //Construtor "FaixaDePeso" que atribuirá os valores das variáveis 
        //"altura" e "peso" aos atributos "altura" e "peso" da classe "FaixaDePeso"
        
        FaixaPeso.obtemIMC();
        //Chama o método obtemIMC da classe "FaixaDePeso" para fazer o cálculo do IMC
        System.out.println("Seu IMC é: " + FaixaPeso.obtemIMC() + " \n");
        //Imprime a frase com o valor do retorno do método
        
        FaixaPeso.comparaIMC(FaixaPeso.obtemIMC());
        //Chama o método comparaIMC da classe "FaixaDePeso" como parâmetro o retorno
        //do método obtemIMC para fazer as comparações necessárias
    }
}
