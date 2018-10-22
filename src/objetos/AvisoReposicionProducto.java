package objetos;

import java.util.Date;

public class AvisoReposicionProducto {

	private int codigo;
	private String descripcion;
	private Date fecha;
	private long cantidad;
	
	public AvisoReposicionProducto (int codigo, String descripcion, Date fecha, long cantidad){
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.cantidad = cantidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
}
