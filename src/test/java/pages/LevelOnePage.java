package pages;

public class LevelOnePage extends BasePage{

    
private String userName ="//input[@id='userName']";
private String userPassword = "//input[@id='password']";
private String buttonLogin="//button[@id='login']";
private String buttonStrore="//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[2]/span[1]";
private String buttonSearch= "//input[@id='searchBox']";
private String book= "//a[contains(text(),'Speaking JavaScript')]";
private String buttonAdd = "//button[contains(text(),'Add To Your Collection')]";
private String buttonProfile ="//span[contains(text(),'Profile')]";
private String firstResult = "//a[contains(text(),'Speaking JavaScript')]";

    public LevelOnePage(){
        super(driver);
    }
    public void iAmInDemoqaPage(){
        navigateTo("https://demoqa.com/login");
        }


        public void iAmInDemoqaPage(String User, String Password){
            write(userName,User);
            write(userPassword,Password);
        }
        
        public void clickLogin(){
            clickElement(buttonLogin);
        }
        public void clickStore(){
            clickElement(buttonStrore);
        }
        public void clickSearch(String namebook){            
            write(buttonSearch,namebook);
        }
        public void clickBook(){
            clickElement(book);
        }
        public void clickAdd(){
            clickElement(buttonAdd);
        }
        public void clickProfile(){
            clickElement(buttonProfile);
        }
        public String firstResult(){
            return textFromElement(firstResult);
        }        
}
