package web.base

import org.openqa.selenium.Cookie
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod

open class Helper {

    val driver: WebDriver = ChromeDriver()

    @BeforeMethod(alwaysRun = true)
    fun setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver")
        driver.manage().deleteAllCookies()
        driver.navigate().to("https://shop.demoqa.com/")
        driver.manage().addCookie(Cookie("hide_notifications", "true"))
        driver.manage().addCookie(Cookie("notice_preferences", "0:"))
        driver.manage().addCookie(Cookie("notice_gdpr_prefs", "0:"))
    }

    fun navigateToPage() {
        driver.navigate().to("https://shop.demoqa.com/")
    }

    @AfterMethod(alwaysRun = true)
    fun tearDown() {
        try {
            driver.quit()
        } catch (e: Exception) {
            CommonBase.LOG.warning("Failed to kill remote driver")
        }
    }
}
