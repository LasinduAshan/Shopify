import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sun.deploy.net.HttpRequest;
import org.json.JSONObject;

import javax.json.Json;
import javax.json.JsonString;
import javax.swing.text.html.parser.Parser;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Shopify2 {
    public static void main(String[] args) {

        try {
            Shopify2.sendPutRequest();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void sendPutRequest() throws Exception {

       /* String s = "{\n" +
                "\"product\": {\n" +
                "\"variants\": [\n" +
                "{\n" +
                "\"price\": \"100\"\n" +
                "}\n" +
                "]\n" +
                "}\n" +
                "}";*/

        /*String jsonString = "{\n" +
                "                \"product\": {\n" +
                "            \"title\": \"Test\",\n" +
                "                    \"body_html\": \"Test\",\n" +
                "                    \"vendor\": \"Test\",\n" +
                "                    \"product_type\": \"Test\",\n" +
                "                    \"variants\": [\n" +
                "            {\n" +
                "                \"title\": \"Test1\",\n" +
                "                    \"price\": \"600\"\n" +
                "            }\n" +
                "]\n" +
                "        }\n" +
                "}";*/

        //String data = jsonString.toString();

        /*String data = JSON.stringify(
        {
                "product": {
            "title": "Test",
                    "body_html": "Test",
                    "vendor": "Test",
                    "product_type": "Test",
                    "variants": [
            {
                "title": "Test1",
                    "price": "500"
            }
]
        }
}
);*/

       /* byte[] out = "{\"price\":\"600\"}" .getBytes(StandardCharsets.UTF_8);
        int length = out.length;*/


        String url = "https://ecomhuntonlinebusiness.myshopify.com/admin/products/6217329639595.json";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("PUT");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);
        con.setRequestProperty("Authorization", "Basic ZDQ1ZjVlYTkxZmM5NTRlMTk2YWMzODI0NTgzMDY4Yjc6c2hwcGFfNzMzY2QyYmMxMjYxZDE1MGEwNGJkYzA3NmYwN2VkMWM=");
        con.setRequestProperty("Cookie", "_y=b660097c-d9e2-4cfe-b5ae-24c50a572107; _s=8112c135-4e47-4bcc-bcc4-f88b279f7ebb; _shopify_y=b660097c-d9e2-4cfe-b5ae-24c50a572107; _shopify_s=8f95c39f-8f77-40bc-9582-e52ade753fa3; _shopify_fs=2021-02-02T12%3A43%3A54Z");

        OutputStreamWriter o = new OutputStreamWriter(con.getOutputStream());
        o.write(
                "{\n" +
                        "\"product\": {\n" +
                        "\"variants\": [\n" +
                        "{\n" +
                        "\"price\": \"500\"\n" +
                        "}\n" +
                        "]\n" +
                        "}\n" +
                        "}");
        o.flush();
        o.close();

         int responseCode = con.getResponseCode();
        System.out.println("\nSending 'PUT' request to URL : " + url);
        System.out.println("Status Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

       /* OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream());
        osw.write(String.format("{\n" +
                "                \"product\": {\n" +
                "            \"title\": \"Test\",\n" +
                "                    \"body_html\": \"Test\",\n" +
                "                    \"vendor\": \"Test\",\n" +
                "                    \"product_type\": \"Test\",\n" +
                "                    \"variants\": [\n" +
                "            {\n" +
                "                \"title\": \"Test1\",\n" +
                "                    \"price\": \"600\"\n" +
                "            }\n" +
                "]\n" +
                "        }\n" +
                "}"));
        //osw.write(jsonString);
        osw.flush();
        osw.close();*/


         /* try(OutputStream os = con.getOutputStream()) {
            byte[] input = jsonString.toString().getBytes("utf-8");
            os.write(input, 0, input.length);
        }*/

      /*  JsonParser parser = new JsonParser();
        Object obj2 = parser.parse(new FileReader("/Users/Lenovo/Desktop/text.json"));
        JsonElement json = parser.parse("{\n" +
                "                \"product\": {\n" +
                "            \"title\": \"Test\",\n" +
                "                    \"body_html\": \"Test\",\n" +
                "                    \"vendor\": \"Test\",\n" +
                "                    \"product_type\": \"Test\",\n" +
                "                    \"variants\": [\n" +
                "            {\n" +
                "                \"title\": \"Test1\",\n" +
                "                    \"price\": \"600\"\n" +
                "            }\n" +
                "]\n" +
                "        }\n" +
                "}");*/

        //JSONObject jsonObject = (JSONObject)obj2;

     /*   OutputStreamWriter out = new OutputStreamWriter(
                con.getOutputStream());
        out.write(String.valueOf(json));*/

       /* try(OutputStream os = con.getOutputStream()) {
            byte[] input = json.toString().getBytes("utf-8");
            os.write(input, 0, input.length);
        }*/

        System.out.println("product details :");
        System.out.println(response.toString());















    }

}
