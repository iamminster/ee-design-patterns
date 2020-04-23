package io.iamminster.eedp.registry.singleton;

import io.iamminster.eedp.registry.singleton.stub.RegistryStub;

public class Registry {
    private static Registry soleInstance = new Registry();
    protected PersonFinder personFinder = new PersonFinder();

    private static Registry getInstance() {
        return soleInstance;
    }

    public static PersonFinder personFinder() {
        return getInstance().personFinder;
    }

    public static void initialize() {
        soleInstance = new Registry();
    }

    public static void intializeStub() {
        soleInstance = new RegistryStub();
    }
}
