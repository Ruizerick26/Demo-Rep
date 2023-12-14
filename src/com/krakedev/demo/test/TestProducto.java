package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto producto1 = new Producto(1243,"Leche");
		producto1.setDescripcion("Producto exprira el 25/enero/2025");
		producto1.setPeso(2.5);
		System.out.println("Nombre Producto: "+ producto1.getNombre() + "\nCodigo Producto: " +
		producto1.getCodigo() + "\nDescripción: " + producto1.getDescripcion() + "\nPeso: "+ producto1.getPeso());
	}
}
