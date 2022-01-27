package edu.kosmo.mjy.vo;




import java.security.Timestamp;
import java.util.List;


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
BID           NOT NULL NUMBER        
BTITLE        NOT NULL VARCHAR2(50)  
BCONTENT      NOT NULL VARCHAR2(100) 
BDATE         NOT NULL DATE          
BHIT                   NUMBER        
BTYPE_BTYPEID          NUMBER        
MEMBER_USERID          VARCHAR2(20) */
     

public class BoardVO {
	private int bid;
	private String btitle;
	private String bname;
	private String bcontent;
	private String btype_btypeid;
	private String member_userid;
	
	

	
	
}
