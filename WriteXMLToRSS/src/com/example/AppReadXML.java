package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

public class AppReadXML {
	public static void main(String[] args) throws IOException, IllegalArgumentException, FeedException {
		SyndFeedInput input = new SyndFeedInput();
		FileInputStream fis = new FileInputStream(new File("rss_feed.xml"));
		SyndFeed feed = input.build(new XmlReader(fis));
		System.out.println("Tiêu đề:" + feed.getTitle() );
		System.out.println("Link: "+ feed.getLink());
		System.out.println("Thời gian: "+ feed.getPublishedDate());
		System.out.println("Mô tả: "+ feed.getDescription());
		
		for(SyndEntry entry : feed.getEntries()) {
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("Tiêu đề bài viết: "+ entry.getTitle());
			System.out.println("Link: "+ entry.getLink());
			System.out.println("Thời gian: "+ entry.getPublishedDate());
			System.out.println("Mô tả: "+ entry.getDescription().getValue());
		}
	}
}
