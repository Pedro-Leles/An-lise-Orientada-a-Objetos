import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Armazem {
    private int codArmazem;
    private String nome;
    private String endereco;
    private Cidade cidade;
    private final List<Transporte> transportesOrigem = new ArrayList<>();
    private final List<Transporte> transportesDestino = new ArrayList<>();

    public Armazem(int codArmazem, String nome, String endereco) {
        this.codArmazem = codArmazem;
        this.nome = nome;
        this.endereco = endereco;
    }

    public void adicionarTransporteOrigem(Transporte t) {
        if (t != null && !transportesOrigem.contains(t)) {
            transportesOrigem.add(t);
            t.setOrigem(this);
        }
    }

    public void adicionarTransporteDestino(Transporte t) {
        if (t != null && !transportesDestino.contains(t)) {
            transportesDestino.add(t);
            t.setDestino(this);
        }
    }

    public List<Transporte> listarTransportesOrigem() {
        return Collections.unmodifiableList(transportesOrigem);
    }

    public List<Transporte> listarTransportesDestino() {
        return Collections.unmodifiableList(transportesDestino);
    }

    // Getters e setters
    public int getCodArmazem() { return codArmazem; }
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public Cidade getCidade() { return cidade; }
    public void setCidade(Cidade cidade) { this.cidade = cidade; }
}
