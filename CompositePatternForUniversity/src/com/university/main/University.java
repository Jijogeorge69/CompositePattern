package com.university.main;

import java.util.LinkedList;
import java.util.List;

/*
@author: Jijo George
@title: Composite Design Pattern Implementation
@type : Composite
*/

public class University extends OrganizationComponent {
	List<OrganizationComponent> organizationComponents = new LinkedList<>();

	public University(String name) {
		super(name);
	}

	@Override
	protected void add(OrganizationComponent organizationComponent) {
		organizationComponents.add(organizationComponent);
	}

	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		organizationComponents.remove(organizationComponent);
	}

	@Override
	protected void print() {
		System.out.println("--------------" + getName() + "--------------");

		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}

}
