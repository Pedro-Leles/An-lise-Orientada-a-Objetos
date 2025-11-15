import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agente {
    private int codAgente;
    private String nome;
    private String cargo;
    private EmpresaP empresa;
    private final List<Transporte> transportes = new ArrayList<>();
    private boolean disponivel = true;

    public Agente(int codAgente, String nome) {
        this.codAgente = codAgente;
        this.nome = nome;
    }

    public Agente(int codAgente, String nome, String cargo) {
        this(codAgente, nome);
        this.cargo = cargo;
    }

    public void aprovarTransporte(Transporte t) {
        if (t != null) t.aprovar();
    }

    public void reprovarTransporte(Transporte t) {
        if (t != null) t.reprovar();
    }

    public void alocar(Transporte t) {
        if (t == null) return;
        if (!transportes.contains(t)) {
            transportes.add(t);
            t.setAgente(this);
            this.disponivel = false;
        }
    }

    public void desalocar(Transporte t) {
        if (t == null) return;
        transportes.remove(t);
        if (t.getAgente() == this) {
            t.setAgente(null);
        }
        this.disponivel = transportes.isEmpty();
    }

    public List<Transporte> listarTransportes() {
        return Collections.unmodifiableList(transportes);
    }

    public void disponibilizar() {
        this.disponivel = true;
    }

    // Getters e setters
    public int getCodAgente() { return codAgente; }
    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public EmpresaP getEmpresa() { return empresa; }
    public void setEmpresa(EmpresaP empresa) { this.empresa = empresa; }
    public boolean isDisponivel() { return disponivel; }
}
