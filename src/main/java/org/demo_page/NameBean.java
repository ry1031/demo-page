package org.demo_page;

import java.io.Serializable;

public class NameBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -992065848381091880L;
	
	private String name = "World ";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "NameBean [name=" + name + "]";
	}
}
