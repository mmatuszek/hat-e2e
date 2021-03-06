package com.hat.e2e;

import com.hat.e2e.configuration.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(initializers = ConfigFileApplicationContextInitializer.class, classes = {BaseSteps.Context.class, Properties.class})
@DirtiesContext
public class BaseSteps {

  public static class Context {

    @Bean(destroyMethod="close")
    public WebDriver webDriver() {
      System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
      return new ChromeDriver();
    }
  }


}
