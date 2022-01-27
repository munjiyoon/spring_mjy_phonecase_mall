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

/*
PRODUCTID    NOT NULL NUMBER        
PRODUCTNAME  NOT NULL VARCHAR2(20)  
PRODUCTPRICE NOT NULL NUMBER        
PRODUCTDES            VARCHAR2(100) 
PRODUCTIMG            VARCHAR2(100) 
PRODUCTSTOCK          NUMBER   
*/     

public class ProductVO {
	private int productid;
	private String productname;
	private int productprice;
	private String productdes;
	private String productimg;
	private int productstock;
	
	private String productsmallimg;
	
	
	
}
