package FinctionalTesting;

import org.testng.annotations.Test;

import SeleniumMindtree.SricptBasepage;

public class LoginBaseCripts extends SricptBasepage{

	
	@Test
	public void login(){
		Mindtree().homePage().loginlink();
		Mindtree().homePage().Alltag();
		
	}
}
