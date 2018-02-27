package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComfyFieldPage extends BaseObject {
    {
        PageFactory.initElements(driver,this);
    }
    public void openingComfyPage(){
        driver.get("https://comfy.ua");    //закоментировала для класса RegistWithPreconditions
    }
    @FindBy(xpath ="//a[@class='ask-city__refuse js-ask-block']")
    public WebElement chooseCity;

    public void chooseYourCity(){
        chooseCity.click();
    }
    @FindBy(xpath = "//a[@data-city-id='641']")
    public WebElement odessaCity;

    public void chooseOdessa(){
        odessaCity.click();
    }
    @FindBy(xpath = "//input[@id='searchTop']")
    public WebElement searchField;

    public void searchFredge(){
        searchField.click();
        searchField.sendKeys("Холодильник");
    }
    @FindBy(xpath = "//button[@id='searchButtonTop']")
    public WebElement searchButton;
    @FindBy(xpath = "//h1[@class='category-info__name category-info__item']")
    public WebElement titleSearchResult;



}
