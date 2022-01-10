package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
    Repository repo = new Repository();
    Service service = new Service();
    service.sortByWorkers();
    service.topOrte();

    }
}
