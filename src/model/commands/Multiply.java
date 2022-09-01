public class Multiply extends OperationProcessor {

  private int newN;

  public Multiply(int newN) {
    this.newN = newN;
  }

  @Override
  protected void doCommand(ICalculatorModel c) {
    c.mul(this.newN);
  }
}
