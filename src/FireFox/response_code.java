package FireFox;

import java.util.Arrays;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class response_code {
	
	 public static void main(String[] args) {

			WebDriver driver = new ChromeDriver(); 
	        
			 List<String> urls = Arrays.asList(
			            "https://www.100percentpure.com/",
			            "https://www.google.com/hggggggghhh",
			            "https://www.google.com/haseena",
			            "https://httpstat.us/", 
			            "https://httpstat.us/503",
			            
			            
			            "https://httpbin.org/status/200",   // 200 OK
			            "https://httpbin.org/post",          // 201 Created (POST)
			            "https://httpbin.org/status/204",    // 204 No Content
			            "https://httpbin.org/status/301",    // 301 Moved Permanently
			            "https://httpbin.org/status/302",    // 302 Found
			            "https://httpbin.org/etag/12345",    // 304 Not Modified (conditional GET)
			            "https://httpbin.org/status/400",    // 400 Bad Request
			            "https://httpbin.org/basic-auth/user/pass", // 401 Unauthorized
			            "https://httpbin.org/status/404",    // 404 Not Found
			            "https://httpbin.org/status/500",    // 500 Internal Server Error
			            "https://httpstat.us/502",           // 502 Bad Gateway
			            "https://httpstat.us/503"            // 503 Service Unavailable
			           
			        );


			 for (String url : urls) {
		            driver.get(url);

		            try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
		                HttpGet httpGet = new HttpGet(url);
		                HttpResponse response = httpClient.execute(httpGet);
		                int statusCode = response.getStatusLine().getStatusCode();

		                System.out.println("Response Code for " + url + ": " + statusCode);
		            } catch (Exception e) {
		                System.out.println("Error retrieving response code for " + url + ": " + e.getMessage());
		            }
		        }

		        driver.quit();
		    }
	}
	
	

