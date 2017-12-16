package xyz.sluggard.thingshub.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class User extends BaseEntity{
	
	private String email;
	
	private String phone;
	
	private String username;
	
	private String password;
	
	private String ucode;
	
}
