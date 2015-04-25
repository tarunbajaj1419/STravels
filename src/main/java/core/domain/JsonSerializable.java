package core.domain;

import javax.json.*;

/**
 * Created by tarunbajaj on 22/04/15.
 */
public interface JsonSerializable {

  default JsonArray toJson(JsonArrayBuilder jsonArrayBuilder, JsonObject jsonObject)
  {
    return jsonArrayBuilder.add(jsonObject).build();
  }

  JsonObject toJson ();
}
