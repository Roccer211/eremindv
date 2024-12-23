package tech.reliab.course.eremindv.bank.service;

import tech.reliab.course.eremindv.bank.entity.User;

public interface UserService extends CrudOperations<User> {
    int calculateCreditRating();
}