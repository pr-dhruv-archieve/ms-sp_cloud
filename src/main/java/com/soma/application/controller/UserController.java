package com.soma.application.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")           // localhost:1100/users
public class UserController {

    /**
     * Default execution
     * @return
     */
    @GetMapping("/")
    public List<String> getAllUsers() {
        return Arrays.asList(new String[]{"Mahendra","Loves", "Sonal"});
    }

    /**
     * Method to fetch all user from a particular page with some range
     * generally it is designed for reading parameter values in the method
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/range")
    public String getParamValue(@RequestParam(value="page") int page, @RequestParam(value="limit") int limit) {
        return "Returning users from page = " + page + " where page limit = " + limit;
    }

    /**
     * method to receive a particular
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") String id) {
        return "Saying Hello to user " + id + " using Get method.";
    }

    /**
     * Method to create a user
     * @return
     */
    @PostMapping("/create")
    public String createUser() {
        return "Saying Hello to new user using Post method";
    }

    /**
     * method to update the particular user
     * @param id
     * @return
     */
    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable("id") String id) {
        return "Saying Hello to user " + id + " using Put method.";
    }

    /**
     * Method to delete a particular user
     * @param id
     * @return
     */
    @DeleteMapping("delete/{id}")
    public String deleteUser(@PathVariable("id") String id) {
        return "Saying Hello to user " + id + " using Delete method.";
    }
}
