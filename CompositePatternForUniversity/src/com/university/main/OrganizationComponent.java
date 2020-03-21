package com.university.main;

/*
@author: Jijo George
@title: Composite Design Pattern Implementation
@type : Component
*/

public abstract class OrganizationComponent {

	private String name;

	public OrganizationComponent(String name) {
		this.name = name;
	}

	protected abstract void add(OrganizationComponent organizationComponent);

	protected abstract void remove(OrganizationComponent organizationComponent);

	protected abstract void print();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
