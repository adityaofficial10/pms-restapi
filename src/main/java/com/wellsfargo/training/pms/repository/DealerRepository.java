package com.wellsfargo.training.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.training.pms.model.Dealer;

public interface DealerRepository extends JpaRepository<Dealer, Long> {

}
