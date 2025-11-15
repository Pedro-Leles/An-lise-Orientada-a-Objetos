import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpresaP {
    private int codEmpresa;
    private String nome;
    private String CNPJ;
    private final List<Agente> agentes = new ArrayList<>();

    public EmpresaP(int codEmpresa, String nome, String CNPJ) {
        this.codEmpresa = codEmpresa;
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    public void adicionarAgente(Agente agente) {
        if (agente != null && !agentes.contains(agente)) {
            agentes.add(agente);
            agente.setEmpresa(this);
        }
    }

    public List<Agente> listarAgentes() {
        return Collections.unmodifiableList(agentes);
    }

    // Getters e setters
    public int getCodEmpresa() { return codEmpresa; }
    public String getNome() { return nome; }
    public String getCNPJ() { return CNPJ; }
}
