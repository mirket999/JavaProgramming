package day38_Inheritance.browserTask;

public class BrowserTest {
    public static void main(String[] args) {
        ChromeBrowser chromeBrowser= new ChromeBrowser();
        FireFox fireFox = new FireFox();
        Safari safari = new Safari();
        Opera opera = new Opera();

        chromeBrowser.openBrowser();
        chromeBrowser.closeBrowser();

        fireFox.openBrowser();
        fireFox.closeBrowser();

        safari.openBrowser();
        safari.closeBrowser();

        opera.openBrowser();
        opera.closeBrowser();
    }
}
