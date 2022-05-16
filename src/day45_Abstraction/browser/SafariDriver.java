package day45_Abstraction.browser;

public class SafariDriver extends RemoteWebDriver{
    public SafariDriver() {
        super("SafariDriver");
    }

    @Override
    public String toString() {
        return "SafariDriver{}";
    }
}
