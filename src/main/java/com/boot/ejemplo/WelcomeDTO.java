package com.boot.ejemplo;

public class WelcomeDTO {
	private String mensaje;

    public WelcomeDTO(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
