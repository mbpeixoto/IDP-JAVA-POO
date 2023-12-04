import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BancoDeDados {
    private Connection connection;

    public BancoDeDados() {
        try {
            // Substitua "jdbc:sqlite:test.db" pelo URL do seu banco de dados
            connection = DriverManager.getConnection("jdbc:sqlite:test.db");
            criarTabela(); // Criar tabela se não existir
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void criarTabela() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS jogadores (" +
                "nome TEXT, " +
                "funcao TEXT, " +
                "nomeTime TEXT, " +
                "patente TEXT)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.execute();
        }
    }

    // Método para inserir jogador no banco de dados
    public void inserirJogador(Jogador jogador) {
        String sql = "INSERT INTO jogadores (nome, funcao, nomeTime, patente) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, jogador.getNome());
            statement.setString(2, jogador.getFuncao());
            statement.setString(3, jogador.getNomeTime());
            statement.setString(4, jogador.getPatente());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para recuperar jogadores do banco de dados
    public List<Jogador> recuperarJogadores() {
        List<Jogador> jogadores = new ArrayList<>();
        String sql = "SELECT * FROM jogadores";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String funcao = resultSet.getString("funcao");
                String nomeTime = resultSet.getString("nomeTime");
                String patente = resultSet.getString("patente");

                Jogador jogador = new Jogador(nome, funcao, nomeTime, patente);
                jogadores.add(jogador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return jogadores;
    }

    // Fechar a conexão ao encerrar o programa
    public void fecharConexao() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
