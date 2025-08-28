package co.com.pragma.r2dbc.mapper;

import co.com.pragma.model.loantype.LoanType;
import co.com.pragma.r2dbc.entity.LoanTypeEntity;

public class LoanTypeMapper {

  public static LoanType toDomain(LoanTypeEntity loanTypeEntity) {
    if (loanTypeEntity == null) {
      return null;
    }
    return LoanType.builder()
        .id(loanTypeEntity.getId())
        .name(loanTypeEntity.getName())
        .minAmount(loanTypeEntity.getMinAmount())
        .maxAmount(loanTypeEntity.getMaxAmount())
        .interestRate(loanTypeEntity.getInterestRate())
        .automaticValidation(loanTypeEntity.getAutomaticValidation())
        .build();
  }
}
