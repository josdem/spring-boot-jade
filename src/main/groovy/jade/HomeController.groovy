package jade

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HomeController {

  @RequestMapping('/')
  @ResponseBody
  def index() {
    println 'Hello World!'
  }

}
