package ajax.controllers;

import core.domain.Booking;
import core.domain.Driver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.json.JsonObject;
import java.io.IOException;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/ajax/getPeople")
public class PeopleController {

  @RequestMapping(method = RequestMethod.POST, produces = "application/json")
  public @ResponseBody String loadPeople(@RequestBody String payload) throws IOException {
    System.out.println("In It : " + payload);

    Driver driver = new Driver(
      "Bitto",
      "UP",
      "123"
    );

    return driver.toJson().toString();

  }
}