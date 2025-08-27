package co.com.pragma.model.loanapplication.exceptions;

public class InvalidLoanApplicationException extends IllegalArgumentException{
  public InvalidLoanApplicationException(String message) {
    super(message);
  }
}
