package CaseStudy.utils;



import CaseStudy.models.Customer;
import CaseStudy.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWirteCSV {
    private static void writeListStringToCSV(List<String> stringList, String path, boolean append){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line: stringList){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi  ghi file");
        }
    }
    public static void writeListEmpCSV(List<Employee> list, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Employee eList : list){
            stringList.add(eList.getToString());
        }
        writeListStringToCSV(stringList,path,append);
    }
    public static void writeListCusCSV(List<Customer> list, String path, boolean append){
        List<String> stringList = new ArrayList<>();
        for (Customer cusList : list){
            stringList.add(cusList.getToString());
        }
        writeListStringToCSV(stringList,path,append);
    }
    private static List<String> readCSV(String path){
        File file = new File(path);
        List<String> listString = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                listString.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi đọc  file");
        }
        return listString;
    }
    public static List<Customer> getListCusFromCSV(String path){
        List<Customer> customers =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Customer customer = new Customer(array[1],array[2],array[3],(array[4]),
                    (array[5]),array[6],array[0],array[7],array[8]);
            customers.add(customer);
        }
        return customers;
    }
    public static List<Employee> getListEmpFromCSV(String path){
        List<Employee> employees =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Employee employee = new Employee(array[1],array[2],array[3],(array[4]),
                    (array[5]),array[6],array[7],array[0],(array[8]),(array[9]));
            employees.add(employee);
        }
        return employees;
    }

    // ĐỌC NGHI FILE 1O ĐỐ TƯƠNG
    // CUSTOEMR
}
