package com.app.webscrapercli;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebScraperCliApplication{
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println(
					"[ERROR] Please provide a URL and a CSS selector!");
			System.out.println(
					"CORRECT FORMAT: gradle -q run --args='<url> <css-selector>'");
			return;
		}

		String url = args[0];
		String cssSelector = args[1];

		try {
			Document doc = Jsoup.connect(url).get();
			Elements elements = doc.select(cssSelector);

			if (elements.isEmpty()) {
				System.out.println("No elements match the provided CSS selector");
			} else {
				System.out.println("Text content of the first matching element:");
				System.out.println(elements.first().text());
			}
		} catch (IOException e) {
			System.out.println("Error fetching the URL");
			e.printStackTrace();
		}
	}
}
