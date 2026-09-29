package padroesprojeto.bridge.hospital;

public abstract class CargoHospitalar {

    protected Qualificacao qualificacao;

    protected float salarioBase;

    public CargoHospitalar(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setQualificacao(Qualificacao qualificacao) {
        this.qualificacao = qualificacao;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
