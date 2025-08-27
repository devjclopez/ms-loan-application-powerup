package co.com.pragma.usecase.registerloanapplication;

import co.com.pragma.model.applicationstatus.gateways.ApplicationStatusRepository;
import co.com.pragma.model.loanapplication.LoanApplication;
import co.com.pragma.model.loanapplication.exceptions.InvalidLoanApplicationException;
import co.com.pragma.model.loanapplication.gateways.LoanApplicationRepository;
import co.com.pragma.model.loantype.gateways.LoanTypeRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class RegisterLoanApplicationUseCase {

  private static final String INITIAL_STATUS = "Pendiente de revisión";

  private final LoanApplicationRepository applicationRepository;
  private final LoanTypeRepository typeRepository;
  private final ApplicationStatusRepository statusRepository;

  public Mono<LoanApplication> register(LoanApplication loanApplication) {
    return Mono.zip(
        typeRepository.findByName(loanApplication.getType().getName())
            .switchIfEmpty(Mono.error(new InvalidLoanApplicationException(
                String.format("El tipo de prestamo %s no existe",
                    loanApplication.getType().getName())))),
        statusRepository.findByName(INITIAL_STATUS)
            .switchIfEmpty(Mono.error(new InvalidLoanApplicationException("El estado no existe")))
    ).flatMap(
        tuple -> {
          loanApplication.setType(tuple.getT1());
          loanApplication.setStatus(tuple.getT2());
          return applicationRepository.register(loanApplication);
        }
    );
  }
}