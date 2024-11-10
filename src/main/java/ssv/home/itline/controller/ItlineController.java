package ssv.home.itline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ssv.home.itline.service.UserService;

@Controller
@RequestMapping("/")
public class ItlineController {

    private final UserService userService;

    public ItlineController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("users", userService.findAll());
        return "itline";
    }
}
