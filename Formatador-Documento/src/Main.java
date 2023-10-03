import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Escolha um formato para a informação digitando o número:");
        System.out.println("1- Json");
        System.out.println("2- XML");
        System.out.println("3- YAML");

        Scanner entrada = new Scanner(System.in);

        int opcao = entrada.nextInt();

        VeiculoEletrico carro = new VeiculoEletrico();
        carro.marca = "Tesla";
        carro.autonomia = 100;
        carro.modelo = "Esportivo";
        carro.precoSugerido = 150000;
        carro.velocidadeMaxima = 250;

        Uf df = new Uf();
        df.nome = "Distritio Federal";
        df.sigla = "DF";
        df.capital = "Brasília";
        df.cordenada = "Cordenada";
        df.populacaoUltimoSenso = 1000;
        df.area = 10000;
        df.densidade = 10000;
        df.maiorCidade1 = "Taguatinga";
        df.maiorCidade2 = "Ceilandia";
        df.maiorCidade3 = "Sol Nascente";

        InformacaoEstruturada formatoInformacao = new InformacaoEstruturada(df, carro);
        if (opcao == 1) {
            formatoInformacao.exibeJson();

        } else if (opcao == 2) {
            formatoInformacao.exibeXml();

        } else {
            formatoInformacao.exibeYaml();

        }
    }

}
