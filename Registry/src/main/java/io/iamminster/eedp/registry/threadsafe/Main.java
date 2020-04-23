package io.iamminster.eedp.registry.threadsafe;

import io.iamminster.eedp.registry.singleton.Person;
import io.iamminster.eedp.registry.singleton.PersonFinder;
import org.junit.Assert;

public class Main {

    public static void main(String[] args) {
        try {
            ThreadLocalRegistry.begin();
            PersonFinder f1 = ThreadLocalRegistry.personFinder();
            Person martin = f1.find(1);
            Assert.assertEquals("Fowler", martin.getLastName());
        } finally {
            ThreadLocalRegistry.end();
        }
    }
}
