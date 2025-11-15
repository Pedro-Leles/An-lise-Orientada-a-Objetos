import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cidade {
    private int codCidade;
    private String nome;
    private String sigla;
    private Pais pais;
    private final List<Armazem> armazens = new ArrayList<>();

    public Cidade(int codCidade, String nome, String sigla) {
        this.codCidade = codCidade;
        this.nome = nome;
        this.sigla = sigla;
    }

    public void adicionarArmazem(Armazem armazem) {
        if (armazem != null && !armazens.contains(armazem)) {
            armazens.add(armazem);
            armazem.setCidade(this);
        }
    }

    public List<Armazem> listarArmazens() {
        return Collections.unmodifiableList(armazens);
    }

    // Getters e setters
    public int getCodCidade() { return codCidade; }
    public String getNome() { return nome; }
    public String getSigla() { return sigla; }
    public Pais getPais() { return pais; }
    public void setPais(Pais pais) { this.pais = pais; }
}
