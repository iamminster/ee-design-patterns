package io.iamminster.eedp.registry.threadsafe;


import io.iamminster.eedp.registry.singleton.Person;
import io.iamminster.eedp.registry.singleton.PersonFinder;
import org.junit.Assert;

public class ThreadLocalRegistry {
    private static ThreadLocal instances = new ThreadLocal();
    private PersonFinder personFinder = new PersonFinder();

    public static ThreadLocalRegistry getInstance() {
        return (ThreadLocalRegistry) instances.get();
    }

    public static void begin() {
        Assert.assertTrue(instances.get() == null);
        instances.set(new ThreadLocalRegistry());
    }

    public static void end() {
        Assert.assertNotNull(getInstance());
        instances.set(null);
    }

    public static PersonFinder personFinder() {
        return getInstance().personFinder;
    }
}
