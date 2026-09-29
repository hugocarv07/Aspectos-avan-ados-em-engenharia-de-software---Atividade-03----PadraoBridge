package padroesprojeto.bridge.hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecepcionistaTest {

    @Test
    void deveRetornarSalarioRecepcionistaComEnsinoTecnico() {
        Qualificacao qualificacao = new EnsinoTecnico();
        Recepcionista recepcionista = new Recepcionista(1000.0f);
        recepcionista.setQualificacao(qualificacao);
        assertEquals(1000.0f, recepcionista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioRecepcionistaComGraduacao() {
        Qualificacao qualificacao = new Graduacao();
        Recepcionista recepcionista = new Recepcionista(1000.0f);
        recepcionista.setQualificacao(qualificacao);
        assertEquals(1000.0f, recepcionista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioRecepcionistaComMestrado() {
        Qualificacao qualificacao = new Mestrado();
        Recepcionista recepcionista = new Recepcionista(1000.0f);
        recepcionista.setQualificacao(qualificacao);
        assertEquals(1000.0f, recepcionista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioRecepcionistaComDoutorado() {
        Qualificacao qualificacao = new Doutorado();
        Recepcionista recepcionista = new Recepcionista(1000.0f);
        recepcionista.setQualificacao(qualificacao);
        assertEquals(1000.0f, recepcionista.calcularSalario(), 0.01f);
    }
}
