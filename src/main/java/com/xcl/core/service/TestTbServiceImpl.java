package com.xcl.core.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xcl.core.bean.TestTb;
import com.xcl.core.dao.TestTbDao;


/**
 * 
 * @author lx
 *
 */
@Service
@Transactional
public class TestTbServiceImpl implements TestTbService{

	@Resource
	private TestTbDao testTbDao;
	
	public void addTestTb(TestTb testTb) {
		testTbDao.addTestTb(testTb);
		
		//未加事务@Transactional，测试[测试出错，没有事务，报错但插入成功]
		throw new RuntimeException();
	}

}
