package com.Anupam.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountBalance {


        ArrayList<AccountDetails> accountDetails = new ArrayList<AccountDetails>();
        List<AccountDetails> accounts = Arrays.asList(new AccountDetails("Mohan", true, "01/03/1995", 45678, 876, "pune"),
                new AccountDetails("Sohan", true, "01/03/1993", 45679, 890, "patna"),
                new AccountDetails("Rohan", true, "02/04/1997", 49678, 976, "purnia"),
                new AccountDetails("raja", true, "06/08/1999", 45698, 826, "Mumbai"),
                new AccountDetails("xyz", true, "06/08/1991", 45698, 917, "chennai"),
                new AccountDetails("abc", true, "06/08/1992", 48698, 1025, "gaya"),
                new AccountDetails("naman", true, "06/08/1993", 49698, 8888, "muzaffarpur"),
                new AccountDetails("tannu", true, "06/08/1994", 45098, 9999, "indore"),
                new AccountDetails("anshu", true, "06/08/1989", 40098, 1000, "delhi"));


}

