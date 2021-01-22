package br.com.front.view.membinfo;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.front.bean.MembInfoBean;
import br.com.front.controller.MembInfoController;
import br.com.front.controller.PersonagensController;
import lombok.Data;


@Named
@ManagedBean(name = "membInfoListView")
@ViewScoped
@Data
public class MembInfoListView implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<MembInfoBean> listMembInfoBean;
	private Integer totalDeContas;
	private Integer totalPersonagens;
	
	@PostConstruct
	private void init() {
		try {
			listMembInfoBean = new MembInfoController().getAll();
			totalDeContas = new MembInfoController().getTotalContas();
			totalPersonagens = new PersonagensController().getTotalPersonagens();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
