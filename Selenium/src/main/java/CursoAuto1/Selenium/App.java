package CursoAuto1.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Curso Septiembre 05.09.20" );
        //tomando el driver la dirección para ejecutar
        //La variable de entorno PATH se usa para ubicar comandos dentro de la jerarquía de directorios de OS
        String exePath =Paths.get("").toAbsolutePath().toString()+ File.separator+ "driver"+ File.separator;
      //establecer la propiedades exe
        System.setProperty("webdriver.chrome.drive", exePath+"chromedrive.exe");
      //inicializando el driver
        WebDriver driver = new ChromeDriver();
      //iniciar el navegador con la url correcto
        driver.get("https://www.cooltesters.com/tienda-de-cursos/seleni");
    }
}
