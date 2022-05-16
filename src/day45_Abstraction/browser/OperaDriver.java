package day45_Abstraction.browser;

public class OperaDriver extends RemoteWebDriver{
    public OperaDriver( ) {
        super("OperaDriver");
    }

    @Override
    public String toString() {
        return "OperaDriver{}";
    }
}
