package tech.reliab.course.eremindv.bank.service;

import tech.reliab.course.eremindv.bank.entity.Bank;

public interface BankService extends CrudOperations<Bank> {
    void addOffice();

    void addAtm();

    void removeAtm();
}