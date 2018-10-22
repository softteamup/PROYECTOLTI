package objetos;

public class FamiliaProducto {

	private String codigo;
	private String descripcion;
	private String nombre;
	private String incompatible;
	
	
	public FamiliaProducto(String codigo, String nombre, String descripcion,String incompatible){
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.incompatible = incompatible;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getIncompatible() {
		return incompatible;
	}

	public void setIncompatible(String incompatible) {
		this.incompatible = incompatible;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
