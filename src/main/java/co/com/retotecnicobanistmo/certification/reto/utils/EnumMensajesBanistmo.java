package co.com.retotecnicobanistmo.certification.reto.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumMensajesBanistmo {
    ARCHIVO_CONTRATO("Banistmo+Contrato+TDC"),
    ADMINISTRA("Administra tus finanzas");

    private final String nombre;


}