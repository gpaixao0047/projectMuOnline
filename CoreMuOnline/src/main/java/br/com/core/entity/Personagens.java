package br.com.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Builder)
@Entity
@FieldNameConstants
@Table(name = "Character")
public class Personagens {
	
	@Id
	@Column(name = "Name")
	private String name;
	
	@Column(name = "AccountID")
	private String accontId;
	
	@Column(name = "cLevel")
	private Integer cLevel;
	
	@Column(name = "Class")
	private Integer classe;
}
