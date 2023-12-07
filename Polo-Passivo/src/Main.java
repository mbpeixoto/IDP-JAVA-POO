import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {

    public static void main(String[] args) {

        ManutencaoPoloPassivo mpp = new ManutencaoPoloPassivo();

        // Criar alguns advogados
        Advogado advogado1 = new Advogado(1, "Advogado A", "OAB1234", "Endereço 1");
        Advogado advogado2 = new Advogado(2, "Advogado B", "OAB5678", "Endereço 2");

        // Criar alguns réus
        Reu reu1 = new Reu(1, "Réu X", "reu.x@example.com", "12345678900", "Endereço X", "Solteiro", "Profissão X", 1);
        Reu reu2 = new Reu(2, "Réu Y", "reu.y@example.com", "09876543211", "Endereço Y", "Casado", "Profissão Y", 2);

        try {
            // Inserir advogados no banco de dados
            mpp.insertAdvogado(advogado1);
            mpp.insertAdvogado(advogado2);

            // Inserir réus no banco de dados
            mpp.insertReu(reu1);
            mpp.insertReu(reu2);

            // Atualizar um advogado
            advogado1.setNome("Advogado A Atualizado");
            mpp.updateAdvogado(advogado1);

            // Atualizar um réu
            reu1.setNome("Réu X Atualizado");
            mpp.updateReu(reu1);

            // Selecionar e exibir um advogado pelo ID
            Advogado advogadoSelecionado = mpp.selectAdvogado(advogado1.getId());
            System.out.println("Advogado selecionado: " + advogadoSelecionado);

            // Selecionar e exibir um réu pelo ID
            Reu reuSelecionado = mpp.selectReu(reu1.getId());
            System.out.println("Réu selecionado: " + reuSelecionado);



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}