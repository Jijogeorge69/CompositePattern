package com.university.main;

import java.util.LinkedList;
import java.util.List;

/*
@author: Jijo George
@title: Composite Design Pattern Implementation
@type : Composite
*/

public class College extends OrganizationComponent {

	List<OrganizationComponent> organizationComponents = new LinkedList<OrganizationComponent>();

	public College(String name) {
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
		System.out.println("                        " + getName());
		// Traverse organizationComponents
		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}
}
