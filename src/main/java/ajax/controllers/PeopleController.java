package ajax.controllers;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping("/ajax/getPeople")
public class PeopleController {

	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody String loadPeople(@RequestBody String payload) throws IOException {
		System.out.println("In It : " + payload);
		JSONObject obj = new JSONObject();
		obj.put("name", "Tarun");
		return obj.toString();
	}
}