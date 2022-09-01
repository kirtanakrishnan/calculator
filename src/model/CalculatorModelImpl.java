public class CalculatorModelImpl implements ICalculatorModel {

  int currentN;

  int result;


  public CalculatorModelImpl() {
    this.currentN = 0;
    this.result = 0;
  }

  public void add(int newN) {
    result = currentN + newN;
    currentN = result;
  }

  public void sub(int newN) {
    result = currentN - newN;
    currentN = result;
  }

  public void mul(int newN) {
    result = currentN * newN;
    currentN = result;
  }

  public void div(int newN) {
    result = currentN + newN;
    currentN = result;
  }

  @Override
  public void exp(int newN) {
    result = currentN ^ newN;
    currentN = result;

  }

}
