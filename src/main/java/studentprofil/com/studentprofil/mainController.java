package studentprofil.com.studentprofil;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


@Controller
public class mainController {

    @GetMapping("/main")
    public String index(Model model) {

        Student student = new Student(
            "Bryant",
            "2086022510003",
            "FullStack Development - Universitas Ciputra Makassar",
            "I am a Second-semester FullStack Development student. " +
            "I enjoy building web applications. " +
            "Outside of class, I like reading, playing chess, and swimming."
        );

        List<Course> courses = List.of(
            new Course("Advance Progamming", "R501", 3, "B"),
            new Course("Database", "R502", 3, "A-"),
            new Course("Struktur Data", "R508", 3, "+"),
            new Course("Web Programming", "R507", 3, "BB+")
        );

        List<String> hobbies = List.of("Playing Chess", "Swimming", "Playing Games");

        model.addAttribute("student", student);
        model.addAttribute("courses", courses);
        model.addAttribute("hobbies", hobbies);

        return "ProfilHTML";
    }

    @GetMapping("/tes")
    public String ProfilHTML() {
        return "ProfilHTML";
    }
}

