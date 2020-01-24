package br.com.victor;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExampleController {

    @GetMapping(path = "/")
    public List<User> findAll(){
        List<User> users = new ArrayList<User>(){
            {
                add(new User("test1","test@test"));
                add(new User("test2","test3"));
            }
        };
        return users;
    }

}
