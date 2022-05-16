package day45_Abstraction.browser;

public class EdgeDriver extends RemoteWebDriver{
    public EdgeDriver() {
        super("EdgeDriver");
    }

    @Override
    public String toString() {
        return "EdgeDriver{}";
    }
}
