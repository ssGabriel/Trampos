import java.util.ArrayList;
import java.util.List;

public class Sistema {

	public static void main(String[] args) {
		
		
		
		ContaSalesforce gabriel = new ContaSalesforce();  
		Usuario douglas = new Usuario("Douglas");
		Usuario rafael = new Usuario ("Rafael");
		Usuario mario = new Usuario ("Mario");
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(rafael);
		usuarios.add(douglas);
		usuarios.add(mario);
		
		
		gabriel.setNome("Gabriel");
		gabriel.setEmail("teste@teste.com.br");
		gabriel.setTelefone("5514-2298");
		List<ContaSalesforce> contas = new ArrayList<>();
		int o =0;
		for( int i=0;i<100;i++){ 
			contas.add(gabriel);
		}

		for(int i=0;i<contas.size();i++){
			if (o<usuarios.size()-1){	
				usuarios.get(o).carteiras.add(contas.get(i));
				System.out.println("0:"+usuarios.get(0).carteiras.size());
				System.out.println("1:"+usuarios.get(1).carteiras.size());
				System.out.println("2:"+usuarios.get(2).carteiras.size());
				o++;
			}else{
				usuarios.get(o).carteiras.add(contas.get(i));
				o=0;

			}

		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(usuarios.get(0).carteiras.size());
		System.out.println(usuarios.get(1).carteiras.size());
		System.out.println(usuarios.get(2).carteiras.size());
		
		}

}
