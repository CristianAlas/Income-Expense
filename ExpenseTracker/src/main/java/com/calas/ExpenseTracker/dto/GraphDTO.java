package com.calas.ExpenseTracker.dto;

import com.calas.ExpenseTracker.entity.Expense;
import com.calas.ExpenseTracker.entity.Income;
import lombok.Data;

import java.util.List;

@Data
public class GraphDTO {

    private List<Expense> expenseList;

    private List<Income> incomeList;

}
