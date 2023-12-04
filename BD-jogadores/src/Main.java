import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de jogadores
        Jogador jogador1 = new Jogador("Jogador1", "Atirador", "TimeA", "Global Elite");
        Jogador jogador2 = new Jogador("Jogador2", "Suporte", "TimeB", "Supreme Master First Class");
        Jogador jogador3 = new Jogador("Jogador3", "Entry Fragger", "TimeC", "Distinguished Master Guardian");

        // Criando instância do banco de dados
        BancoDeDados bancoDeDados = new BancoDeDados();

        // Inserindo jogadores no banco de dados
        bancoDeDados.inserirJogador(jogador1);
        bancoDeDados.inserirJogador(jogador2);
        bancoDeDados.inserirJogador(jogador3);

        // Recuperando jogadores do banco de dados e imprimindo suas informações
        List<Jogador> jogadoresRecuperados = bancoDeDados.recuperarJogadores();
        for (Jogador jogador : jogadoresRecuperados) {
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Função: " + jogador.getFuncao());
            System.out.println("Time: " + jogador.getNomeTime());
            System.out.println("Patente: " + jogador.getPatente());
            System.out.println("------------");
        }

        // Fechando a conexão ao encerrar o programa
        bancoDeDados.fecharConexao();
    }
}
