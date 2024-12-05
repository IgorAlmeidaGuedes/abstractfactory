package Advogados;

public class FabricaPessoaJuridico implements FabricaAbstrata{

    @Override
    public Contrato createContrato() {
        return new ContratoPessoaJuridico();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboPessoaJuridico();
    }
}
