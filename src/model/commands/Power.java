public class Power extends OperationProcessor {

  private int newN;

  public Power(int newN) {
    this.newN = newN;
  }

  @Override
  protected void doCommand(ICalculatorModel c) {
    c.exp(this.newN);
  }
}
