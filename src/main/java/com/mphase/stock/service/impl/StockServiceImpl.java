package com.mphase.stock.service.impl;

import com.mphase.stock.model.Stock;
import com.mphase.stock.repository.StockRepository;
import com.mphase.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockRepository stockRepository;

    public StockServiceImpl() {
    }

    @Override
    public Stock findAllStocks() {
        System.out.println(stockRepository.findByOpenPrice(new Float(100.15)));
        return stockRepository.findByOpenPrice(new Float(100.15));
    }
}
