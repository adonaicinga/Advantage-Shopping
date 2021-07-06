package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Metodos {
	
	public static WebDriver driver;
	
	/**
	 * @author Adonai Marques
	 * @param Abrir Navegador com opção chrome, firefox ou edge
	 */
	
	public void abrirnavegador(String url,String navegador,String descricaoPasso) {
		try {
			if (navegador == "chrome") {
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver-91.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
			}else if (navegador == "firefox") {
				System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(url);	
				
			}else if (navegador == "edge") {
				System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get(url);	
			
			}else {
				System.out.println("Opcao Invalida escolha chrome, firefox ou edge");
			}
					
		} catch (Exception e) {
			System.out.println(" --------- erro ao abrir navegador"+ e.getMessage());	
		}			
	
	}
	
	/**
	 * @author Adonai Marques
	 * @param Fechar navegador
	 */
	
	public void fecharNavegador () {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("------Erro ao fechar Navegador");
		}
	}
	
	/**
	 * @author Adonai Marques
	 * @param Clicar
	 */

	public void clicar (By elemento,String descricaoPasso) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("------Erro ao Clicar " + descricaoPasso);
		}	
	}
	
	/**
	 * @author Adonai Marques
	 * @param Submit
	 */
	
	public void submit(By elemento, String descricaoPasso) {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.out.println("------Erro " + descricaoPasso);
		}	
	}
	
	/**
	 * @author Adonai Marques
	 * @param Escrever Campo
	 */
	
	public void escrever (By elemento, String texto, String descricaoPasso) {
		try {
			
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("------Erro ao Digitar no Campo " + descricaoPasso);
		}	
	}
	
	/**
	 * @author Adonai Marques
	 * @param Localizar Elemento
	 */
	
	public void localizarElemento (By Elemento,String descricaoPasso) {
		try {
			driver.findElement(Elemento);
		} catch (Exception e) {
			System.out.println("------Erro ao localizar Elemento " +descricaoPasso);
		}	
	}
	
	/**
	 * @author Adonai Marques
	 * @param ValidarTexto
	 */
	
	public void validarTexto (By elemento,String textoEsperado, String descricaoPasso) {
		try {
			String textoElemento = driver.findElement(elemento).getText();
	        assertEquals(textoEsperado, textoElemento);
		} catch (Exception e) {
			System.out.println("------Erro ao validar texto " +descricaoPasso);
		}	
	}
	
	/**
	* @author Adonai Marques
	 * @param Aguardar
	*/	
	
	public void pausa (int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.out.println("------Erro ao fechar ao pausar ");
		}
	}
	
	/**
	* @author Adonai Marques
	 * @param Capturar Evidencia
	*/	
	public static void screenShot(String nome) throws Exception{
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
        	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile=new File("./src/evidencias/" + nome + ".png");
            FileUtils.copyFile(SrcFile, DestFile);
	}           
	
	public String pegarTexto (By elemento) {
		String texto = driver.findElement(elemento).getText();
		return texto;
	}

}
