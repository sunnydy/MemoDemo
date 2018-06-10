package kr.sunnyd.memodemo.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public ModelAndView hello(@RequestParam(defaultValue = "world") String name) {
		ModelAndView mnv = new ModelAndView("hello");
		mnv.addObject("name", name);
		return mnv;
	}
}
