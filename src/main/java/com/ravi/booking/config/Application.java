package com.ravi.booking.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Application {
    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

//@Configuration
//@ComponentScan(basePackages = "com.ravi.booking")
//@Import({BeanConfig.class, WebConfig.class})
////@EnableWebMvc
//@EnableAutoConfiguration
//public class Application extends SpringBootServletInitializer {
//
//    private static Class applicationClass = Application.class;
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(applicationClass);
//    }
//
//}


