package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	
	public Pez() {
		this(null,0,null,null,null,0);
	}
	public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas,int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		listado.add(this);
	}
	
	public ArrayList<Pez> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public static int cantidadPeces() {
		return listado.size();
	}
	public void crearSalmon(String nombre, int edad, String genero) {
		new Pez(nombre,edad,"oceano", genero,"rojo",6);
		salmones++;
	}
	public void crearBacalo(String nombre, int edad, String genero) {
		new Pez(nombre,edad,"oceano", genero,"gris",6);
		bacalaos++;
	}
}