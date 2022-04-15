package day38_Inheritance.browserTask;

public class Opera extends Browser{
    @Override
    public void openBrowser() {
        System.out.println("opening opera browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing opera browser");
    }


}
