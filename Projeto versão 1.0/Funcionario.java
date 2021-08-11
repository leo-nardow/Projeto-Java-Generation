package ProjetoJavaGeneration;

public class Funcionario {
	private String[] nome = {"João", "Paulo", "Pedro", "Jose"};
	private String[] cpf  = {"434.125.734/19","544.125.114/01","777.121.747/05","889.723.234/33"};
	private int id;
	private int compras;
	
	public Funcionario(String[] nome, String[] cpf) {

		this.compras = compras;
	}
	
  // GETTERS AND SETTERS
	public String getNome(int id) {
		return nome[id];
	}

	public void setNome(String[] nome) {
		this.nome[id] = nome[id];
	}

	public String getCpf(int id) {
		return cpf[id];
	}

	public void setCpf(String[] cpf) {

		this.cpf[id] = cpf[id];
	}
	
	public int getCompras() {
		
		return compras;
	}

	public void setCompras(int compras) {
		
		this.compras = compras;
	}

	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		
		this.id = id;
	}
	
  // MÉTODOS
	public boolean isIdValido(int id) {
		
		if (id < 0 || id > cpf.length) {
			return false;		
		} else {
			return true;
		}

	}
	
	public void comissao() {
		this.compras += 1; 
	}

}
