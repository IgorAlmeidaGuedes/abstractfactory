package Advogados;

public class APessoa{
  private Contrato contrato;
  private Recibo recibo;

  public APessoa(FabricaAbstrata fabrica) {
    this.contrato = fabrica.createContrato();
    this.recibo = fabrica.createRecibo();
  }

  public String emitirContrato() {
    return this.contrato.emitir();
  }

  public String emitirRecibo() {
    return this.recibo.emitir();
  }
}