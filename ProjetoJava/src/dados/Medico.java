package dados;

public class Medico {

	private static String nome;
	private String login;
	private static String id;
	private String senha;
	private static String especializacao;

	public Medico() {

	}

	public Medico(String nome, String login, String id, String senha, String especializacao) {
		super();
		Medico.nome = nome;
		this.login = login;
		Medico.id = id;
		this.senha = senha;
		Medico.especializacao = especializacao;
	}

	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Medico.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public static String getId() {
		return id;
	}

	public void setId(String id) {
		Medico.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		Medico.especializacao = especializacao;
	}

}
