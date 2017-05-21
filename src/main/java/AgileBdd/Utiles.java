package AgileBdd;

import org.openqa.selenium.By;

/**
 * Created by DIPAK on 4/29/2017.
 */
public class Utiles extends BasePage
{
    public void searchBox(String categoriesname ){
        driver.findElement(By.id("small-searchterms")).sendKeys(categoriesname );
    }
}
