package com.example.homework11_6.AOP;

/**
 * @date 2023/12/9 20:57
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppleController {
    private final AppleMapper appleMapper;

    public AppleController(AppleMapper appleMapper) {
        this.appleMapper = appleMapper;
    }
    @GetMapping("/appleForm")
    public String showAppleForm(Model model) {
        model.addAttribute("apple", new Apple());
        return "appleForm";
    }
    @LogToTextFile
    @PostMapping("/submitApple")
    public String submitApple(@ModelAttribute Apple apple) {
        // 调用MyBatis Mapper将苹果信息写入数据库
        appleMapper.insertApple(apple);
        return "success";
    }
}
