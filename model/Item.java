public class Item {
    private int codItem;
    private String nome;
    private String situacao;
    private String descricao;
    private Produto produto;

    public Item(int codItem, String nome, String descricao) {
        this.codItem = codItem;
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters e setters
    public int getCodItem() { return codItem; }
    public String getNome() { return nome; }
    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
    public String getDescricao() { return descricao; }

    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }
}
