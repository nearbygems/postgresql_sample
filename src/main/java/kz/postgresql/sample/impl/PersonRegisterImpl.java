package kz.postgresql.sample.impl;

import kz.postgresql.sample.dao.model.PersonDao;
import kz.postgresql.sample.model.Person;
import kz.postgresql.sample.register.PersonRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonRegisterImpl implements PersonRegister {

  // region Autowired fields
  @Autowired
  private PersonDao personDao;
  // endregion

  @Override
  public void savePerson(Person person) {
    personDao.save(person);
  }
}
