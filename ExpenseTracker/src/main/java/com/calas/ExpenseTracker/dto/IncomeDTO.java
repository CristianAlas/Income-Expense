package com.calas.ExpenseTracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
public class IncomeDTO {

    private Long id;

    private String title;

    private Integer amount;

    private LocalDate date;

    private String category;

    private String description;

}
