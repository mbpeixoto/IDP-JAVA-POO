
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import venda.ItemVenda;
import venda.Venda;

public class VendaTest {

    @Test
    public void testCriacaoItemVenda() {
        ItemVenda item = new ItemVenda("Produto1", 20.0, 2.5);

        Assertions.assertNotNull(item);
        Assertions.assertEquals("Produto1", item.getDescricao());
        Assertions.assertEquals(20.0, item.getValorUnitario(), 0.01);
        Assertions.assertEquals(2.5, item.getQuantidade(), 0.01);
    }

    @Test
    public void testCriacaoVenda() {
        List<ItemVenda> itens = new ArrayList<>();
        itens.add(new ItemVenda("Produto1", 20.0, 2.5));
        itens.add(new ItemVenda("Produto2", 30.0, 1.5));

        Venda venda = new Venda("Cliente1", itens, 100.0, 10.0);

        Assertions.assertNotNull(venda);
        Assertions.assertEquals("Cliente1", venda.getCliente());
        Assertions.assertEquals(itens, venda.getItens());
        Assertions.assertEquals(100.0, venda.getValorVenda(), 0.01);
        Assertions.assertEquals(10.0, venda.getValorDesconto(), 0.01);
    }

    @Test
    public void testCalculoTotalVendaComDesconto() {
        List<ItemVenda> itens = new ArrayList<>();
        itens.add(new ItemVenda("Produto1", 20.0, 2.5));
        itens.add(new ItemVenda("Produto2", 30.0, 1.5));

        Venda venda = new Venda("Cliente1", itens, 100.0, 10.0);

        // O total com desconto deve ser 100 - 10 = 90
        Assertions.assertEquals(90.0, venda.calcularTotalComDesconto(), 0.01);
    }
}