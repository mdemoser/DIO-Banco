import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Banco {

	@Getter
	@Setter
	public String Nome;
	private List<Conta> contas;

	


//	public String getNome() {
//		return Nome;
//	}
//
//	public void setNome(String nome) {
//		Nome = nome;
//	}
//	
//	
//	
//	public List<Conta> getContas() {
//		return contas;
//	}
//
//	public void setContas(List<Conta> contas) {
//		this.contas = contas;
//	}

}
