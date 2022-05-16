package day45_Abstraction.browser;

public class ChromeDriver extends RemoteWebDriver{
    public ChromeDriver() {
        super("ChromeDriver");
    }

    @Override
    public String toString() {
        return "ChromeDriver{}";
    }
}
