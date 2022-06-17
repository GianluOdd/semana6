package bean;

public class Usuario {
	
	private int rut;
	private String username;
	private String password;
	
	public Usuario(int rut, String username, String password) {
		
		this.rut = rut;
		this.username = username;
		this.password = password;
	}

	public Usuario() {
		
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
