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
    public String getAnswer1Param(
        @RequestParam("group1") String answer1,
        @RequestParam("group2") String answer2, 
        @ModelAttribute Quiz quiz) {

        quiz.setUserAnswer1(answer1);
        quiz.setUserAnswer2(answer2);
        return "result";
    }   
    
}