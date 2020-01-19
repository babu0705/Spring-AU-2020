package SaxParser;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
public class SAXParserDemo {
public static void main(String[] args){
	try {
	File inputFile = new File("C:\\Users\\Babu\\eclipse-workspace\\XMLSAXParser\\src\\SaxParser\\netflix.xml");
	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();
	UserHandler2 userhandler = new UserHandler2();
	saxParser.parse(inputFile, userhandler);
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	}
	class UserHandler2 extends DefaultHandler {
	
		boolean id=false;
	boolean title = false;
	boolean cast = false;
	boolean country = false;
	boolean date_added = false;
	boolean release_year = false;
	boolean rating = false;
	boolean duration = false;
	boolean listed_in = false;
	boolean description = false;
	boolean type = false;
	
	
	@Override
	public void startElement(String uri,
	String localName, String qName, Attributes attributes)
	throws SAXException {
	if (qName.equalsIgnoreCase("shows")) {
	String show_id = attributes.getValue("show_id");
//	System.out.println("Show No : " + show_id);
	id=true;
	} else if (qName.equalsIgnoreCase("title")) {
	title = true;
	} else if (qName.equalsIgnoreCase("cast")) {
	cast = true;
	}else if (qName.equalsIgnoreCase("country")) {
		country = true;
	} else if (qName.equalsIgnoreCase("date_added")) {
		date_added = true;
	} else if (qName.equalsIgnoreCase("release_year")) {
		release_year = true;
	} else if (qName.equalsIgnoreCase("rating")) {
		rating = true;
	} else if (qName.equalsIgnoreCase("duration")) {
		duration = true;
	} else if (qName.equalsIgnoreCase("listed_in")) {
		listed_in = true;
	} else if (qName.equalsIgnoreCase("description")) {
		description = true;
	} else if (qName.equalsIgnoreCase("type")) {
		type = true;
	}
	}
	@Override
	public void endElement(String uri,
	String localName, String qName) throws SAXException {
	if (qName.equalsIgnoreCase("shows")) {
	System.out.println("------------------------------------------------------------------------------------------------");
	}
	}
	@Override
	public void characters(char ch[],
	int start, int length) throws SAXException {
	if (title) {
	System.out.println("Title: "
	+ new String(ch, start, length));
	title = false;
	} else if (cast) {
	System.out.println("Cast: "
	+ new String(ch, start, length));
	cast = false;
	} else if (country) {
	System.out.println("Country: "
	+ new String(ch, start, length));
	country = false;
	} else if (date_added) {
	System.out.println("Date Added: "
	+ new String(ch, start, length));
	date_added = false;
	} else if (release_year) {
		System.out.println("Release Year: "
				+ new String(ch, start, length));
				release_year = false;
	} else if (rating) {
		System.out.println("Rating: "
				+ new String(ch, start, length));
				rating = false;
	} else if (duration) {
		System.out.println("Duration: "
				+ new String(ch, start, length));
				duration = false;
	} else if (listed_in) {
		System.out.println("Listed In: "
				+ new String(ch, start, length));
				listed_in = false;
	} else if (description) {
		System.out.println("Description: "
				+ new String(ch, start, length));
				description = false;
	} else if (type) {
		System.out.println("Type: "
				+ new String(ch, start, length));
				type = false;
	}
		 
	}
	}