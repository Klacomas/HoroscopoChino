package com.desafiolatam.entidades;

public class UsuarioDTO {
	private int idUsuario;
	private String nombre;
	private String contrase�a;
	
	
	
	public UsuarioDTO() {
	}

	public UsuarioDTO(int idUsuario, String nombre, String contrasena) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.contrase�a = contrasena;
	}

	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	

}
