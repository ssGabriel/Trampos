import java.util.ArrayList;
import java.util.List;

public class Usuario {	
	private String nome;
	public  ArrayList<ContaSalesforce> carteiras;
	
public Usuario (String nome){
	this.nome = nome;
	this.carteiras = new ArrayList<ContaSalesforce>();

}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<ContaSalesforce> getCarteira() {
		return carteiras;
	}
	
	public void setCarteira(List<ContaSalesforce> carteira) {
		this.carteiras = (ArrayList<ContaSalesforce>) carteira;
	}
	public void insereConta(ContaSalesforce conta){
		this.carteiras.add(conta);
		System.out.println("Contato adicionado");
	}
	
	public int getTamanho(){
		return this.carteiras.size();
	}
	
	public void mostraContas(){
		int i=0;

		for(ContaSalesforce contaSalesforce : carteiras) {
			i++;
			System.out.println(i+" Nome:"+contaSalesforce.getNome()+" Email:"+contaSalesforce.getEmail()+"Telefone:"+contaSalesforce.getTelefone());
		}
	}
}



