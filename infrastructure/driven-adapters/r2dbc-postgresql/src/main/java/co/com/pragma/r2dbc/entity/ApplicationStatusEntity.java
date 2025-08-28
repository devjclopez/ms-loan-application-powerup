package co.com.pragma.r2dbc.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Getter
@Builder
@Table("application_status")
public class ApplicationStatusEntity {

  @Id
  private Long id;
  private String name;
  private String description;

}
