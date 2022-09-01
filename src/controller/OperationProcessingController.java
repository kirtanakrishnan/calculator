package constructor;

import java.io.IOException;

public interface OperationProcessingController {

  void process() throws IllegalStateException;

  void printMessage(String message);

  void renderError(String message) throws IOException;
}
