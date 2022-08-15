package com.example.demo.Repository;

import com.example.demo.model.TblChargingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface TblChargingRepo extends JpaRepository<TblChargingEntity, BigInteger> {
}
