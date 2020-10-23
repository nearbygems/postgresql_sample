package kz.postgresql.sample.register;

import kz.postgresql.sample.model.Person;

public interface PersonRegister {

  void savePerson(Person person);
}
