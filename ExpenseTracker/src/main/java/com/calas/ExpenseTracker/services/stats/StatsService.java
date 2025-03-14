package com.calas.ExpenseTracker.services.stats;

import com.calas.ExpenseTracker.dto.GraphDTO;
import com.calas.ExpenseTracker.dto.StatsDTO;

public interface StatsService {
    GraphDTO getGraphData();
    StatsDTO getStats();
}
