package org.xdemo.example.websocket.websocket;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List<String>lists=new ArrayList<String>();
		lists.add("chen");
		lists.add("song");
		
		lists.remove(0);
		for(String str:lists){
			System.out.println(str);
		}
	}
}
