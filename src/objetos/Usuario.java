package objetos;

public class Usuario {
	private long idUsuario;
	private String nombre;
	private String apellido;
	private String nomAcceso;
	private String contrasenia;
	private String correo;
	private Perfil perfil;

	public Usuario (long idUsuario,String nombre,String apellido,String nomAcceso,String contrasenia,String correo, Perfil perfil){
		super();
		this.idUsuario = idUsuario;
		this.nombre= nombre;
		this.apellido = apellido;
		this.nomAcceso = nomAcceso;
		this.contrasenia = contrasenia;
		this.correo = correo;
		this.perfil = perfil;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNomAcceso() {
		return nomAcceso;
	}

	public void setNomAcceso(String nomAcceso) {
		this.nomAcceso = nomAcceso;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	
}
