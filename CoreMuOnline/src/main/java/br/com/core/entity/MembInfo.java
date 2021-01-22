package br.com.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
public class MembInfo {
	
	@Id
	@Column(name = "memb_guid")
	private Integer membGuild;
	
	@Column(name = "memb___id")
	private String membId;
	
	@Column(name = "memb__pwd")
	private String membPwd;
	
	

}
