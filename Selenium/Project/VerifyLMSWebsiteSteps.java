package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyLMSWebsiteSteps {
    WebDriver driver;
    WebDriverWait wait;

    @Given("^User navigates to Alchemy Website$")
    public void userIsOnAlchemyPage() throws Throwable {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);

        driver.get("https://alchemy.hguy.co/lms");
    }

    @When("^User verifies the webpage title '(.*)'$")
    public void userVerifyWebpageTitle(String title) throws Throwable {
        String actualTitle= driver.getTitle();
        if(title.equals(actualTitle))
            System.out.println("Verified Web Page Title");

    }

    @And("^Close the open browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }

    @When("^User verifies the webpage heading '(.*)'$")
    public void userVerifyWebPageHeading(String heading) throws Throwable {
        String actualHeading = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
        System.out.println(actualHeading);
        System.out.println(heading.equals(actualHeading));

    }

    @When("^User verifies title of first info box '(.*)'$")
    public void userVerifyTitleOfFirstInfoBox(String infoTitle) throws Throwable {
        String actualTitle=driver.findElement(By.xpath("//h3[text()=' Actionable Training ']")).getText();
        System.out.println(actualTitle);
        System.out.println(infoTitle.equals(actualTitle));
    }

    @When("^User verifies title of second most popular course '(.*)'$")
    public void userVerifyTitleOfSecondPopularCourse(String secCourseTitle) throws Throwable {
        String actualTitle=driver.findElement(By.xpath("//h3[text()='Email Marketing Strategies']")).getText();
        System.out.println(actualTitle);
        System.out.println(secCourseTitle.equals(actualTitle));
    }

    @When("^User clicks 'My Account' Option$")
    public void userNavigateToMyAccPage() throws Throwable {
        driver.findElement(By.xpath("//a[text()='My Account']")).click();
        Thread.sleep(2000);
    }

    @When("^User verifies title of new page '(.*)'$")
    public void userVerifyTitleOfMyAccPage(String newPageTitle) throws Throwable {
        String actualTitle= driver.getTitle();
        System.out.println(actualTitle);
        if(newPageTitle.equals(actualTitle))
            System.out.println("Verified Web Page Title");
    }

    @And("^User clicks on Login button$")
    public void userClicksOnLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']")).click();
        Thread.sleep(2000);
    }

    @And("User enters User Name in User name field")
    public void userEntersUserNameInUserNameField() {
        driver.findElement(By.id("user_login")).sendKeys("root");
    }

    @And("User enters password in password field")
    public void userEntersPasswordInPasswordField() {
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
    }

    @And("User clicks on Login button on login page")
    public void userClicksOnLoginButtonOnLoginPage() throws InterruptedException {
        driver.findElement(By.id("wp-submit")).click();
        Thread.sleep(2000);
    }

    @Then("User clicks on all courses link")
    public void userClicksOnAllCoursesLink() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='All Courses']")).click();
        Thread.sleep(2000);
    }

    @And("User prints count of all courses displayed")
    public void userPrintsCountOfAllCoursesDisplayed() throws InterruptedException {
        System.out.println(driver.findElements(By.xpath("//div[@class='ld-course-list-items row']/div")).size());
        Thread.sleep(2000);
    }

    @Then("User clicks on contact link")
    public void userClicksOnContactLink() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Contact']")).click();
        Thread.sleep(2000);
    }

    @And("User fills all details in the form displayed")
    public void userFillsAllDetailsInTheFormDisplayed() throws InterruptedException {
        driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Yashashri Jadhav");
        Thread.sleep(1000);
        driver.findElement(By.id("wpforms-8-field_1")).sendKeys("yasjadha@in.ibm.com");
        Thread.sleep(1000);
        driver.findElement(By.id("wpforms-8-field_2")).sendKeys("Hello Alchemy");
        Thread.sleep(1000);
    }

    @And("user clicks on submit")
    public void userClicksOnSubmit() throws InterruptedException {
        driver.findElement(By.id("wpforms-submit-8")).click();
        Thread.sleep(2000);
    }

    @And("user prints message displayed after submission")
    public void userPrintsMessageDisplayedAfterSubmission() {
        System.out.println(driver.findElement(By.id("wpforms-confirmation-8")).getText());
    }

    @And("User selects any course on page and opens it")
    public void userSelectsAnyCourseOnPageAndOpensIt() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 '][2]/article /div[2]/p[2]/a")).click();
        Thread.sleep(3000);
    }

    @And("User selects any lesson inside the course and verifies course heading")
    public void userSelectsAnyLessonInsideTheCourseAndVerifiesCourseHeading() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='ld-expand-24186']/div/a")));
        driver.findElement(By.xpath("//div[@id='ld-expand-24186']/div/a")).click();
        Thread.sleep(2000);
    }

    @And("user completes a course by clicking on mark complete")
    public void userCompletesACourseByClickingOnMarkComplete() {
        driver.findElement(By.xpath("//input[@class='learndash_mark_complete_button']")).click();
    }


}
