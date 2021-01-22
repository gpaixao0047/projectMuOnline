package br.com.core.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

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
@SequenceGenerator(name = "seq_noticias", allocationSize = 1)
public class Noticias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_noticias")
	private Integer idNoticias;
	private String conta;
	private String personagem;
	private String noticia;
	private String comentario;
	private LocalDateTime data;
	
}
