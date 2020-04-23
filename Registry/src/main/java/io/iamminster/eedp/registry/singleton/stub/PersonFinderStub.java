package io.iamminster.eedp.registry.singleton.stub;

import io.iamminster.eedp.registry.singleton.Person;
import io.iamminster.eedp.registry.singleton.PersonFinder;

public class PersonFinderStub extends PersonFinder {

    public Person find(long id) {
        if (id == 1) {
            return new Person("Fowler", "Martin", 10);
        }
        throw new IllegalArgumentException("Can't find id: " + id);
    }
}
