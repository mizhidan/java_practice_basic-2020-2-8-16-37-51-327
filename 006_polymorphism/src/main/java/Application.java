import softwares.Chrome;
import softwares.Idea;
import softwares.Wechat;

public class Application {
    public static void main(String[] args) {
        Wechat wechat = new Wechat();
        Chrome chrome = new Chrome();
        Idea idea = new Idea();
        wechat.useF5();
        chrome.useF5();
        idea.useF5();
    }
}
