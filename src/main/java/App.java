import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("username", request.session().attribute("username"));
      
      //Username prompt message
      String inValidUser= "Hi. Please set your username below.";
      model.put("inValidUser", inValidUser);

      model.put("template", "templates/welcome.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/triangle", (request, response) -> {
      //show a "you need to set a username" message if the user tries to access the triangle page directly
      HashMap<String, Object> model = new HashMap<String, Object>();

      String inValidUser= "You need a username first!";
      model.put("inValidUser", inValidUser);


      model.put("template", "templates/triangle.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/triangle", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      //set up variables for the method that are received from form inputs
      int length = Integer.parseInt(request.queryParams("length"));
      int width = Integer.parseInt(request.queryParams("width"));
      int height = Integer.parseInt(request.queryParams("height"));

      Triangle myTriangle = new Triangle(length, width, height);
      model.put("myTriangle", myTriangle);

      // get the string that has been set as the username and stored in session
      String inputtedUsername = request.session().attribute("username");

      //add the username key/value pair to the model
      model.put("username", inputtedUsername);
      model.put("template", "templates/triangle.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    post("/welcome", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      // get the username from the form.
      String inputtedUsername = request.queryParams("username");

      //if username is not null or consists of whitespace let the user proceed
      if (inputtedUsername != null && inputtedUsername.trim().length() > 0){
        request.session().attribute("username", inputtedUsername);
        model.put("username", inputtedUsername);
      }

      else{ //let the user know they need to set a username.
        String inValidUser= "You need a username first!";
        model.put("inValidUser", inValidUser);

      }
      //output
      model.put("template", "templates/welcome.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
