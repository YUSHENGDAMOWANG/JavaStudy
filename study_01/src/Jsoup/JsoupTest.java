package Jsoup;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.net.MalformedURLException;
import java.net.URL;

public class JsoupTest {
    public static void main(String[] args) throws Exception {
        String html = "https://www.baidu.com";
        URL url = new URL(html);
        Document parse = org.jsoup.Jsoup.parse(url,3000);
        //Jsoup.parse()
        System.out.println(parse);
    }
}
