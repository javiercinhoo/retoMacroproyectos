package pages;

public class LevelOnePage extends BasePage{

    
private String userName ="//input[@id='userName']";
private String userPassword = "//input[@id='password']";
private String buttonLogin="*//button[@id='login']";
private String buttonStore="//button[@id='gotoStore']";
private String buttonSearch= "//input[@id='searchBox']";
private String book= "//a[contains(text(),'Speaking JavaScript')]";
private String buttonAdd = "//button[text()='Add To Your Collection']";
private String buttonProfile ="//span[contains(text(),'Profile')]";
private String firstResult = "//a[contains(text(),'Speaking JavaScript')]";
private String deleteElement = "//div[@class='text-right button di']//button [contains(text(),'Delete All Books')]";
private String buttonOk = "//button[@id='closeSmallModal-ok']";
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
            clickElement(buttonStore);
        }
        public void iSearchABookWithNameBook(String namebook){            
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
        public void deleteElement(){
            clickElement(deleteElement);
        }
        public void buttonOk(){
            clickElement(buttonOk);
        }
        public String firstResult(){
            return textFromElement(firstResult);
        } 
        public void dismissAlert(){
            driver.switchTo().alert().accept();
        } 
        
        
}
