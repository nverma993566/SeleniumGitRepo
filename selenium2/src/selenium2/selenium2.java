package selenium2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium2 {

	static WebDriver driver;
	public static void initializeWebdriver() {
	// Set the path for chromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saumyapatel\\Desktop\\selenium\\Browser drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void navigateToGoogleSearchPage() {
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		}

	public static void searchText() {
//		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).click();
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("iphone 15");		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.get("https://www.amazon.in/gp/aw/d/B0CHX2WQLX/?_encoding=UTF8&pd_rd_plhdr=t&aaxitk=69c382013700199a3fc322dc4f40afc7&hsa_cr_id=0&qid=1710959084&sr=1-3-e0fa1fdd-d857-4087-adda-5bd576b25987&ref_=sbx_be_s_sparkle_mcd_asin_2_img&pd_rd_w=RNy6l&content-id=amzn1.sym.df9fe057-524b-4172-ac34-9a1b3c4e647d%3Aamzn1.sym.df9fe057-524b-4172-ac34-9a1b3c4e647d&pf_rd_p=df9fe057-524b-4172-ac34-9a1b3c4e647d&pf_rd_r=BMQ84Z6Y5H17N3MGS5YB&pd_rd_wg=DMW2Q&pd_rd_r=f62714d8-5a18-4692-8638-5cc6947ccce1");
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		//driver.findElement(By.id("add-to-cart-button")).click();	
		//driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		
		}

	
	public static void main(String[] args) {
		initializeWebdriver();
        navigateToGoogleSearchPage();
        searchText();
	}
	

}
