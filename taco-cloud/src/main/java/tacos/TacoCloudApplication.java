package tacos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.swing.*;
import java.nio.file.StandardCopyOption;

@SpringBootApplication
public class TacoCloudApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
        System.out.println("2021700092 박서진");
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }
}
