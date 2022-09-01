package constructor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

import model.CalculatorModelImpl;
import model.ICalculatorModel;
import view.OperationProcessingView;

public class OperationProcessingControllerImpl implements OperationProcessingController {

  private final OperationProcessingView view;

  public final Readable in;

  private final Scanner scan;

  private final ICalculatorModel model = new CalculatorModelImpl();

  Map<String, Function<Scanner, OperationProcessingCommand>> knownCommands = new HashMap<>();

  public OperationProcessingControllerImpl(Readable in, OperationProcessingView view)
          throws IllegalArgumentException {
    if (in == null) {
      throw new IllegalArgumentException("readable is null");
    }
    if (view == null) {
      throw new IllegalArgumentException("view is null");
    }

    this.in = in;
    this.view = view;
    scan = new Scanner(this.in);

    knownCommands.put("add",
            scan -> new Add(scan.next(), model, view, scan));
    knownCommands.put("subtract",
            scan -> new Subtract(scan.next(), model, this, scan.nextInt(), scan.next()));
    knownCommands.put("multiply",
            scan -> new Multiply(scan.next(), model, this, scan.next()));
    knownCommands.put("divide",
            scan -> new Divide(scan.next(), model, this, scan.next()));
    knownCommands.put("power",
            scan -> new Power(scan.next(), model, this, scan.next()));
  }

  @Override
  public void process() throws IllegalStateException {

  }

  @Override
  public void printMessage(String message) {
    try {
      this.view.renderMessage(message + "\n");
    } catch (IOException e) {
      throw new IllegalStateException();
    }
  }

  @Override
  public void renderError(String message) throws IOException {
    view.renderError(message);
  }

}
