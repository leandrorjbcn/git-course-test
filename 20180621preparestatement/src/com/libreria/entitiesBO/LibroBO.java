package com.libreria.entitiesBO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.libreria.connection.Conexion;
import com.libreria.entities.Libro;

public class LibroBO {

	public void create(int id, String titulo, String isbn, float precio, double codigo) {
		
		Conexion con = new Conexion();
		Connection conn = con.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("INSERT INTO libro VALUES (?,?,?,?,?) ");
			pstmt.setObject(1, id);
			pstmt.setObject(2, titulo);
			pstmt.setObject(3, isbn);
			pstmt.setObject(4, precio);
			pstmt.setObject(5, codigo);
			pstmt.execute();
			pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		
		Conexion con = new Conexion();
		Connection conn = con.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("DELETE FROM libro WHERE id = ?");
			pstmt.setObject(1, id);
			pstmt.execute();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(int id, int idN, String titulo, String isbn, float precio, double codigo) {
		
		Conexion con = new Conexion();
		Connection conn = con.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(
					"UPDATE libro SET id = ?, titulo = ?, isbn = ?, precio = ?, codigo = ? WHERE id = ? ;");
			pstmt.setObject(1, id);
			pstmt.setObject(2, titulo);
			pstmt.setObject(3, isbn);
			pstmt.setObject(4, precio);
			pstmt.setObject(5, codigo);
			pstmt.setObject(6, idN);
			pstmt.execute();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public List<Libro> readOne(int id){
		
		List<Libro> libros = new ArrayList<Libro>();
		
		Conexion con = new Conexion();
		Connection conn = con.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM libro WHERE id = ? ;");
			pstmt.setObject(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Libro libro = new Libro();
				
				int id2 = Integer.parseInt(rs.getString("id"));
				libro.setId(id2);
				String titulo = rs.getString("titulo");
				libro.setTitulo(titulo);
				String isbn = rs.getString("isbn");
				libro.setIsbn(isbn);
				float precio = rs.getFloat("precio");
				libro.setPrecio(precio);
				double codigo = rs.getDouble("codigo");
				libro.setCodigo(codigo);
				
				libros.add(libro);
			}
			pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libros;		
	}
	
	public List<Libro> read(){
		
		List<Libro> libros = new ArrayList<Libro>();
		
		Conexion con = new Conexion();
		Connection conn = con.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM libro ;");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Libro libro = new Libro();
				
				int id2 = Integer.parseInt(rs.getString("id"));
				libro.setId(id2);
				String titulo = rs.getString("titulo");
				libro.setTitulo(titulo);
				String isbn = rs.getString("isbn");
				libro.setIsbn(isbn);
				float precio = rs.getFloat("precio");
				libro.setPrecio(precio);
				double codigo = rs.getDouble("codigo");
				libro.setCodigo(codigo);
				
				libros.add(libro);
			}
			
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libros;
	}
	
//	public void createTable() {
//	
//	Conexion con = new Conexion();
//	Connection conn = con.getConnection();
//	
//	Statement statement;
//	try {
//		statement = conn.createStatement();
//		statement.executeUpdate("CREATE TABLE IF NOT EXISTS libro (id INT(3) NOT NULL PRIMARY KEY, titulo VARCHAR(30), isbn VARCHAR(10), precio FLOAT(5, 2), codigo DOUBLE(10, 4)) ");
//		statement.close();
//		conn.close();
//		
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//}
	

}





















