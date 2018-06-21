package entitiesBO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conection.Conexion;
import entities.Libro;

public class LibroBO {

	
	public void create(int id, String titulo, String isbn, float precio, double codigo) {
		
		Conexion con = new Conexion();
		Connection conn = con.getConnection();
		Statement statement = null;
		
		try {
			statement = conn.createStatement();
			statement.executeUpdate("INSERT INTO libro (id, titulo, isbn, precio, codigo) VALUES"
					+ " ("+id+", '"+titulo+"', '"+isbn+"', "+precio+", "+codigo+");");
			statement.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		
		Conexion con = new Conexion();
		Connection conn = con.getConnection();
		Statement statement = null;
		
		try {
			statement = conn.createStatement();
			statement.executeUpdate("DELETE FROM libro WHERE id = "+id+" ;");
			statement.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(int id, int idN, String tituloN, String isbnN, float precioN, double codigoN) {
		
		Conexion con = new Conexion();
		Connection conn = con.getConnection();
		Statement statement = null;
		
		try {
			statement = conn.createStatement();
			statement.executeUpdate("UPDATE libro SET id = "+idN+", titulo = '"+tituloN+"', isbn = '"+isbnN+"', precio = "+precioN+", codigo = "+codigoN+" WHERE id = "+id+" ;");
			statement.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Libro> read(){
		
		List<Libro> libros = new ArrayList<Libro>();
		Conexion con = new Conexion();
		Connection conn = con.getConnection();
		Statement statement = null;
		
		try {
			statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM libro ;"); 
			while(resultSet.next()) {
				Libro libro = new Libro();
				
				libro.setId(resultSet.getInt("id"));
				libro.setTitulo(resultSet.getString("titulo"));
				libro.setIsbn(resultSet.getString("isbn"));
				libro.setPrecio(resultSet.getFloat("precio"));
				libro.setCodigo(resultSet.getDouble("codigo"));
				
				libros.add(libro);
			}
			statement.close();
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return libros;
	}
	
	
//	public void createTable() {
//		
//		Conexion con = new Conexion();
//		Connection conn = con.getConnection();
//		
//		Statement statement;
//		try {
//			statement = conn.createStatement();
//			statement.executeUpdate("CREATE TABLE IF NOT EXISTS libro (id INT(3) NOT NULL PRIMARY KEY, titulo VARCHAR(30), isbn VARCHAR(10), precio FLOAT(5, 2), codigo DOUBLE(10, 4)) ");
//			statement.close();
//			conn.close();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	
	
}

























