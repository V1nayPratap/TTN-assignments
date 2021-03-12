package com.JPAwithHibernate.Employee;

import com.JPAwithHibernate.Employee.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ProductApplication.class, args);

    }

}
