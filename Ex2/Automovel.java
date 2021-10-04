public class Automovel {

	private String marca;
	private String modelo;

	public Automovel() {
	}

	public Automovel(String marca, String modelo) {
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String imprimir() {
		return "marca:" + marca + "\n" + "Modelo: " + modelo;
	}

}