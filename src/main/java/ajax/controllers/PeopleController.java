package ajax.controllers;

import com.sun.deploy.net.HttpResponse;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/ajax/getPeople")
public class PeopleController {

	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public void loadPeople(HttpServletResponse httpResponse) throws IOException {
		System.out.println("In It");
		httpResponse.setContentType("application/json");
		JSONObject obj = new JSONObject();
		obj.put("name", "Tarun");
		httpResponse.getWriter().write(obj.toString());
		//return obj.toString();
	}
}