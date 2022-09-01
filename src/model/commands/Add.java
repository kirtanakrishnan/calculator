public class Add extends OperationProcessor{

  private int newN;

  public Add(int newN) {
    this.newN = newN;
  }

  @Override
  public void doCommand(ICalculatorModel c) {
    c.add(this.newN);
  }


}
