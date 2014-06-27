package main;

import credCobGerClasses.TipoUsuario;
import credCobGerServices.TipoUsuarioService;

public class Main {

	public static void main(String[] args){
		
		
		TipoUsuarioService tU = new TipoUsuarioService();
		TipoUsuario tUsu = new TipoUsuario();
		
		tUsu.setCodUsu(1);
		tUsu.setTipUsu("GerGer");
		
		tU.save(tUsu);
	}
}
