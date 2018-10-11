
public class TesteIdade
{
    public static void main(String[] args)
    {
        int idade = 21;
        //Variável que passa por parâmetro ao construtor Idade o valor da idade
        
        Idade idade1;
        //Iniciando um objeto idade1 da classe Idade
        
        idade1 = new Idade(idade);
        //O objeto chama o construtor e passa por parâmetro a idade 21
        
        idade1.analisaIdade();
        //O objeto chama o método analisaIdade
    }
}
