package com.cg.ecm.repositry;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ecm.dto.ExpenseClaimed;

public interface ExpenseClaimRepo extends JpaRepository<ExpenseClaimed, Integer>{

}
