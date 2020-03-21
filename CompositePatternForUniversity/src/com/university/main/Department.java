package com.university.main;

import java.util.LinkedList;
import java.util.List;

/*
@author: Jijo George
@title: Composite Design Pattern Implementation
@type : Leaf
*/

public class Department extends OrganizationComponent {

	List<OrganizationComponent> organizationComponents = new LinkedList<OrganizationComponent>();

	public Department(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void add(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void print() {
		System.out.println("                                       " + getName());

		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}

	}

}
