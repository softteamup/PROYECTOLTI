package objetos;

import java.util.Date;

public class Producto {
	
	private String codigo;
	private String nombre;
	private String stockTotal;
	private String stockMinimo;
	private String segmentacion;
	private double peso;
	private Tipoestiba tipoestiba;
	private int volumen;
	private double precio;
	private Date fechaVencimiento;
	private Date fechaElaborado;
	private String lote;
	
	public Producto (String codigo, String nombre, String stockTotal, String stockMinimo, String segmentacion, double peso,
						Tipoestiba tipoestiba, int volumen, double precio, Date fechaVencimiento, Date fechaElaborado, String lote){
		this.codigo = codigo;
		this.nombre = nombre;
		this.stockTotal = stockTotal;
		this.stockMinimo = stockMinimo;
		this.segmentacion = segmentacion;
		this.peso = peso;
		this.tipoestiba = tipoestiba;
		this.volumen = volumen;
		this.precio = precio;
		this.fechaVencimiento = fechaVencimiento;
		this.fechaElaborado = fechaElaborado;
		this.lote = lote;
	}

	public String getCodigo() {
		return codigo;
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

	public String getStockTotal() {
		return stockTotal;
	}

	public void setStockTotal(String stockTotal) {
		this.stockTotal = stockTotal;
	}

	public String getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(String stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public String getSegmentacion() {
		return segmentacion;
	}

	public void setSegmentacion(String segmentacion) {
		this.segmentacion = segmentacion;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Tipoestiba getTipoestiba() {
		return tipoestiba;
	}

	public void setTipoestiba(Tipoestiba tipoestiba) {
		this.tipoestiba = tipoestiba;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Date getFechaElaborado() {
		return fechaElaborado;
	}

	public void setFechaElaborado(Date fechaElaborado) {
		this.fechaElaborado = fechaElaborado;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}
	

}
