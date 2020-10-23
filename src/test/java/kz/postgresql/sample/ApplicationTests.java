package kz.postgresql.sample;

import kz.postgresql.sample.dao.model.PersonDao;
import kz.postgresql.sample.model.Person;
import kz.postgresql.sample.register.PersonRegister;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

  // region Autowired fields
  @Autowired
  private PersonRegister personRegister;

  @Autowired
  private PersonDao personDao;
  // endregion

  @Test
  void test() {

    var person = new Person();
    person.id = UUID.randomUUID().toString();
    person.name = "Bergen";

    //
    //
    personRegister.savePerson(person);
    //
    //

    var dbPerson = personDao.getPersonById(person.id);

    assertThat(dbPerson).isNotNull();
    assertThat(dbPerson.name).isEqualTo(person.name);

  }

}
