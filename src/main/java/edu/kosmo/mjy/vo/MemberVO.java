package edu.kosmo.mjy.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberVO {
	private String userid;
	private String password;
	private String phone;
	private int age;
	private int miliage;
	private String name;
	private String add1;
	private String add2;				
}
