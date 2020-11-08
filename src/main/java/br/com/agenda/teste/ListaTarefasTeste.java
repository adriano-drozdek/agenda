package br.com.agenda.teste;

import java.sql.SQLException;

import br.com.agenda.dao.ListaTarefasDAO;
import br.com.agenda.dao.LocalDAO;
import br.com.agenda.dao.UsuarioDAO;

public class ListaTarefasTeste {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		LocalDAO local = new LocalDAO();
		System.out.println(local.listarTudo()); 
		
		UsuarioDAO usuario = new UsuarioDAO();
		System.out.println(usuario.listarTudo());
		
		ListaTarefasDAO dao = new ListaTarefasDAO();
		dao.insert("Ir barbearia", "Arrumar cabelo e barba",3,1);
		
	}

}
