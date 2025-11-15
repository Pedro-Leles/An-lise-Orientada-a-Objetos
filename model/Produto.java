import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Produto {
    private int codProduto;
    private String nome;
    private String descricao;
    private String situacao;
    private final List<Item> itens = new ArrayList<>();
    private final List<Transporte> transportes = new ArrayList<>();

    public Produto(int codProduto, String nome) {
        this.codProduto = codProduto;
        this.nome = nome;
    }

    public void adicionarItem(Item item) {
        if (item != null && !itens.contains(item)) {
            itens.add(item);
            item.setProduto(this);
        }
    }

    public void adicionarTransporte(Transporte t) {
        if (t != null && !transportes.contains(t)) {
            transportes.add(t);
            t.setProduto(this);
        }
    }

    public List<Item> listarItens() {
        return Collections.unmodifiableList(itens);
    }

    public List<Transporte> listarTransportes() {
        return Collections.unmodifiableList(transportes);
    }

    // Getters e setters
    public int getCodProduto() { return codProduto; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public String getSituacao() { return situacao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
}
