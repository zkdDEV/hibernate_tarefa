import dao.IProdutoDAO;
import dao.ProdutoDAO;
import domain.Produto;
import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {

    public IProdutoDAO produtoDAO;

    public ProdutoTest(){
        produtoDAO = new ProdutoDAO();
    }

    @Test
    public void cadastrar(){
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setNome("Notebook");
        produto.setDescricao("Produto descrição teste");
        produto = produtoDAO.cadastrar(produto);

        Assert.assertNotNull(produto);
        Assert.assertNotNull(produto.getId());

    }

}
