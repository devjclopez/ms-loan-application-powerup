package co.com.pragma.r2dbc.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table
public class LoanTypeEntity {

  @Id
  @Column("id")
  private Long id;
  @Column("name")
  private String name;
  @Column("min_amount")
  private Double minAmount;
  @Column("max_amount")
  private Double maxAmount;
  @Column("interest_rate")
  private Double interestRate;
  @Column("automatic_validation")
  private Boolean automaticValidation;
}
