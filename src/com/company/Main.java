package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
    // OPGAVE 1:
    // a)

        int[] nums = new int[10];
        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};

        /*
        int j = 0;
        Scanner scanner = new Scanner(System.in);
        while(j < 10) {
            nums[j] = scanner.nextInt();
            j++;
        }*/

        //System.out.println(Arrays.toString(nums));
        //System.out.println(average(nums2));
        //printArray(nums);
        //writeToFile("c:\\temp\\test2.txt", nums2);
        //readFromFile();
        //printArray(readFromFile());
        //System.out.println(average(readFromFile()));
        //printArray(multiply10(readFromFile()));
        //writeToFile("c:\\temp\\MinFil1.txt",multiply10(readFromFile()));
        //writeToDatFile("c:\\temp\\MinDatFil.dat", nums2);
        //readFromDatFile("c:\\temp\\MinDatFil.dat");
        //createPersonalDataFile("c:\\temp\\Persondata.txt");
        //test("c:\\temp\\Persondata.txt");
        readDiffDataTypesFromTxtFile();
    }
    // b)
    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    // c)
    public static double average(int[] nums) {
        double sum = 0.0;
        double gennemsnit = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        gennemsnit = sum / nums.length;
        return gennemsnit;
    }

    // OPGAVE 2:
    // a) txt-fil m 10 ints:
    public static void writeToFile(String filePath, int[] nums) throws IOException {

        PrintWriter writer = new PrintWriter(filePath, "UTF-8");
        //writer.format("");
        for (int i = 0; i < 10; i++) {
            writer.println(nums[i]);
        }
        //PrintWriter pw = new PrintWriter(new FileOutputStream(new File("persons.txt"),true));
        writer.close();
    }

    public static int[] readFromFile() throws FileNotFoundException {
        // Find metode til at finde antal linjer:
        int[] linesFromFile = new int[10];
        File f = new File("c:\\temp\\test.txt");
        Scanner scanner = new Scanner(f); // brug stien/file-objektet i stedet for System.in
        int i = 0;
        while (scanner.hasNextInt()) {
            linesFromFile[i] = Integer.valueOf(scanner.nextLine());
            i++;
        }
        return linesFromFile;
    }

    public static int[] multiply10(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * 10;
        }
        return result;
    }

    // OPGAVE 3:
    // .dat file type?
    public static void writeToDatFile(String filePath, int[] nums) throws IOException {
        DataOutputStream output = new DataOutputStream(new FileOutputStream("C://temp//MinDatFil.dat"));
        for (int i = 0; i < 10; i++) {
            output.writeInt(i);
            System.out.println(i);
        }
        output.close();
    }

    public static int[] readFromDatFile(String filePath) throws IOException {
        // Find metode til at finde antal linjer:
        int[] linesFromFile = new int[10];
        DataInputStream input = new DataInputStream(new FileInputStream("C://temp//MinDatFil.dat"));
        for (int i = 0; i < 10; i++) {
            linesFromFile[i] = input.readInt();
            System.out.println(linesFromFile[i]);
        }
        input.close();
        return linesFromFile;
    }

    // OPGAVE 4:
    // a)
    public static void createPersonalDataFile(String filePath) throws IOException {
        PrintWriter writer = new PrintWriter(filePath, "UTF-8");
        //writer.format("");
        writer.println("Pernille 12.50");
        writer.println("Peter 22.75");
        writer.println("Christian 30.10");
        writer.close();
    }
    // b)
    //      Lav et program hvor der oprettes et array af typen String,
    //      et array af integers og et array af typen float.
    //      Indlæs dataene fra filen “persondata.txt” i de 3 arrays med input fra textfil med Scanner.

    public static void readDiffDataTypesFromTxtFile() throws FileNotFoundException {
        int[] i = new int[3];
        Double[] d = new Double[3];
        String[] s = new String[3];

        File f = new File("C:\\temp\\Persondata.txt");
        Scanner scanner = new Scanner(f);
        scanner.useLocale(Locale.US);

        for (int j = 0; j < 3; j++) {
            s[j] = scanner.next();
            d[j] = scanner.nextDouble();
            System.out.println(s[j]);
            System.out.println(d[j]);
        }


    }



    public static void test(String filePath) throws IOException {
        PrintWriter writer = new PrintWriter(filePath, "UTF-8");
        //writer.format("");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int i = 0;
        double d = 0.00;
        String s = "";

            i = scanner.nextInt();
            d = scanner.nextDouble();
            scanner.nextLine();
            s = scanner.nextLine();

        System.out.println(i);
        System.out.println(d);
        System.out.println(s);

        //writer.format("");
        writer.println(i);
        writer.println(d);
        writer.println(s);
        writer.close();

    }
}
