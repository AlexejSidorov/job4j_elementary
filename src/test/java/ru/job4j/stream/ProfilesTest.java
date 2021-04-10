package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProfilesTest {

    @Test
    public void ifProfileGetAddressSuccess() {
        List<Address> expectAddresses = new ArrayList<>();
        expectAddresses.add(new Address("1", "1", 1, 1));
        expectAddresses.add(new Address("4", "4", 4, 4));
        expectAddresses.add(new Address("3", "3", 3, 3));
        expectAddresses.add(new Address("4", "4", 4, 4));

        List<Profile> profileList = new ArrayList<>();
        for (Address address : expectAddresses) {
            profileList.add(new Profile(address));
        }
        Profiles profiles = new Profiles();
        List<Address> actualAddresses = profiles.collect(profileList);
        expectAddresses.remove(1);
        Assert.assertEquals(expectAddresses, actualAddresses);
    }
}