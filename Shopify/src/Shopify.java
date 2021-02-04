import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

/*import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;*/
import javax.json.Json;
import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;

public class Shopify {

    Shopify(){

    }



    public static void main(String[] args) {
        try {
            Shopify.sendRequest();
            Shopify.sendUserRequest();
            Shopify.sendCustomerRequest();
            Shopify.sendAdminRequest();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendRequest() throws Exception {
        String url = "https://ecomhuntonlinebusiness.myshopify.com/admin/products?selectedView=all";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("Authorization", "Basic ZDQ1ZjVlYTkxZmM5NTRlMTk2YWMzODI0NTgzMDY4Yjc6c2hwcGFfNzMzY2QyYmMxMjYxZDE1MGEwNGJkYzA3NmYwN2VkMWM=");
        con.setRequestProperty("Cookie", "_y=b660097c-d9e2-4cfe-b5ae-24c50a572107; _s=8112c135-4e47-4bcc-bcc4-f88b279f7ebb; _shopify_y=b660097c-d9e2-4cfe-b5ae-24c50a572107; _shopify_s=8f95c39f-8f77-40bc-9582-e52ade753fa3; _shopify_fs=2021-02-02T12%3A43%3A54Z");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();


        System.out.println("Product details :");
        System.out.println(response.toString());
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------------------");




        /*JsonReader reader = (JsonReader) Json.createReader(response);
        JsonObject customer = reader.readObject();
        String id = customer.getString("id");
        String name = customer.getString("name");
        String address = customer.getString("address");*/

       /* Gson gson = new Gson();
        JsonParser parser = new JsonParser();
        JsonObject object = (JsonObject) parser.parse(String.valueOf(response));// response will be the json String
        //YourPojo emp = gson.fromJson(object, YourPojo.class);
        System.out.println(object);*/


       /* Data data = new Gson().fromJson(response.toString(), Data.class);
        System.out.println(data);*/

        /*JsonReader reader = Json.createReader(response.getInputStream());
        JsonObject customer = reader.readObject();
        String id = customer.getString("id");
        String name = customer.getString("name");
        String address = customer.getString("address");
        double salary = Double.parseDouble(customer.get("salary").toString());*/

    }

    public static void sendUserRequest() throws Exception {
        String url = "https://ecomhuntonlinebusiness.myshopify.com/admin/orders?selectedView=all";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("Authorization", "Basic ZDQ1ZjVlYTkxZmM5NTRlMTk2YWMzODI0NTgzMDY4Yjc6c2hwcGFfNzMzY2QyYmMxMjYxZDE1MGEwNGJkYzA3NmYwN2VkMWM=");
       // con.setRequestProperty("Cookie", "_y=b660097c-d9e2-4cfe-b5ae-24c50a572107; _s=8112c135-4e47-4bcc-bcc4-f88b279f7ebb; _shopify_y=b660097c-d9e2-4cfe-b5ae-24c50a572107; _shopify_s=8f95c39f-8f77-40bc-9582-e52ade753fa3; _shopify_fs=2021-02-02T12%3A43%3A54Z");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Status Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();


        System.out.println("Order details :");
        System.out.println(response.toString());
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------------------");


    }

    public static void sendAdminRequest() throws Exception {
        String url = "https://ecomhuntonlinebusiness.myshopify.com/admin/api/2020-01/shop.json";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("Authorization", "Basic ZDQ1ZjVlYTkxZmM5NTRlMTk2YWMzODI0NTgzMDY4Yjc6c2hwcGFfNzMzY2QyYmMxMjYxZDE1MGEwNGJkYzA3NmYwN2VkMWM=");
        // con.setRequestProperty("Cookie", "_y=b660097c-d9e2-4cfe-b5ae-24c50a572107; _s=8112c135-4e47-4bcc-bcc4-f88b279f7ebb; _shopify_y=b660097c-d9e2-4cfe-b5ae-24c50a572107; _shopify_s=8f95c39f-8f77-40bc-9582-e52ade753fa3; _shopify_fs=2021-02-02T12%3A43%3A54Z");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Status Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();


        System.out.println("Admin details :");
        System.out.println(response.toString());
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------------------");

    }

    public static void sendCustomerRequest() throws Exception {
        String url = "https://ecomhuntonlinebusiness.myshopify.com/admin/customers";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("Authorization", "Basic ZDQ1ZjVlYTkxZmM5NTRlMTk2YWMzODI0NTgzMDY4Yjc6c2hwcGFfNzMzY2QyYmMxMjYxZDE1MGEwNGJkYzA3NmYwN2VkMWM=");
        // con.setRequestProperty("Cookie", "_y=df12b036-7ac3-4455-8700-e7809ca38acc; _s=8068b3a6-448a-469b-a644-c37e846c3102; _shopify_y=df12b036-7ac3-4455-8700-e7809ca38acc; _shopify_s=8068b3a6-448a-469b-a644-c37e846c3102; _shopify_fs=2021-02-02T10%3A49%3A10Z");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Status Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();


        System.out.println("Customer details :");
        System.out.println(response.toString());
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------------------");

    }



}
