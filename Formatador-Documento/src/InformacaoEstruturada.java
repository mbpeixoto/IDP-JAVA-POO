public class InformacaoEstruturada implements Xml, Json, Yaml {

    Uf uf;
    VeiculoEletrico veiculo;
    int opcao;

    public void exibeJson(){

    }

    public void exibeXml(){

    }

    public void exibeYaml(){

    }

    public InformacaoEstruturada(Uf uf, VeiculoEletrico veiculo, int opcao){
        this.uf=uf;
        this.veiculo= veiculo;
        this.opcao=opcao; //Opcao de 1 a 3 escolhida
    }
}
