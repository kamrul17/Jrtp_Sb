package com.domorecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domorecode.entity.Account;
import com.domorecode.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account, AccountPK> {

}
