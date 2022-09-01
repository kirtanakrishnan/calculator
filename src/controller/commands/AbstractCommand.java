package controller;

import java.io.IOException;

import model.ICalculatorModel;

public abstract class AbstractCommand implements OperationProcessingCommand {


  @Override
  public void execute() throws IOException {

  }

  abstract protected ICalculatorModel doCommand(ICalculatorModel model);
}
