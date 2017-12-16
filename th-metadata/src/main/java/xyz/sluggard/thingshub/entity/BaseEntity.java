package xyz.sluggard.thingshub.entity;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BaseEntity {
	
	private Integer id;
	
	private Timestamp createtime;
	
	private Timestamp modifytime;
	
	public boolean isEmpty() {
		return id == null || id <= 0;
	}

}
