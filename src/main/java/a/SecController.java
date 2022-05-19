package a;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SecController {
	
	@GetMapping("/user")
	public String user(@AuthenticationPrincipal User user) {
		return "user";
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/admin")
	public String admin(@AuthenticationPrincipal User user) {
		String username = user.getUsername();
		return "<h1>This is the admin Page!!!!! U are "+username.toUpperCase() +"</h1>"
				+ "<form action=\\\"logout\\\"><button>Logout from Here</button></form>";
	}
	
}
