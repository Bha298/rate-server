package com.java.rateservece.rep;

import com.java.rateservece.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RateRep extends JpaRepository<Rate, Integer> {
    static Optional<Rate> findByType(String type) {
        return null;
    }
}
