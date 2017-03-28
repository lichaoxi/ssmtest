package com.xcl.core.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xcl.core.bean.TestTb;
import com.xcl.core.common.junit.SpringJunitTest;
import com.xcl.core.service.TestTbService;


/**
 * 测试
 * @author lx
 */
public class TestTestTb2 extends SpringJunitTest{

	@Autowired
	private TestTbService testTbService;
	@Test
	public void testAdd() throws Exception {
		TestTb testTb = new TestTb();
		testTb.setName("金乐乐");
		testTbService.addTestTb(testTb);
	}
}
