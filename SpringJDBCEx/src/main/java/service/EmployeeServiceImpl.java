package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.IEmployeeDao;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	IEmployeeDao dao;

	@Override
	@Transactional
	public void transferAmount(int fromId, int toId, double amount) {
		    dao.deductSalary(fromId, amount);
		    //int x = 10 / 0;
	        dao.addSalary(toId, amount);
		
	}

}
