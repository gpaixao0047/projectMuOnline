package br.com.front.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Personagens {
	private String name;
	private String accontId;
	private Integer cLevel;
	private Integer classe;
}
