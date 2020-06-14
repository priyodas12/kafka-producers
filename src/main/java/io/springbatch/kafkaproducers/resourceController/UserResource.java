package io.springbatch.kafkaproducers.resourceController;

import io.springbatch.kafkaproducers.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/kafka")
public class UserResource {

    @Autowired
    KafkaTemplate<String, Users> kafkaTemplate;

    private static final String TOPIC="KAFKAJSONTOPIC";

    @GetMapping("/publish/{name}")
    public String postMessage(@PathVariable("name") final String name){
        //Random randomValue=new Random();
        kafkaTemplate.send(TOPIC,new Users(787L,name,823828.00));
        return "published successfully!!";
    }
}
