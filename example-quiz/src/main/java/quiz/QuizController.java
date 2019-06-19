package quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuizController {

    @GetMapping("/quiz")
    public String quizForm(Model model) {
        model.addAttribute("quiz", new Quiz());
        return "quiz";
    }

    @GetMapping("/result")
    public String quizSubmit(@ModelAttribute Quiz quiz) {
        return "result";
    }

}