
public class Idade
{
    int valorIdade;
    //atributo da classe
    
    Idade (int idade)
    {
        this.valorIdade = idade;
        //this mostra que esse é um atributo
        //O ponto indica que quero acessar esse atributo
        //Passando por parâmetro a variável idade para inicializar o atributo
    }
    //construtor para inicializar o atributo valorIdade
    
    void analisaIdade()
    {
        if (this.valorIdade < 21)
        {
            System.out.println("Você ainda é menor de idade. Você ainda está com " + this.valorIdade + " anos de idade.");
            //Se o valor da idadde for menor que 21 imprime isso
        }
        else if (this.valorIdade >= 21)
        {
            System.out.println("Você já é maior de idade. Você já está com " + this.valorIdade + " anos de idade.");
            //Senão se o valor da idade for igual ou maior que 21 imprime isso
        }
    }
    //Método para analizar a idade e comparar com as condições
}
