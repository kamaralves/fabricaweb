package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		

	}
	public static void testExcluir(){
		
		//Criando usu�rio
		Usuario usu = new Usuario();
		usu.setId(4);
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Excluido com sucesso!");
	}
	
	public static void testAlterar(){
		
		//Criando usu�rio
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Kamar Silva Barbosa");
		usu.setLogin("KamarAlves");
		usu.setSenha("54321");
		
		//Cadastrando usu�rio no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com sucesso!");
	}
	
	public static void testCadastrar(){
		
		//Criando usu�rio
		Usuario usu = new Usuario();
		usu.setNome("Kamar SIlva");
		usu.setLogin("KamarAlves");
		usu.setSenha("1234556");
		
		//Cadastrando usu�rio no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso!");
	}

}
