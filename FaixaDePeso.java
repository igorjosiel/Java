
public class FaixaDePeso
{
    double altura;
    double peso;
    //Atributos da classe
    
    FaixaDePeso(double altura, double peso)
    {
        this.altura = altura;
        //O atributo altura está recebendo o valor da variável "altura" passada por parâmetro
        //O this indica que ele está acessando um atributo
        //O ponto indica que o atributo está sendo acessado
        
        this.peso = peso;
        //O atributo altura está recebendo o valor da variável "altura" passada por parâmetro
        //O this indica que ele está acessando um atributo
        //O ponto indica que o atributo está sendo acessado
    }
    //Construtor da classe com 2 parâmetros: o peso e a altura
    
    double obtemIMC()
    {
        double imc;
        imc = this.peso / (this.altura * this.altura);
        return imc;
    }
    //Método para fazer o cálculo do IMC e retornar o valor
    
    void comparaIMC(double imc)
    {
        if (imc <= 18.5)
        {
            System.out.println("Você está abaixo do peso normal.");
            //Se o valor do IMC for inferior ou igual a 18.5, imprime isso
        }
        else if (imc > 18.5 && imc <= 25)
        {
            System.out.println("O seu peso está na faixa de normalidade.");
            //Se o valor do IMC for maior que 18.5 e menor ou igual que 25, imprime isso
        }
        else if (imc > 25 && imc <= 30)
        {
            System.out.println("Você está acima do peso normal.");
            //Se o valor do IMC for maior que 25 e menor ou igual que 30, imprime isso
        }
        else if (imc > 30)
        {
            System.out.println("Você precisa perder uns quilinhos.");
            //Se o valor do IMC for maior que 30, imprime isso
        }
    }
    //Método para fazer a comparação com o valor do retorno do método "obtemIMC"
    //e imprimir de acordo com a comparação
}
