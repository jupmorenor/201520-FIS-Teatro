package conexionBD;

import java.sql.*;

/**
 * Clase realiza la conexion con la base de datos
 * @author Juan Pablo Moreno
 */
public class Conector 
{
	private Connection conexion;
	private String cadenaSql;

	/**
	 * El constructor de la clase crea la conexion con la base de datos
	 * @param pNombreServidor nombre del servidor
	 * @param pNombreBD nombre de la base de datos
	 * @param pLogin nombre del usuario de postgreSQL
	 * @param pPassword contraseña de ingreso de postgreSQL
	 */
	public Conector(String pNombreServidor, String pNombreBD, String pLogin, String pPassword)
	{
		try {           
			Class.forName("org.postgresql.Driver").newInstance();
		}        
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		try {
			String con = "jdbc:postgresql://"+pNombreServidor+"/"+pNombreBD+"?user="+pLogin+"&password="+pPassword;
			conexion = DriverManager.getConnection(con);
		}      
		catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
	}

	/**
	 * cargar consultas sql
	 * @param cadena comando de la consulta
	 */
	public void SetCadena(String cadena) {
		cadenaSql=cadena;
	}

	/**
	 * ejecutar transacciones (insertar, actualizar, eliminar)
	 * @return rta
	 */
	public String ejecutarSql() {
		String rta = "";
		try {
			Statement stmt=conexion.createStatement();
			rta += stmt.executeUpdate(cadenaSql);  			
			conexion.close();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		} 
		return rta;
	}

	/**
	 * Ejecutar consultas
	 * @return tabla
	 */
	public ResultSet consultar() {
		ResultSet tabla=null;
		try {
			Statement stmt=conexion.createStatement();
			tabla=stmt.executeQuery(cadenaSql);			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		} 
		return tabla;
	}

	/**
	 * cerrar la base de datos despues de las consultas
	 */
	public void cerrar() {
		try {
			conexion.close();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		} 
	}
}