package Pck_Model;

public class ExemploModel {
	private int a01_codigo; 
	private String a01_nome;
	
	
	public ExemploModel() {
		// TODO Auto-generated constructor stub
	}

	
	public int getA01_codigo() {
		return a01_codigo;
	}

	public void setA01_codigo(int a01_codigo) {
		try {
			this.a01_codigo = a01_codigo;
		}catch (Exception e) {
			System.out.println(e);
		}		
	}

	public String getA01_nome() {
		return a01_nome;
	}

	public void setA01_nome(String a01_nome) {
		this.a01_nome = a01_nome;
	}
	
}
