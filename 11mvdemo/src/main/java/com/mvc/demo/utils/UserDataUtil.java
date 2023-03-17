package com.mvc.demo.utils;

import java.util.ArrayList;
import java.util.List;

import com.mvc.demo.model.User;

public class UserDataUtil {
  public static List<User> getUsers(){
	  List<User> users=new ArrayList<>();
	  users.add(new User("John","Wilson","jwil@gmail.com","123"));
	  users.add(new User("Alex","Morris","amori@gmail.com","456"));
	  users.add(new User("Will","Smith","wsmith@gmail.com","673"));
	  users.add(new User("Rob","Decker","rdecker@gmail.com","678"));
return users;
  }
}
