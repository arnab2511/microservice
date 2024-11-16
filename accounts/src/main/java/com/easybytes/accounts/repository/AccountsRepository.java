package com.easybytes.accounts.repository;

import com.easybytes.accounts.entity.Accounts;
import com.easybytes.accounts.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;

public interface AccountsRepository extends JpaRepository<Accounts,Long> {
    Optional<Accounts> findByCustomerId(Long customerId);
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}