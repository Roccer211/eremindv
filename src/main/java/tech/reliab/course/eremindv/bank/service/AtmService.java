package tech.reliab.course.eremindv.bank.service;

import tech.reliab.course.eremindv.bank.entity.*;

import java.util.List;
import java.util.Optional;

public interface AtmService {
    BankAtm createBankAtm(String name,
                          String address, Bank bank, String location, Employee employee,
                          boolean cashWithdrawal, boolean cashDeposit, double maintenanceCost);

    Optional<BankAtm> getAtmById(int id);

    List<BankAtm> getAllAtms();

    List<BankAtm> getAllAtmsByBank(Bank bank);
}