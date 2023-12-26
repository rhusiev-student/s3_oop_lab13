//curl https://api.openai.com/v1/chat/completions \
//   -H "Content-Type: application/json" \
//   -H "Authorization: Bearer $OPENAI_API_KEY" \
//   -d '{
//   "model": "gpt-3.5-turbo-16k",
//   "messages": [
//     {
//       "role": "system",
//       "content": "Get the company logo'\''s (preferably png or jpg) url and description of the company from the html provided by user. Give an answer in the format:\nURL: https://url.to.jpg\nDescription: description of the company"
//     },
//     {
//       "role": "user",
//       "content": "<html_here>"
//     }
//   ],
//   "temperature": 1,
//   "max_tokens": 16384,
//   "top_p": 1,
//   "frequency_penalty": 0,
//   "presence_penalty": 0
// }'
package nl.r1a.task3;

import org.json.JSONObject;
import java.io.OutputStream;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class BrandFetch {
    public String fetch(String domain) throws IOException {
        String url = "https://brandfetch.com/" + URLEncoder.encode(domain, StandardCharsets.UTF_8.toString());
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");
        connection.connect();
        // String html = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        String html = "Hello \"there";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("0", html);
        html = jsonObject.toString();
        // Get substring from 7th character to the end
        html = html.substring(7, html.length() - 2);
        // Make API call to OpenAI using bash script called "openai.sh"
        ProcessBuilder processBuilder = new ProcessBuilder("./openai.sh", html);
        // Print what command is being run
        Process process = processBuilder.start();
        String text = new Scanner(process.getInputStream()).useDelimiter("\\Z").next();
        // String text = "Hello there";
        return text;
    }
}
