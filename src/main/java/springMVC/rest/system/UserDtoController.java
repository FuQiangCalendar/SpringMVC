package springMVC.rest.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springMVC.service.system.UserDtoService;
import springMVC.tools.result.Result;

@RestController
@RequestMapping("/sys/user")
public class UserDtoController {
	@Autowired
	private UserDtoService userDtoService;
	
	@ResponseBody
	@RequestMapping(value = "/select_by_user", method = RequestMethod.GET)
	public Result selectByUser (@RequestParam("user") String user) {
		return userDtoService.selectByUser(user);
	}
	
}
