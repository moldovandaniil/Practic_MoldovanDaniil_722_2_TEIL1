package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    public List<Kunde> readFromFile(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String[] results;
        String line = bufferedReader.readLine();
        List<Kunde> kundeList = new ArrayList<>();

        while(line!=null){
            results=line.split(",");
            kundeList.add(new Kunde(Integer.parseInt(results[0]), results[1], Unternehmensgrosse.valueOf(results[2]),
                    Integer.parseInt(results[3]), Integer.parseInt(results[4]),results[5]));
            line=bufferedReader.readLine();
        }

        return kundeList;

    }


    public void writeToFile(String fileName, List<Kunde> list) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for(Kunde kunde: list){
            String line = kunde.getId() + ","+kunde.getUnternehmensname()+","+kunde.getUnternehmensgrosse()+","+kunde.getAnzahlMitarbeiter()+","+kunde.getEinkommen()+","+kunde.getOrt();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

}
