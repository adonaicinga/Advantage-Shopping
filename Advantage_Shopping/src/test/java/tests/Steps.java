package tests;

import elementos.ElementosWeb;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import pages.Metodos;

public class Steps {
	
	Metodos metodos = new Metodos();
	ElementosWeb elementos = new ElementosWeb();
	
	@Dado("que eu acesse o site")
	public void que_eu_esteja_na_pagina_de_login() {
		metodos.abrirnavegador("http://advantageonlineshopping.com/#/ ", "chrome" , "Abre navegador na site Advantage Online Shopping");
	}
	
	@Dado("acesse a pagina de login")
	public void acesse_a_pagina_de_login() {
		metodos.pausa(5000);
		metodos.clicar(elementos.loginButton(),"Clica no elemento login");
	}

	@Quando("informar o usuario e senha")
	public void informar_o_usuario_e_senha() {
		metodos.pausa(2000); 	
		metodos.escrever(elementos.getUserLogin(), "testador", "Preencher Username");
		metodos.escrever(elementos.getPassLogin(), "Ab123", "Preencher senha");
		metodos.clicar(elementos.getSignIn(),"Clicar no submit" );
	}

	@Então("valido usuario logado")
	public void valido_usuario_logado() throws Exception {
		metodos.pausa(4000);
	    metodos.validarTexto(elementos.getUserLoged(),"testador", "Validar usuario logado");
	    Metodos.screenShot("login-com-sucesso");
	    metodos.fecharNavegador();	    
	}
	
	@Dado("informar o usuario e senha Invalidos")
	public void informar_o_usuario_invalido() {
		metodos.pausa(6000);
		metodos.clicar(elementos.loginButton(),"Clica no elemento login");
		metodos.escrever(elementos.getUserLogin(), "AAAA", "Preencher Username");
		metodos.escrever(elementos.getPassLogin(), "Ab123", "Preencher senha");
		metodos.clicar(elementos.getSignIn(),"Clicar no submit");
	}

	@Então("valido mensagem de erro no login")
	public void valido_mensagem_de_erro_no_login() throws Exception {
		metodos.pausa(2000); 	
		metodos.validarTexto(elementos.getErrorLoginMsg(),"Incorrect user name or password.", "Validar mensagem de erro no login");
		Metodos.screenShot("login-erro");
		metodos.fecharNavegador();
	}
	
	@Dado("que acesse o site")
	public void que_acesse_o_site() {
		metodos.abrirnavegador("http://advantageonlineshopping.com/#/ ", "chrome" , "Abre navegador na site Advantage Online Shopping");
	}

	@Dado("entre na pagina de cadastro")
	public void entre_na_pagina_de_cadastro() {
		metodos.pausa(7000);
	    metodos.clicar(elementos.loginButton(), "Clica no botão Usuario");
	    metodos.pausa(2000);
	    metodos.clicar(elementos.getCreate(), "Clica no botão registrar");
	}

	@Dado("preencher os campos obrigatorios")
	public void preencher_os_campos_obrigatorios() {
		metodos.pausa(2000);
	    metodos.escrever(elementos.getUsernameregister(), "tester01","Digitar Usuario");
	    metodos.escrever(elementos.getEmailregister(), "test@test.com", "Digitar e-mail");
	    metodos.escrever(elementos.getPasswordregister(), "Ab123", "Digita senha");
	    metodos.escrever(elementos.getPasswordconfirm(), "Ab123", "Confirma Senha");
	}

	@Quando("finalizar o cadastro")
	public void finalizar_o_cadastro() {
	    metodos.clicar(elementos.getAgreeButton(), "Clica em aceitar os termos");
	    metodos.clicar(elementos.getRegister(), "Clica em register");
	}

	@Então("Valido o usuario logado")
	public void valido_o_usuario_logado() throws Exception {
		metodos.pausa(2000);
	    metodos.validarTexto(elementos.getUserLoged(),"tester01", "Validar usuario logado");
	    Metodos.screenShot("castrado-sucesso");
	    metodos.fecharNavegador();
	}

	@Dado("preencher dados ja cadastrados")
	public void preencher_dados_ja_cadastrados() {
		metodos.pausa(2000);
	    metodos.escrever(elementos.getUsernameregister(), "tester01","Digitar Usuario");
	    metodos.escrever(elementos.getEmailregister(), "test@test.com", "Digitar e-mail");
	    metodos.escrever(elementos.getPasswordregister(), "Ab123", "Digita senha");
	    metodos.escrever(elementos.getPasswordconfirm(), "Ab123", "Confirma Senha");  
	}

	@Então("Valido mensagem de erro no cadastro")
	public void valido_mensagem_de_erro_no_cadastro() throws Exception {
		metodos.pausa(1500);
		metodos.validarTexto(elementos.getErrorRegister(), "User name already exists", "Valida mensagem de erro");
		Metodos.screenShot("cadastro-erro");
	    metodos.fecharNavegador();
	}
	
}