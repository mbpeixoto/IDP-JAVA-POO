import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManutencaoPoloPassivo {

    private String jdbcURL = "jdbc:postgresql://isabelle.db.elephantsql.com:5432/gwymturp";
    private String jdbcUsername = "gwymturp";
    private String jdbcPassword = "MLUTv1ARrhTtW7IyGxILgZefBkeKMBVF";

    private String INSERT_ADVOGADO_SQL = "INSERT INTO advogado (id, nome, oab, endereco) VALUES (?, ?, ?, ?);";

    private String INSERT_REU_SQL = "INSERT INTO reu" +
            " (id, nome, email, cpf, endereco, estadoCivil, profissao, idAdvogado) VALUES " +
            " (?, ?, ?, ?, ?, ?, ?, ?);";

    private String SELECT_ADVOGADO_BY_ID = "SELECT id, nome, oab, endereco FROM advogado WHERE id =?";
    private String SELECT_ALL_ADVOGADOS = "SELECT * FROM advogado";
    private String DELETE_ADVOGADO_SQL = "DELETE FROM advogado WHERE id = ?;";
    private String UPDATE_ADVOGADO_SQL = "UPDATE advogado SET nome = ?, oab = ?, endereco = ? WHERE id = ?;";
    private String SELECT_REU_BY_ID = "SELECT id, nome, email, cpf, endereco, estadoCivil, profissao, idAdvogado FROM reu WHERE id =?";
    private String SELECT_ALL_REUS = "SELECT * FROM reu";
    private String DELETE_REU_SQL = "DELETE FROM reu WHERE id = ?;";
    private String UPDATE_REU_SQL = "UPDATE reu SET nome = ?, email = ?, cpf = ?, endereco = ?, estadoCivil = ?, profissao = ?, idAdvogado = ? WHERE id = ?;";

    // Métodos CRUD para Advogado e Reu
    // ...

    private Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // Handle SQL exception
        } catch (ClassNotFoundException e) {
            // Handle class not found exception
        }
        return connection;
    }

    // Métodos CRUD para Advogado
    public void insertAdvogado(Advogado advogado) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(INSERT_ADVOGADO_SQL)) {
            pstmt.setInt(1, advogado.getId());
            pstmt.setString(2, advogado.getNome());
            pstmt.setString(3, advogado.getOab());
            pstmt.setString(4, advogado.getEndereco());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
            System.out.println("Erro inserir");
        }
    }
    public Advogado selectAdvogado(int advogadoId) {
        Advogado advogado = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ADVOGADO_BY_ID);) {
            preparedStatement.setInt(1, advogadoId);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String oab = rs.getString("oab");
                String endereco = rs.getString("endereco");
                advogado = new Advogado(id, nome, oab, endereco);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return advogado;
    }
    public boolean updateAdvogado(Advogado advogado) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ADVOGADO_SQL);) {
            preparedStatement.setString(1, advogado.getNome());
            preparedStatement.setString(2, advogado.getOab());
            preparedStatement.setString(3, advogado.getEndereco());
            preparedStatement.setInt(4, advogado.getId());

            rowUpdated = preparedStatement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
    public boolean deleteAdvogado(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_ADVOGADO_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }


    // Métodos CRUD para Reu
    public void insertReu(Reu reu) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_REU_SQL)) {
            preparedStatement.setInt(1, reu.getId());
            preparedStatement.setString(2, reu.getNome());
            preparedStatement.setString(3, reu.getEmail());
            preparedStatement.setString(4, reu.getCpf());
            preparedStatement.setString(5, reu.getEndereco());
            preparedStatement.setString(6, reu.getEstadoCivil());
            preparedStatement.setString(7, reu.getProfissao());
            preparedStatement.setInt(8, reu.getIdAdvogado());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
    public Reu selectReu(int reuId) {
        Reu reu = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_REU_BY_ID);) {
            preparedStatement.setInt(1, reuId);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                String estadoCivil = rs.getString("estadoCivil");
                String profissao = rs.getString("profissao");
                int idAdvogado = rs.getInt("idAdvogado");
                reu = new Reu(id, nome, email, cpf, endereco, estadoCivil, profissao, idAdvogado);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return reu;
    }
    public boolean updateReu(Reu reu) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_REU_SQL);) {
            preparedStatement.setString(1, reu.getNome());
            preparedStatement.setString(2, reu.getEmail());
            preparedStatement.setString(3, reu.getCpf());
            preparedStatement.setString(4, reu.getEndereco());
            preparedStatement.setString(5, reu.getEstadoCivil());
            preparedStatement.setString(6, reu.getProfissao());
            preparedStatement.setInt(7, reu.getIdAdvogado());
            preparedStatement.setInt(8, reu.getId());

            rowUpdated = preparedStatement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
    public boolean deleteReu(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_REU_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
