package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		this(null,0,null,null,null,false);
	}
	public Anfibio(String nombre, int edad, String habitat, String genero,String colorPiel,boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
	}
	
	public ArrayList<Anfibio> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public static int cantidadAnfibios() {
		return listado.size();
	}
	public void crearRana(String nombre, int edad, String genero) {
		new Anfibio(nombre, edad,"selva",genero,"rojo",true);
		ranas++;
	}
	public void crearSalamandra(String nombre, int edad, String genero) {
		new Anfibio(nombre, edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
	}
}
