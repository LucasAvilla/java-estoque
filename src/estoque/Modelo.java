package estoque;

/**
 * Classe para armazenar os atributos e m�todos do objeto Modelo
 * 
 * @author Lucas Igor A M Nogueira
 * @since 17/02/2021
 */

public class Modelo {

	// M�todo construtor da classe
	public Modelo() {
	}

	// Declarando os atributos
	private String nome;
	private Marca marca;

	// M�todo para acessar os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
