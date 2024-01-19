package starter.duckduckgo;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.steps.UIInteractions;

public class SearchActions extends UIInteractions{

    public void byKeyWord(String keyWord) {
        $("#searchbox_input").sendKeys(keyWord, Keys.ENTER);
    }
    
}