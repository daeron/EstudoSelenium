package casoDeTeste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiroCT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Esta linha é resposavel por maximizar a tela
		driver.manage().window().maximize();
		//Esta linha é responsavel por redirecionar para o site do github
		driver.get("https://github.com/login");
		// Esta linha identifica o elemento que iremos realizar inserção, além de realizar a inserção também.
		/*driver.findElement(By.id("login_field")).sendKeys("meuusuario");
		driver.findElement(By.id("password")).sendKeys("minhasenha");
		driver.findElement(By.name("commit")).click();*/
		System.out.println(driver.getTitle());
		driver.navigate().refresh();		
		driver.findElement(By.linkText("Terms")).click();
		driver.navigate().back();
		driver.quit();
	}
}