package br.com.agenda.teste;

import java.sql.SQLException;

import br.com.agenda.dao.LocalDAO;

public class LocalTeste {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		/*
		 * LocalDAO dao = new LocalDAO(); dao.inserir("Casa");
		 * 
		 */
		LocalDAO dao = new LocalDAO();
		System.out.println("Lista antes da atualização");
		System.out.println(dao.listarTudo());

		LocalDAO daoUpdate = new LocalDAO();
		daoUpdate.alterar("Centrais Elétricas de Santa Catarina", 1L);

		System.out.println("Lista atualizada");
		LocalDAO pesq = new LocalDAO();
		System.out.println(pesq.listarTudo());

		LocalDAO del = new LocalDAO();
		del.excluir(3L);

		System.out.println("Lista atualizada");
		LocalDAO pesq1 = new LocalDAO();
		System.out.println(pesq1.listarTudo());
	}
}
