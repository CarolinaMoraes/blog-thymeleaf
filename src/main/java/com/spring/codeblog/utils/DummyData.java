package com.spring.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;

@Component
public class DummyData {

	@Autowired
	CodeblogRepository codeblogRepository;

//	@PostConstruct
	public void savePosts() {
		List<Post> postList = new ArrayList<Post>();
		Post post1 = new Post();
		post1.setAutor("Carolina de Moraes Josephik");
		post1.setTexto("Wouldn't it be nice if we were older\r\n" + "Then we wouldn't have to wait so long?\r\n"
				+ "And wouldn't it be nice to live together\r\n" + "In the kind of world where we belong?");
		post1.setData(LocalDate.now());
		post1.setTitulo("Wouldn't it be nice?");

		Post post2 = new Post();
		post2.setAutor("Carolina de Moraes Josephik");
		post2.setTexto("Wouldn't it be nice if we were older\r\n" + "Then we wouldn't have to wait so long?\r\n"
				+ "And wouldn't it be nice to live together\r\n" + "In the kind of world where we belong?");
		post2.setData(LocalDate.now());
		post2.setTitulo("AWS");

		postList.add(post1);
		postList.add(post2);

		for (Post post : postList) {
			Post postSaved = codeblogRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}

}
