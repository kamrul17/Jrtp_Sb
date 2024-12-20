package com.domorecode;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.domorecode.entity.Account;
import com.domorecode.entity.AccountPK;
import com.domorecode.repository.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context	=SpringApplication.run(Application.class, args);
	AccountRepo accountRepo=context.getBean(AccountRepo.class);
	
	/*
	 * AccountPK accountPK=new AccountPK();
	 *  accountPK.setAccId(2);
	 * accountPK.setAccType("current");
	 *  accountPK.setAccNum(101l);
	 * 
	 * Account account=new Account(); 
	 * account.setHolderName("jon");
	 * account.setBranch("panchet");
	 *  account.setAccountPK(accountPK);
	 *  	
	accountRepo.save(account); */
	
	AccountPK accountPK=new AccountPK();
	   accountPK.setAccId(2);
	  accountPK.setAccType("current");
	 accountPK.setAccNum(101l);
	Optional<Account>accDetails=accountRepo.findById(accountPK);
	System.out.println(accDetails.get());
	
	
	
	
	
	}
	

}
