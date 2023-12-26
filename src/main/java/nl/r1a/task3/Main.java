package nl.r1a.task3;

public class Main {
    public static void main(String[] args) {
        FacadeExtractCompany facadeExtractCompany = new FacadeExtractCompany();
        try {
            String company = facadeExtractCompany.extractCompany("ucu.edu.ua");
            System.out.println(company);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
