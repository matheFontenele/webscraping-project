package com.intuitive.webscraping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class FetchHtml {
    public static String fetchHtml(String pageUrl) throws IOException {
        StringBuilder content = new StringBuilder();
        URL url = new URL(pageUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))){
            String line;
            while ((line = reader.readLine()) != null){
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
