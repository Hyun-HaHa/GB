package com.koreait.thymeleaf.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koreait.thymeleaf.data.User;

@Controller
@RequestMapping("/basic")
public class BasicController {

	@GetMapping("text-basic")
	public String textBasic(Model model) {
		model.addAttribute("data", "SpringBoot!");
		return "basic/text-basic";
	}
	
	@GetMapping("text-unescaped")
	public String TextUnescaped(Model model) {
		model.addAttribute("data", "<b>SpringBoot!</b>");
		return "basic/text-unescaped";
	}
	
	@GetMapping("variable")
	public String Variable(Model model) {
		// 객체로 담아주는 법
		User userA = new User("userA", 20);
		User userB = new User("userB", 10);
		
		// list로 담아주는 법
		List<User> list = new ArrayList<>();
		list.add(userA);
		list.add(userB);
		
		// Map으로 담아주는 법
		Map<String, User> map = new HashMap<>();
		map.put("userA", userA);
		map.put("userB", userB);
		
		
		model.addAttribute("user", userA);
		model.addAttribute("users", list);
		model.addAttribute("userMap", map);
		
		return "basic/variable";
	}
	
	@GetMapping("basic-objects")
	public String basicObjects(HttpSession session) {
		session.setAttribute("sessionData", "UserID");
		
		return "basic/basic-objects";
	}
	
	
	
	
	
}




