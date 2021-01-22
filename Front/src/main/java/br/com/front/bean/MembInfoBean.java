package br.com.front.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MembInfoBean {
	
	private Integer membGuild;
	
	private String membId;
	
	private String membPwd;
}
