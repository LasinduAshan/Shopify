import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;

public class Jsouprun {
    public static void main(String[] args){

        final String url = "https://ikman.lk";

      try {
          Document doc = Jsoup.connect(url).get();
         // Elements body = doc.select("tbody.lister-list");
          System.out.println(doc.outerHtml());
      }catch (Exception ex){
          ex.printStackTrace();
      }

        /*for (Element e : body.select("tr")){
           *//* String img = e.select("td.posterColumn img").attr("src");
            System.out.println(img);*//*
            String title = e.select("td.posterColumn img").attr("alt");
            System.out.println(title);

        }*/
    }
}
