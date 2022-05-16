package day45_Abstraction.browser;

public class FireFoxDriver extends RemoteWebDriver{
    public FireFoxDriver() {
        super("FireFoxDriver");
    }

    @Override
    public String toString() {
        return "FireFoxDriver{}";
    }
}
