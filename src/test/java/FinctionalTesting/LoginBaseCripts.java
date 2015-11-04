package FinctionalTesting;

import org.testng.annotations.Test;

import SeleniumMindtree.SricptBasepage;

public class LoginBaseCripts extends SricptBasepage{

	
	@Test
	public void login(){
		//this is 2nd commite
		Mindtree().homePage().loginlink();
		Mindtree().homePage().Alltag();
		Mindtree().homePage().hashCode();
		
	}
}
