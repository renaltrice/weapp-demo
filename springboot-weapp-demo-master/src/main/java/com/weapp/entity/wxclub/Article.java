package com.weapp.entity.wxclub;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="t_articles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
	@Id
	private String id;
	
	private String path;
	
	private String groupPath;
	
	private String title;
	
	private String digest;
	
	private String createTime;
	
	private Integer browers;
	
	private Integer comments;
	
	private Map<String,String> author;
	
	private String mark;
	
	private String content;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getGroupPath() {
		return groupPath;
	}

	public void setGroupPath(String groupPath) {
		this.groupPath = groupPath;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getBrowers() {
		return browers;
	}

	public void setBrowers(Integer browers) {
		this.browers = browers;
	}

	public Integer getComments() {
		return comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public Map<String, String> getAuthor() {
		return author;
	}

	public void setAuthor(Map<String, String> author) {
		this.author = author;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	 
}
