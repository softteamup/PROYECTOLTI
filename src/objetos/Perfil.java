package objetos;

public class Perfil {
	private long idPerfil;
	private String nombre;
	
	public Perfil(long idPerfil, String nombre){
		super();
		this.idPerfil = idPerfil;
		this.nombre = nombre;
	}

	public long getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(long idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
