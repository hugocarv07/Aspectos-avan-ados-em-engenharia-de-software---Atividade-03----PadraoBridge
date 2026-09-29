package padroesprojeto.bridge.hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnfermeiroTest {

    @Test
    void deveRetornarSalarioEnfermeiroComEnsinoTecnico() {
        Qualificacao qualificacao = new EnsinoTecnico();
        Enfermeiro enfermeiro = new Enfermeiro(2000.0f);
        enfermeiro.setQualificacao(qualificacao);
        assertEquals(2000.0f, enfermeiro.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEnfermeiroComGraduacao() {
        Qualificacao qualificacao = new Graduacao();
        Enfermeiro enfermeiro = new Enfermeiro(2000.0f);
        enfermeiro.setQualificacao(qualificacao);
        assertEquals(2200.0f, enfermeiro.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEnfermeiroComMestrado() {
        Qualificacao qualificacao = new Mestrado();
        Enfermeiro enfermeiro = new Enfermeiro(2000.0f);
        enfermeiro.setQualificacao(qualificacao);
        assertEquals(2400.0f, enfermeiro.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEnfermeiroComDoutorado() {
        Qualificacao qualificacao = new Doutorado();
        Enfermeiro enfermeiro = new Enfermeiro(2000.0f);
        enfermeiro.setQualificacao(qualificacao);
        assertEquals(2600.0f, enfermeiro.calcularSalario(), 0.01f);
    }
}
