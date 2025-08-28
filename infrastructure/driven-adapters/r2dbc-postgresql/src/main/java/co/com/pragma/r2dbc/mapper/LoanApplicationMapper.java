package co.com.pragma.r2dbc.mapper;

import co.com.pragma.model.loanapplication.LoanApplication;
import co.com.pragma.r2dbc.entity.LoanApplicationEntity;
import org.springframework.stereotype.Component;

@Component
public class LoanApplicationMapper {

  public static LoanApplication toDomain(LoanApplicationEntity loanApplicationEntity) {
    if (loanApplicationEntity == null) {
      return null;
    }

    return LoanApplication.builder()
        .amount(loanApplicationEntity.getAmount())
        .term(loanApplicationEntity.getTerm())
        .idDocument(loanApplicationEntity.getIdDocument())
        .build();

  }

  public static LoanApplicationEntity toData(LoanApplication loanApplication) {
    if (loanApplication == null) {
      return null;
    }

    return LoanApplicationEntity.builder()
        .amount(loanApplication.getAmount())
        .term(loanApplication.getTerm())
        .idDocument(loanApplication.getIdDocument())
        .statusId(loanApplication.getStatus().getId())
        .loanTypeId(loanApplication.getType().getId())
        .build();
  }

//  /**
//   * Convierte una entidad de dominio a una entidad de persistencia.
//   *
//   * @param solicitudPrestamo Objeto de dominio.
//   * @return Entidad SolicitudData lista para ser guardada.
//   */
//  public SolicitudData toData(SolicitudPrestamo solicitudPrestamo) {
//    if (solicitudPrestamo == null) {
//      return null;
//    }
//    return SolicitudData.builder()
//        .id(solicitudPrestamo.getId()) // Puede ser nulo en la creación
//        .monto(solicitudPrestamo.getMonto())
//        .plazo(solicitudPrestamo.getPlazo())
//        .email(solicitudPrestamo.getEmailCliente())
//        .idTipoPrestamo(solicitudPrestamo.getTipoPrestamo().getId())
//        .idEstado(solicitudPrestamo.getEstado().getId())
//        .build();
//  }
//
//  public TipoPrestamo toDomain(TipoPrestamoData tipoPrestamoData) {
//    if (tipoPrestamoData == null) {
//      return null;
//    }
//    return TipoPrestamo.builder()
//        .id(tipoPrestamoData.getId())
//        .nombre(tipoPrestamoData.getNombre())
//        .montoMinimo(tipoPrestamoData.getMontoMinimo())
//        .montoMaximo(tipoPrestamoData.getMontoMaximo())
//        .tasaInteres(tipoPrestamoData.getTasaInteres())
//        .validacionAutomatica(tipoPrestamoData.getValidacionAutomatica())
//        .build();
//  }
//
//  public EstadoSolicitud toDomain(EstadoData estadoData) {
//    if (estadoData == null) {
//      return null;
//    }
//    return EstadoSolicitud.builder().id(estadoData.getId()).nombre(estadoData.getNombre()).build();
//  }

}
