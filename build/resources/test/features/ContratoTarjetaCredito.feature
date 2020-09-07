#language:es

Característica: Descargar Contrato de Tarjeta de Credito
  Yo como usuario
  Quiero descargar el contrato de tarjeta de credito
  Para visualizar las condiciones generales del contrato

  @ExpedicionSoatTradicional
  Escenario: Descargar Contrato de Tarjeta de Credito
    Dado que un usuario quiere descargar el contrato de "Tarjetas de Crédito"
    Cuando descargue el contrato
    Entonces deberia visualizar el archivo de contrato

