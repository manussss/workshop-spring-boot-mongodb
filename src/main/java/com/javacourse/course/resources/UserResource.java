package com.javacourse.course.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.course.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity <List<User>> findAll(){
		User fernanda = new User("1", "Fernanda Gonçalves", "maria@gmail.com");
		User camila = new User("2","Camila Cabello", "camila@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(fernanda, camila));
		return ResponseEntity.ok().body(list);
	}
}
