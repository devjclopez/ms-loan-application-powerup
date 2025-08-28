package co.com.pragma.r2dbc.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table("loans")
public class LoanApplicationEntity {

  @Id
  @Column("loan_id")
  private Long id;
  @Column("amount")
  private Double amount;
  @Column("term")
  private Integer term;
  @Column("id_document")
  private String idDocument;
  @Column("id_status")
  private Long statusId;
  @Column("id_loan_type")
  private Long loanTypeId;
}
