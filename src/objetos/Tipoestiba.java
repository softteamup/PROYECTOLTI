package objetos;

public class Tipoestiba {
	
	private String descripcion;
	private boolean apilable;
	
	public Tipoestiba(String descripcion, boolean apilable){
		this.descripcion = descripcion;
		this.apilable = apilable;
		}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isApilable() {
		return apilable;
	}

	public void setApilable(boolean apilable) {
		this.apilable = apilable;
	}

}
