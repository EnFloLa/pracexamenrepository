package pracexamen;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pracexamen.Conn;

public class Conn {

	private static Conn instancia = new Conn();
	private EntityManagerFactory factory;
	
	public Conn() {
		this.factory = Persistence.createEntityManagerFactory("pracexamen");
	}
	
	public static Conn getInstancia() {
		return instancia;
	}
	
	public EntityManagerFactory getFactory() {
		return factory;
	}
}
