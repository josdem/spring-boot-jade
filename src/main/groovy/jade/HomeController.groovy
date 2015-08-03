package jade

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.ui.Model

@Controller
class HomeController {

  @RequestMapping('/')
  String index(Model model) {
    model.addAttribute 'currentTime', new Date()
    'index'
  }

}
