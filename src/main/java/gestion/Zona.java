package gestion;

import java.util.ArrayList;

import zooAnimales.*;

public class Zona {
	private String nombre;
	private ArrayList <Zoologico> zoo;
	private ArrayList<Animal> animales;
	
	public Zona() {
		this(null,null);
	}
	
	public Zona(String nombre,Zoologico z) {
		this.nombre = nombre;
		zoo.add(z);
		z.agregarZonas(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Zoologico> getZoo() {
		return zoo;
	}

	public void setZoo(ArrayList<Zoologico> zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public void agregarAnimales(Animal nuevoAnimal) {
		animales.add(nuevoAnimal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
}
