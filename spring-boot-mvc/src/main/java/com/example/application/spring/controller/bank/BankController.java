package com.example.application.spring.controller.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.application.spring.dto.MoneyTransferDto;
import com.example.application.spring.entity.BankAccount;
import com.example.application.spring.model.BankAccountInfo;
import com.example.application.spring.repository.bankAccount.BankAccountRepository;

@Controller
public class BankController {

	@Autowired
	private BankAccountRepository bankAccountRepository;

	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String showBankAccounts(Model model) {
		List<BankAccountInfo> list = bankAccountRepository.listBankAccountInfo();
		if(list.isEmpty()) {
			bankAccountRepository.addBankAccount(new BankAccount(1l,"Ganesh", 1000.0));
			bankAccountRepository.addBankAccount(new BankAccount(1l,"Rajesh", 100.0));
			bankAccountRepository.addBankAccount(new BankAccount(1l,"Shambhu", 50.0));
			bankAccountRepository.addBankAccount(new BankAccount(1l,"Shreepad", 10.0));
			list = bankAccountRepository.listBankAccountInfo();
		}
		
		model.addAttribute("accountInfos", list);

		return "/bank/accountsPage";
	}

	@RequestMapping(value = "/sendMoney", method = RequestMethod.GET)
	public String viewSendMoneyPage(Model model) {

		MoneyTransferDto form = new MoneyTransferDto(1L, 2L, 700d);

		model.addAttribute("MoneyTransferDto", form);

		return "/bank/sendMoneyPage";
	}

	@RequestMapping(value = "/sendMoney", method = RequestMethod.POST)
	public String processSendMoney(Model model, MoneyTransferDto moneyTransferDto) {

		System.out.println("Send Money: " + moneyTransferDto.getAmount());

		try {
			bankAccountRepository.sendMoney(moneyTransferDto.getFromAccountId(), //
					moneyTransferDto.getToAccountId(), //
					moneyTransferDto.getAmount());
		} catch (com.example.application.spring.exception.BankTransactionException e) {
			model.addAttribute("errorMessage", "Error: " + e.getMessage());
			return "/sendMoneyPage";
		}
		return "redirect:/";
	}

}