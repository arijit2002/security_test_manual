package a;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SecController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/user")
	public String user(@AuthenticationPrincipal User user) {
		return "user";
	}
	
	@GetMapping("/admin")
	public String admin(@AuthenticationPrincipal User user) {
		return "admin";
	}
	
	@RequestMapping("/accessdenied")
	public String accessdeniedpage() {
		return "accessdenied";
	}
}
