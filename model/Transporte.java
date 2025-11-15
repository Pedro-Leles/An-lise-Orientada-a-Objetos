import java.util.Date;

public class Transporte {
    private int codTransporte;
    private Date dtChegada;
    private Date dtSaida;
    private String hora;
    private Date data;
    private Armazem origem;
    private Armazem destino;
    private Agente agente;
    private Produto produto;

    public Transporte(int codTransporte) {
        this.codTransporte = codTransporte;
    }

    public void aprovar() {
        System.out.println("Transporte aprovado.");
    }

    public void reprovar() {
        System.out.println("Transporte reprovado.");
    }

    // Getters e setters
    public int getCodTransporte() { return codTransporte; }
    public Date getDtChegada() { return dtChegada; }
    public Date getDtSaida() { return dtSaida; }
    public String getHora() { return hora; }
    public Date getData() { return data; }

    public Armazem getOrigem() { return origem; }
    public void setOrigem(Armazem origem) { this.origem = origem; }

    public Armazem getDestino() { return destino; }
    public void setDestino(Armazem destino) { this.destino = destino; }

    public Agente getAgente() { return agente; }
    public void setAgente(Agente agente) { this.agente = agente; }

    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }
}
