package com.app.webscrapercli;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebScraperCliApplication {
	public static void main(String[] args) {
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