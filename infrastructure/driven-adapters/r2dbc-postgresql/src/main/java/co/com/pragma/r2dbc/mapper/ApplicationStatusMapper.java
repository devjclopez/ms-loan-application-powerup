package co.com.pragma.r2dbc.mapper;

import co.com.pragma.model.applicationstatus.ApplicationStatus;
import co.com.pragma.r2dbc.entity.ApplicationStatusEntity;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStatusMapper {

  public static ApplicationStatus toDomain(ApplicationStatusEntity applicationStatusEntity) {
    if (applicationStatusEntity == null) {
      return null;
    }
    return ApplicationStatus.builder()
        .id(applicationStatusEntity.getId())
        .name(applicationStatusEntity.getName())
        .description(applicationStatusEntity.getDescription())
        .build();
  }

  public static ApplicationStatusEntity toData(ApplicationStatus applicationStatus) {
    if (applicationStatus == null) {
      return null;
    }
    return ApplicationStatusEntity.builder()
        .id(applicationStatus.getId())
        .name(applicationStatus.getName())
        .description(applicationStatus.getDescription())
        .build();
  }
}
