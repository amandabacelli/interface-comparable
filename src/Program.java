import entities.Elf;
import entities.Number;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Elf> elfList = new ArrayList<>();
        String path = "resource/elves.textile";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String elfFile = bufferedReader.readLine();

            while(elfFile != null){
                String[] fields = elfFile.split(",");
                elfList.add(new Elf(fields[0], Integer.parseInt(fields[1])));
                elfFile = bufferedReader.readLine();
            }
            Collections.sort(elfList);
            for(Elf s : elfList) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nOrdenando numeros de ordem decrescente\n");

        List<Number> numberList = new ArrayList<>();
        String pathNumber = "resource/numbers.textile";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(pathNumber))) {
            String numberFile = bufferedReader.readLine();

            while(numberFile != null){
                numberList.add(new Number(Integer.parseInt(numberFile)));
                numberFile = bufferedReader.readLine();
            }
            Collections.sort(numberList);
            for(Number s : numberList) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } ;


    }


}
