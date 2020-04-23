package io.iamminster.eedp.registry.singleton.stub;

import io.iamminster.eedp.registry.singleton.Registry;
import io.iamminster.eedp.registry.singleton.stub.PersonFinderStub;

public class RegistryStub extends Registry {
    public RegistryStub() {
        personFinder = new PersonFinderStub();
    }
}
