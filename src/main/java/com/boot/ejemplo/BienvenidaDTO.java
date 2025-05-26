package com.boot.ejemplo;

public class BienvenidaDTO {
	private String mensaje;

    public BienvenidaDTO(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
