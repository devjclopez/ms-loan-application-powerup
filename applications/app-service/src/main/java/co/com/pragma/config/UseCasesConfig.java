package co.com.pragma.config;

import co.com.pragma.model.applicationstatus.gateways.ApplicationStatusRepository;
import co.com.pragma.model.loanapplication.gateways.LoanApplicationRepository;
import co.com.pragma.model.loantype.gateways.LoanTypeRepository;
import co.com.pragma.usecase.registerloanapplication.RegisterLoanApplicationUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "co.com.pragma.usecase",
    includeFilters = {
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
    },
    useDefaultFilters = false)
public class UseCasesConfig {

  @Bean
  public RegisterLoanApplicationUseCase registerLoanApplicationUseCase(
      LoanApplicationRepository loanApplicationRepository, LoanTypeRepository loanTypeRepository,
      ApplicationStatusRepository applicationStatusRepository) {
    return new RegisterLoanApplicationUseCase(loanApplicationRepository, loanTypeRepository,
        applicationStatusRepository);
  }
}
