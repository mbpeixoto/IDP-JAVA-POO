import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de jogadores
        Jogador jogador1 = new Jogador(null, "Jogador1", "Atirador", "TimeA", "Global Elite");
        Jogador jogador2 = new Jogador(null, "Jogador2", "Suporte", "TimeB", "Supreme Master First Class");
        Jogador jogador3 = new Jogador(null, "Jogador3", "Entry Fragger", "TimeC", "Distinguished Master Guardian");

        // Criando instância do banco de dados
        BancoDeDados bancoDeDados = new BancoDeDados();

        // Inserindo jogadores no banco de dados
        bancoDeDados.inserirJogador(jogador1);
        bancoDeDados.inserirJogador(jogador2);
        bancoDeDados.inserirJogador(jogador3);

        // Recuperando jogadores do banco de dados e imprimindo suas informações
        List<Jogador> jogadoresRecuperados = bancoDeDados.recuperarJogadores();
        for (Jogador jogador : jogadoresRecuperados) {
            imprimirInformacoesJogador(jogador);
        }

        // Buscando jogador por ID existente
        buscarJogadorPorId(bancoDeDados, 1L);

        // Buscando jogador por ID inexistente
        buscarJogadorPorIdInexistente(bancoDeDados, 5L);

        // Fechando a conexão ao encerrar o programa
        bancoDeDados.fecharConexao();
    }

    // Método para imprimir as informações de um jogador
    private static void imprimirInformacoesJogador(Jogador jogador) {
        System.out.println("ID: " + jogador.getId());
        System.out.println("Nome: " + jogador.getNome());
        System.out.println("Função: " + jogador.getFuncao());
        System.out.println("Time: " + jogador.getNomeTime());
        System.out.println("Patente: " + jogador.getPatente());
        System.out.println("------------");
    }

    // Método para buscar jogador por ID existente
    private static void buscarJogadorPorId(BancoDeDados bancoDeDados, Long id) {
        try {
            Jogador jogadorEncontrado = bancoDeDados.buscarJogadorPorId(id);
            System.out.println("Jogador encontrado por ID: " + id);
            imprimirInformacoesJogador(jogadorEncontrado);
        } catch (JogadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para buscar jogador por ID inexistente
    private static void buscarJogadorPorIdInexistente(BancoDeDados bancoDeDados, Long id) {
        try {
            Jogador jogadorEncontrado = bancoDeDados.buscarJogadorPorId(id);
            imprimirInformacoesJogador(jogadorEncontrado);
        } catch (JogadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
