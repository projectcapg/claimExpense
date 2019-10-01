package com.cg.ecm;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cg.ecm.dto.ExpenseClaimed;
import com.cg.ecm.repository.ExpenseClaimRepo;
import com.cg.ecm.service.ClaimExpenseServiceImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Mock
	@Autowired
	ExpenseClaimRepo repo;

	@InjectMocks
	ClaimExpenseServiceImpl service;

	@Spy
	List<ExpenseClaimed> list = new ArrayList<ExpenseClaimed>();

	@Captor
	ArgumentCaptor<ExpenseClaimed> captor;

	@Before
	public void setup()	{
		MockitoAnnotations.initMocks(this);
		list.add(new ExpenseClaimed(1, 1, 1, Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.now()),
		1500.00, 1));
		list.add(new ExpenseClaimed(2, 2, 2, Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.now()),
		1501.00, 2));
	}

	@Test
	public void saveClaim()	{
		ExpenseClaimed claim = new ExpenseClaimed(1, 1, 1, Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.now()),
		1500.00, 1);
		when(repo.save(any(ExpenseClaimed.class))).thenReturn(claim);
		service.createExpense(list.get(0));
		verify(repo, times(1)).save(captor.capture());
		Assert.assertEquals(captor.getValue().getExpenseCodeId(), 1);
		Assert.assertEquals(2, list.size());
		verify(list, times(2)).add(any(ExpenseClaimed.class));
	}

}
