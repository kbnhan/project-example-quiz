package quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuizController {

    @GetMapping("/quiz")
    public String quizForm(Model model) {
        model.addAttribute("quiz", new Quiz());
        return "quiz";
    }

    @RequestMapping("/result")
    public String getAnswer(@RequestParam("group1") String answer, @ModelAttribute Quiz quiz) {
        quiz.setUserAnswer(answer);
        return "result";
    }

    // @GetMapping("/result")
    // public String quizSubmit(@ModelAttribute Quiz quiz) {
    //     return "result";
    // }

}