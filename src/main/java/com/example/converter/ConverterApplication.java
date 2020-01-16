package com.example.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.converter.dao.PaisDAO;

@SpringBootApplication
public class ConverterApplication implements CommandLineRunner {

  @Autowired
  PaisDAO paisDAO;

  public static void main(String[] args) {
    SpringApplication.run(ConverterApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(paisDAO.count());
  }
}
