package co.com.pragma.model.loantype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class LoanType {

  private Long id;
  private String name;
  private Double minAmount;
  private Double maxAmount;
  private Double interestRate;
  private Boolean automaticValidation;
}
