import com.sun.tools.internal.xjc.model.Model;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.route.HttpMethod.get;

public class RandomOTronController {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        final RandomOTron randomOTron = new RandomOTron();

        get("/", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("names", randomOTron.getNames());
            return new ModelAndView(model, "RandomOTron.vtl");
        }, velocityTemplateEngine);

//        get("/one", (req, res) -> {
//            HashMap<String, Object> model = new HashMap<>();
//            model.put("name", randomOTron.shuffleNames());
//            return new ModelAndView(model, "RandomOTron.vtl");
//        }, velocityTemplateEngine);

        get("/two", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            model.put("name", randomOTron.shuffleTwoNames());
            return  new ModelAndView(model, "RandomOTron.vtl");
        }, velocityTemplateEngine);
    }

}