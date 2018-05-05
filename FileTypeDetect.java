

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.tika.Tika;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.ContentHandler;

import javax.activation.MimetypesFileTypeMap;

public class FileTypeDetect {
	
	public static String getTypeMethod1(String f) throws IOException {
		
		Path s = Paths.get(f);
		return Files.probeContentType(s);
	}
	
	public static String getTypeMethod2(File f ) throws IOException{
		
		return new MimetypesFileTypeMap().getContentType(f);
	}

	public static String getTypeMethod3(File f) throws IOException{

		FileInputStream is = null;
		String t = null;
	    try {
	      //File f = new File("C:/Temp/mime/test.docx");
	      is = new FileInputStream(f);

	      ContentHandler contenthandler = new BodyContentHandler();
	      Metadata metadata = new Metadata();
	      metadata.set(Metadata.RESOURCE_NAME_KEY, f.getName());
	      Parser parser = new AutoDetectParser();
	      // OOXMLParser parser = new OOXMLParser();
	      parser.parse(is, contenthandler, metadata, new ParseContext());
	      t = metadata.get(Metadata.CONTENT_TYPE);
	      //System.out.println("Mime: " + metadata.get(Metadata.CONTENT_TYPE));
	      //System.out.println("Title: " + metadata.get(Metadata.TITLE));
	      //System.out.println("Author: " + metadata.get(Metadata.AUTHOR));
	      //System.out.println("content: " + contenthandler.toString());
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	    finally {
	        if (is != null) is.close();
	    }
		
		return t;
	}
	
	public static String getTypeMethod4(File f) throws IOException{
		Tika t = new Tika();
		return t.detect(f);
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName = "/home/likewise-open/ZOHOCORP/gokulraj-0835/Desktop/Return_Ticket.pdf";
		File f = new File(fileName);
		
		System.out.println( " File Name = " + f.getName() );
		System.out.println( " MIME 1 = " + getTypeMethod1(f.getName()) );
		System.out.println("MIME 2 = " + getTypeMethod2(f) );
		System.out.println("MIME 3 = " + getTypeMethod3(f) );
		System.out.println("MIME 4 = " + getTypeMethod4(f) );


	}

}
