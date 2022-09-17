package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico() {
		this(null,null);
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		zonas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	public void agregarZonas(Zona zonaNueva) {
		zonas.add(zonaNueva);
		zonaNueva.setZoo(this);
	}
	
	public int cantidadTotalAnimales() {
		int c=0;
		for (int i=0;i<zonas.size();i++) {
			c=c+zonas.get(i).cantidadAnimales();
			}
		return c;
		}
}
