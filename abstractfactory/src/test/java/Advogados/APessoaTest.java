package Advogados;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class APessoaTeste {
    @Test
    void deveEmitirContratoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        APessoa pessoa = new APessoa(fabrica);
        assertEquals("Contrato pessoa fisica.", pessoa.emitirContrato());
    }

    @Test
    void deveEmitirContratoPessoaJuridico() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridico();
        APessoa pessoa = new APessoa(fabrica);
        assertEquals("Contrato pessoa juridico.", pessoa.emitirContrato());
    }

    @Test
    void deveEmitirReciboPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        APessoa pessoa = new APessoa(fabrica);
        assertEquals("Recibo pessoa fisica.", pessoa.emitirRecibo());
    }

    @Test
    void deveEmitirReciboPessoaJuridico() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridico();
        APessoa pessoa = new APessoa(fabrica);
        assertEquals("Recibo pessoa juridico.", pessoa.emitirRecibo());
    }
}