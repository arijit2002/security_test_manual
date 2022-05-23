package a;

import org.springframework.boot.web.servlet.error.ErrorController;

public class MyErrorController implements ErrorController{
	
	public String getErrorPath() {
		return null;
	}
}
