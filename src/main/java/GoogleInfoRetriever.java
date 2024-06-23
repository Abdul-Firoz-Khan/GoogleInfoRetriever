import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleInfoRetriever {

    public static void main(String[] args) {
        // Setup WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        try {
            // Navigate to Google
            driver.get("https://www.google.com");

            // Get the title of the page
            String title = driver.getTitle();
            System.out.println("Title: " + title);

            // Get the current URL
            String url = driver.getCurrentUrl();
            System.out.println("URL: " + url);

            // Get the page source
//            String pageSource = driver.getPageSource();
//            System.out.println("Page Source: ");
//            System.out.println(pageSource);

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
