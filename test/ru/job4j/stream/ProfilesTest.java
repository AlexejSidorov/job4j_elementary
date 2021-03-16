package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void ifProfileGetAddressSuccess() {
        List<Address> expectAddresses = Arrays.asList(
                new Address("1", "1", 1, 1),
                new Address("2", "2", 2, 2),
                new Address("3", "3", 3, 3),
                new Address("4", "4", 4, 4)
        );
        List<Profile> profileList = new ArrayList<>();
        for (Address address : expectAddresses) {
            profileList.add(new Profile(address));
        }
        Profiles profiles = new Profiles();
        List<Address> actualAddresses = profiles.collect(profileList);
        Assert.assertEquals(expectAddresses, actualAddresses);
    }

    @Test
    public void ifProfileGetAddressFail() {
        List<Address> expectAddresses = new ArrayList<>();
        expectAddresses.add(new Address("1", "1", 1, 1));
        expectAddresses.add(new Address("2", "2", 2, 2));
        expectAddresses.add(new Address("3", "3", 3, 3));
        expectAddresses.add(new Address("4", "4", 4, 4));

        List<Profile> profileList = expectAddresses.stream()
                .map(Profile::new).collect(Collectors.toList());
        Profiles profiles = new Profiles();
        expectAddresses.remove(0);
        expectAddresses.add(new Address("5", "5", 5, 5));
        List<Address> actualAddresses = profiles.collect(profileList);
        Assert.assertNotEquals(expectAddresses, actualAddresses);
    }
}