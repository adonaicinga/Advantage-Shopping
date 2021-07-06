package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	private By LoginButton = By.id("menuUser");
	private By userLogin = By.name("username");
	private By passLogin = By.name("password");
	private By signIn = By.id("sign_in_btnundefined"); 
	private By UserLoged = By.xpath("//*[@id=\"menuUserLink\"]/span");
	private By errorLoginMsg = By.xpath("//*[@id=\"signInResultMessage\"]");
	private By create = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");
	private By AgreeButton = By.name("i_agree");
	private By register = By.id("register_btnundefined");
	private By usernameregister = By.name("usernameRegisterPage");
	private By Emailregister = By.name("emailRegisterPage");
	private By passwordregister = By.name("passwordRegisterPage");
	private By passwordconfirm = By.name("confirm_passwordRegisterPage");
	private By ErrorRegister = By.cssSelector("#registerPage > article > sec-form > div.center > label.center.block.smollMargin.invalid");
	
	
	public By loginButton() {
		return LoginButton;
	}

	public By getPassLogin() {
		return passLogin;
	}

	public By getUserLogin() {
		return userLogin;
	}
	public By getSignIn() {
		return signIn;
	}

	public By getUserLoged() {
		return UserLoged;
	}

	public By getErrorLoginMsg() {
		return errorLoginMsg;
	}

	public By getCreate() {
		return create;
	}

	public By getAgreeButton() {
		return AgreeButton;
	}

	public By getRegister() {
		return register;
	}

	public By getUsernameregister() {
		return usernameregister;
	}

	public By getEmailregister() {
		return Emailregister;
	}

	public By getPasswordconfirm() {
		return passwordconfirm;
	}

	public By getPasswordregister() {
		return passwordregister;
	}

	public By getErrorRegister() {
		return ErrorRegister;
	}
	
}
