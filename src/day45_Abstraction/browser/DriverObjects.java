package day45_Abstraction.browser;

public class DriverObjects{
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        System.out.println(chromeDriver);
        chromeDriver.executeScript("Script");
        chromeDriver.findElement("Locator1");
        chromeDriver.get("https://www.google.com");
        chromeDriver.getBrowserName();
        chromeDriver.getTitle();
        chromeDriver.takeScreenShot();
        chromeDriver.quit();

        System.out.println("------------------------------------------------");

        FireFoxDriver fireFoxDriver = new FireFoxDriver();
        System.out.println(fireFoxDriver);

        System.out.println("------------------------------------------------");

        EdgeDriver edgeDriver = new EdgeDriver();
        System.out.println(edgeDriver);

        System.out.println("------------------------------------------------");

        SafariDriver safariDriver = new SafariDriver();
        System.out.println(safariDriver);

        System.out.println("------------------------------------------------");

        OperaDriver operaDriver = new OperaDriver();
        System.out.println(operaDriver);

    }

}
