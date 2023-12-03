package com.app.webscrapercli;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

@SpringBootApplication
public class WebScraperCliApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebScraperCliApplication.class, args);

		// Jsoup test
		try {
			String url = "https://www.google.com";
			Document document = Jsoup.connect(url).get();
			System.out.println(document.html());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
