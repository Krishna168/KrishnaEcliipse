package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {
	 

	static RequestSpecification req;

	public RequestSpecification requestSpecification() throws IOException
	{
		if(req==null)
		{
		PrintStream log= new PrintStream(new File("logging.txt"));
		req=new RequestSpecBuilder().setBaseUri(globalValue("baseUrl")).addQueryParam("key", "qaclick123")
				.addFilter(RequestLoggingFilter.logRequestTo(log))//for logging the request
				.addFilter(ResponseLoggingFilter.logResponseTo(log))//for logging the response
				.setContentType(ContentType.JSON).build();
		return req;
		}
		return req;
	}

	public static String globalValue(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("G:\\KrishnaEclipseWorkspace\\APIFramework\\src\\test\\java\\resources\\global.properties");
		prop.load(fis);
		return prop.getProperty(key);



	}
}
