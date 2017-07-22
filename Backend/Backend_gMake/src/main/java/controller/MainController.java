package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import Repository.testRepository;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import pojo.test;

@RestController
@RequestMapping("/")
public class MainController {

	@Autowired
	private testRepository testrepository;

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET,value="test",  produces = {MediaType.TEXT_PLAIN_VALUE})
	String entry(){
		return "Hello World";
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value="{userId}")
	public String getUserDetails(@PathVariable("userId") String userId){
		List<test> s = testrepository.findAll();
		Gson gson = new Gson();
		return gson.toJson(s);
	}
}
