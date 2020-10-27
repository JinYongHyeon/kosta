package org.kosta.model;

import java.util.ArrayList;

public class ListVO {
	private ArrayList<PostVO> list;
	private PagingBeanEX paginBean;

	public ListVO(ArrayList<PostVO> list, PagingBeanEX paginBean) {
		super();
		this.list = list;
		this.paginBean = paginBean;
	}

	public ArrayList<PostVO> getList() {
		return list;
	}

	public void setList(ArrayList<PostVO> list) {
		this.list = list;
	}

	public PagingBeanEX getPaginBean() {
		return paginBean;
	}

	public void setPaginBean(PagingBeanEX paginBean) {
		this.paginBean = paginBean;
	}

}
