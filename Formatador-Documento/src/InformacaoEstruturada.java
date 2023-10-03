public class InformacaoEstruturada implements Xml, Json, Yaml {

    Uf uf;
    VeiculoEletrico veiculo;

    public void exibeJson() {
        System.out.println("{");
        System.out.println("nome: " + uf.nome);
        System.out.println("capital: " + uf.capital);
        System.out.println("maior cidade: " + uf.maiorCidade1);
        System.out.println("}");

        System.out.println("");
        
        System.out.println("{");
        System.out.println("marca: " + veiculo.marca);
        System.out.println("modelo: " + veiculo.modelo);
        System.out.println("}");

    }

    public void exibeXml() {
        System.out.println("<nome>");
        System.out.println(uf.nome);
        System.out.println("</nome>");

        System.out.println("<capital>");
        System.out.println(uf.capital);
        System.out.println("</capital>");

        System.out.println("<maiorcidade>");
        System.out.println(uf.maiorCidade1);
        System.out.println("</maiorcidade>");

        System.out.println("<marca>");
        System.out.println(veiculo.marca);
        System.out.println("</marca>");
        System.out.println("<modelo>");
        System.out.println(veiculo.modelo);
        System.out.println("</modelo>");

    }

    public void exibeYaml() {

        System.out.println("Cidade:");
        System.out.println(" nome: " + uf.nome);
        System.out.println("  capital: " + uf.capital);
        System.out.println("  maior cidade: " + uf.maiorCidade1);

        System.out.println("Carro:");
        System.out.println("  marca: " + veiculo.marca);
        System.out.println("  modelo: " + veiculo.modelo);

    }

    public InformacaoEstruturada(Uf uf, VeiculoEletrico veiculo) {
        this.uf = uf;
        this.veiculo = veiculo;
    }
}