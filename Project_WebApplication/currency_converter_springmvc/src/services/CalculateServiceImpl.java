package services;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    @Override
    public double calculator(double rate, double usd) {
        return rate * usd;
    }
}
