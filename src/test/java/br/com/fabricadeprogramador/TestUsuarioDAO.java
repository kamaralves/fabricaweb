package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		

	}
	public static void testExcluir(){
		
		//Criando usuário
		Usuario usu = new Usuario();
		usu.setId(4);
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Excluido com sucesso!");
	}
	
	public static void testAlterar(){
		
		//Criando usuário
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Kamar Silva Barbosa");
		usu.setLogin("KamarAlves");
		usu.setSenha("54321");
		
		//Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com sucesso!");
	}
	
	public static void testCadastrar(){
		
		//Criando usuário
		Usuario usu = new Usuario();
		usu.setNome("Kamar SIlva");
		usu.setLogin("KamarAlves");
		usu.setSenha("1234556");
		
		//Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso!");
	}

}
