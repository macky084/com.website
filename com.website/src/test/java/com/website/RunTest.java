package com.website;

import org.testng.annotations.Test;

public class RunTest {

	@Test(groups = { "sanity" })
	public void test() {
		

	}

	@Test(groups = { "sanity", "regression" })
	public void test1() {

	}

	@Test(groups = { "regression" })
	public void test2() {

	}

	@Test(groups = { "regression" })
	public void test3() {

	}

}
