import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pais {
    private int codPais;
    private String nome;
    private String sigla;
    private final List<Cidade> cidades = new ArrayList<>();

    public Pais(int codPais, String nome, String sigla) {
        this.codPais = codPais;
        this.nome = nome;
        this.sigla = sigla;
    }

    public void adicionarCidade(Cidade cidade) {
        if (cidade != null && !cidades.contains(cidade)) {
            cidades.add(cidade);
            cidade.setPais(this);
        }
    }

    public List<Cidade> listarCidades() {
        return Collections.unmodifiableList(cidades);
    }

    // Getters e setters
    public int getCodPais() { return codPais; }
    public String getNome() { return nome; }
    public String getSigla() { return sigla; }
}
