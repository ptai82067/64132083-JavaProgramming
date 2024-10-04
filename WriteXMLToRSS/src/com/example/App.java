package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rometools.rome.feed.synd.SyndContent;
import com.rometools.rome.feed.synd.SyndContentImpl;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndEntryImpl;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.feed.synd.SyndFeedImpl;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedOutput;

public class App {
	public static void main(String[] args) throws IOException, FeedException {
		// khoi tao syndFeed
		SyndFeed feed = new SyndFeedImpl();
		feed.setFeedType("rss_2.0");
		// dat thong tin cho feed
		feed.setTitle("Báo dân trí");
		feed.setLink("https://list.com");
		feed.setDescription("Những tin mới nhất từ báo dân trí");
		feed.setPublishedDate(new Date());
		//khoi tao mang list de luu cac entry
		List<SyndEntry> entries = new ArrayList<>();
		
		// khoi ta0 entry 1
		SyndEntry entry1 = new SyndEntryImpl();
		entry1.setTitle("Vụ án nghệ sĩ ăn chặn tiền từ thiện");
		entry1.setLink("https://item1.com");
		entry1.setPublishedDate(new Date());
		// khoi tao noi dung cua entry1
		SyndContent description = new SyndContentImpl();
		description.setType("text/plain");
		description.setValue("Nghi ngờ nghệ sĩ hoài linh ăn chặn 14 tỷ đồng từ mạnh thường quân, khiến cư dân mạng bức xúc");
		entry1.setDescription(description);
		
		entries.add(entry1);
		
		// khoi ta0 entry 2
		SyndEntry entry2 = new SyndEntryImpl();
		entry2.setTitle("Vụ việc cô giáo xin tiền của phụ huynh");
		entry2.setLink("https://item2.com");
		entry2.setPublishedDate(new Date());
		// khoi tao noi dung cua entry1
		SyndContent description2 = new SyndContentImpl();
		description2.setType("text/plain");
		description2.setValue("Mới đây vụ việc cô giáo xin tiền phụ huynh đã khiến dân mạng nghi ngờ hình ảnh giáo viên thời nay đang biến chất");
		entry2.setDescription(description2);
		entries.add(entry2);
		
		//gan danh sach entries vào feed 
		feed.setEntries(entries);
		FileWriter writer = new FileWriter("rss_feed.xml");
        SyndFeedOutput output = new SyndFeedOutput();
        output.output(feed, writer);

        writer.close();
        System.out.println("RSS feed đã được ghi vào rss_feed.xml.");
	}
}
