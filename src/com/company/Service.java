package com.company;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

    public void sortByWorkers() throws IOException {
        Repository repo = new Repository();
        List<Kunde> initialList = repo.readFromFile("C:\\Users\\user\\IdeaProjects\\Practic_MoldovanDaniil_722_2\\src\\com\\company\\kundendaten.txt");
        List<Kunde> finalList = initialList.stream().sorted(Comparator.comparingInt(Kunde::getAnzahlMitarbeiter).reversed()).collect(Collectors.toList());
        repo.writeToFile("C:\\Users\\user\\IdeaProjects\\Practic_MoldovanDaniil_722_2\\src\\com\\company\\kundensortiert.txt", finalList);
    }

    public void topOrte() throws IOException{
        Repository repo = new Repository();
        List<Kunde> initialList = repo.readFromFile("C:\\Users\\user\\IdeaProjects\\Practic_MoldovanDaniil_722_2\\src\\com\\company\\kundendaten.txt");
        List<Kunde> finalList = initialList.stream().sorted(Comparator.comparingInt(Kunde::getEinkommen).reversed()).collect(Collectors.toList());
        repo.writeToFile("C:\\Users\\user\\IdeaProjects\\Practic_MoldovanDaniil_722_2\\src\\com\\company\\statistik.txt", finalList);


    }

}
