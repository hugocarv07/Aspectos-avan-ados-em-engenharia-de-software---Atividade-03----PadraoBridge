package padroesprojeto.bridge.hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedicoTest {

    @Test
    void deveRetornarSalarioMedicoComEnsinoTecnico() {
        Qualificacao qualificacao = new EnsinoTecnico();
        Medico medico = new Medico(50.0f);
        medico.setQualificacao(qualificacao);
        medico.setNumPlantoes(2);
        assertEquals(100.0f, medico.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMedicoComGraduacao() {
        Qualificacao qualificacao = new Graduacao();
        Medico medico = new Medico(50.0f);
        medico.setQualificacao(qualificacao);
        medico.setNumPlantoes(2);
        assertEquals(110.0f, medico.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMedicoComMestrado() {
        Qualificacao qualificacao = new Mestrado();
        Medico medico = new Medico(50.0f);
        medico.setQualificacao(qualificacao);
        medico.setNumPlantoes(2);
        assertEquals(120.0f, medico.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMedicoComDoutorado() {
        Qualificacao qualificacao = new Doutorado();
        Medico medico = new Medico(50.0f);
        medico.setQualificacao(qualificacao);
        medico.setNumPlantoes(2);
        assertEquals(130.0f, medico.calcularSalario(), 0.01f);
    }
}
