package tech.reliab.course.eremindv.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.reliab.course.eremindv.bank.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank,Long> {
}