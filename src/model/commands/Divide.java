public class Divide extends OperationProcessor {

  private int newN;

  public Divide(int newN) {
    this.newN = newN;
  }
  @Override
  protected void doCommand(ICalculatorModel c) {
    c.div(this.newN);
  }
}
