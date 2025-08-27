package co.com.pragma.model.loanapplication;
import co.com.pragma.model.applicationstatus.ApplicationStatus;
import co.com.pragma.model.loantype.LoanType;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class LoanApplication {
  private Double amount;
  private Integer term;
  private String idDocument;
  private ApplicationStatus status;
  private LoanType type;
}
