package a;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SecController {
	
	@GetMapping("/")
	public String index(@AuthenticationPrincipal User user) {
		return "<h1>Landing Page.....Permitted to all!!!!!!!</h1>"
				+ "<form action=\"user\"><button>Go to User Page</button></form>&nbsp;&nbsp;&nbsp;"
				+ "<form action=\"admin\"><button>Go to Admin Page</button></form>";
	}
	@GetMapping("/user")
	public String user(@AuthenticationPrincipal User user) {
		return "user";
	}
	
	@GetMapping("/index")
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
