public class Subtract extends OperationProcessor{

  private int newN;

  public Subtract(int newN) {
    this.newN = newN;
  }

  @Override
  protected void doCommand(ICalculatorModel c) {
    c.sub(this.newN);
  }
}
