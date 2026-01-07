package assignone;

import java.util.Scanner;

public class Main {

    // Basic 1 Implementation of Scanner
    static void displayDetails() {
        Scanner scanner = new Scanner(System.in);

        // Part 1: name and greeting
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
    //-------------------Basic 1 over-----------------------


    //Basic 2 Implementation Sum of Natural Numbers
    static void naturalNum(){
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for( int i = 1 ; i <= n ; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    //-------------------Basic 2 over-----------------------


    //Basic 3 Implementation of arrays
    static void array() {
        int[] numbers = new int[5];
        int[] num = {1, 2, 3, 4};
        System.out.println("Array length num = " + num.length);
    }
    //-------------------Basic 3 over-----------------------





    // Problem 1 of the Assignment on 6th Jan 2026
    static void bankChecks(Integer age, Integer salary, Integer creditScore, String employeeType) {
        String eligibility = "Not Eligible";

        if (age >= 21 && age <= 60) {
            if (salary >= 30000) {
                if (employeeType.equals("Selfemployed")) {
                    if (creditScore >= 650) {
                        eligibility = "Eligible";
                    }
                } else if (employeeType.equals("Salaried")) {
                    if (creditScore >= 700) {
                        eligibility = "Eligible";
                    }
                }
            }
        }
        System.out.println("Eligibility: " + eligibility);
    }
    //-------------------Problem 1 over-----------------------



    // Problem 2 of the Assignment on 6th Jan 2026
    static void calTax(Double income, String gender){
        double amount = 0.0;

        if(income <= 250000.0){
            amount = 0 ;
        }
        if(income > 250000.0 &&  income <= 500000.0){
            amount = amount + income * 0.05 ;
        }
        if(income > 500000.0 &&  income <= 1000000.0){
            amount = amount + income * 0.20 ;
        }
        if(income > 1000000){
            amount = amount + income * 0.03 ;
        }
        if(gender.equals("F") && amount >= 10000 ){
            amount = amount - 10000;
        }
        System.out.println(amount);
    }
    //-------------------Problem 2 over-----------------------


    //Problem 3 Password Strength Validator
    static void passStrength(String password){

        if(password.length() >= 8 ){
            if (password.chars().anyMatch(Character::isUpperCase)){
                if (password.chars().anyMatch(Character::isDigit)){
                    if (password.matches(".*[^a-zA-Z0-9 ].*")){
                        System.out.println("Strong Password");
                        return;
                    }
                }
            }
        }
        System.out.println("Weak Password");
    }
    //-------------------Problem 3 over-----------------------


    //Problem 4 University Administration System
    static void admissionSys(Integer marks , Integer entranceScore , String category){
        if(category.equals("General") && entranceScore >= 80 && marks >= 70){
            System.out.println("Admission Successful");
        }
        else if(category.equals("OBC") && entranceScore >= 75 && marks >= 65){
            System.out.println("Admission Successful");
        }
        else if(category.equals("SC/ST") && entranceScore >= 70 && marks >= 60){
            System.out.println("Admission Successful");
        }
        else {
            System.out.println("Admission Unsuccessful");
        }
    }
    //-------------------Problem 4 over-----------------------


    //Problem 5 Smart Electricity Billing System
    //Calulate bill using slabs + peak hour subcharge
    static void electricBill(Integer units , Boolean peakHour ){
        double bill = 0.0 ;

        if(units <= 100 ){
            bill = units*2;
        }
        if(units > 100 && units <= 200 ){
            bill = 200 + (units - 100) * 4;
        }
        if(units > 200 ){
            bill = 200 + 400 + (units - 200) * 6;
        }
        if(peakHour){
            bill = bill + (bill * 0.10);
        }
        System.out.println(bill);
    }
    //-------------------Problem 5 over-----------------------




    //Problem 6 Atm Withdrawal with Multi Condition validation
    static void atmValidate(Double balance , Double withdrawAmount , Double dailyWithdrawn ){

        if(withdrawAmount % 100 == 0 ){
            if(balance-withdrawAmount >= 2000){
                if(dailyWithdrawn + withdrawAmount <= 40000){
                    balance -= withdrawAmount;
                    System.out.println("Transaction Successful");
                    return;
                }
                else{
                    System.out.println("Transaction Unsuccessful -  Daily 40000 withdrawal limit Exceeded");
                    return;
                }
            }
            else{
                System.out.println("Transaction Unsuccessful - After Withdrawal balance depleting less than 2000");
                return;
            }
        }
        else{
            System.out.println("Transaction Unsuccessful - Amount not a multiple of 100 ");
            return;
        }
    }
    //-------------------Problem 6 over-----------------------


    //Problem 7 Employee Bonus Calculation
    // Bonus Depends on Experience and Calculation
    static void calBonus(Integer experience , Integer rating , Double salary){
        double bonus= 0;
        if (rating >= 4){
            if(experience >= 10 ){
                bonus = salary*0.2;
            }
            if(experience >= 5 && experience <= 9  ){
                bonus = salary*0.15;
            }
            if(experience < 5 ){
                bonus = salary*0.1;
            }
        }
        else{
            if(experience >= 10 ){
                bonus = salary*0.1;
            }
            if(experience >= 5 && experience <= 9  ){
                bonus = salary*0.07;
            }
            if(experience < 5 ){
                bonus = salary*0.05;
            }
        }
        System.out.println(bonus);
    }
    //-------------------Problem 7 over-----------------------


    //Problem 8 Insuarance Policy Eligibility
    static void insuranceEligibility(Integer age , Boolean illness , Boolean smoke){
        if(age >= 18 && age <= 60 ){
            if(illness){
                System.out.println("Not Eligible ");
            }
            else if (smoke){
                System.out.println("Eligible But Premium Incleases by 20%");
            }
            else{
                System.out.println(" Eligible ");
            }
        }
    }
    //-------------------Problem 8 over-----------------------




    //Problem 9
    static void resultAnalyzer(Integer secA , Integer secB , Integer secC){
        if(secA >= 40 && secB >= 40 && secC >= 40 ){
            System.out.println("Pass");
        }
        else if(secA+secB+secC >= 120){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
    //-------------------Problem 9 over-----------------------




    // Problem 10 Cab Price Calculator
    static void cabPrice(Integer distance , String cabType , Boolean isNight){
        double cabPrice = 0;
        if(cabType.equals("Mini")){
            cabPrice = distance * 10;
        }
        if(cabType.equals("Sedan")){
            cabPrice = distance * 15;
        }
        if(cabType.equals("SUV")){
            cabPrice = distance * 20;
        }
        if(isNight){
            cabPrice = cabPrice + cabPrice*0.25;
        }
        System.out.println(cabPrice);
    }
    //-------------------Problem 10 over-----------------------












    // Main for the first Assignment 6th Jan 2026
    public static void main(String[] args) {

        //basic 1
        displayDetails();

        //basic 2
        naturalNum();

        //basic 3
        array();




        //--------- Problem 1 of the Assignment on 6th Jan 2026----------------
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("\n Enter age \n, salary \n, creditScore \n EmployeeType Salaried/SelfEmployed)");
        Integer age = scanner.nextInt();
        Integer salary = scanner.nextInt();
        Integer creditScore = scanner.nextInt();
        String employeeType = scanner.next();

        bankChecks(age, salary, creditScore, employeeType);
        //-------------------Problem 1 over ------------------------



        //--------------Problem 2 Tax Calculator------------------
        System.out.print("\n Enter income \n, gender \n,)");
        double income = scanner.nextInt();
        String gender = scanner.next();

        calTax(income, gender);
        //-------------------Problem 2 over-----------------------


        //--------------Problem 3 Password Strength Validator ------------------
        System.out.print("\n Enter password \n)");
        String passsword = scanner.next();
        passStrength(passsword);
        //-------------------Problem 3 over--------------------


        //---------Problem 4 University Administration System-----------------
        System.out.print("\n Enter Marks \n, EntranceScore \n, Category \n)");
        int marks = scanner.nextInt();
        int entranceScore = scanner.nextInt();
        String category = scanner.next();
        admissionSys(marks,entranceScore,category);
        //-------------------Problem 4 over-----------------------


        //---------Problem 5 Smart Electricity Billing System-----------------
        System.out.print("\n Enter units \n, peakhour \n)");
        int units = scanner.nextInt();
        boolean peakhour = scanner.nextBoolean();
        electricBill(units,peakhour);
        //-------------------Problem 5 over-----------------------




        //---------Problem 6 Atm Withdrawal with Multi Condition validation-----------------
        System.out.print("\n Enter balance \n, withdrawAmount \n, dailyWithdrawn \n)");
        double balance = scanner.nextInt();
        double withdrawamount = scanner.nextInt();
        double dailyWithdrawn = scanner.nextInt();
        atmValidate(balance,withdrawamount,dailyWithdrawn);
        //-------------------Problem 6 over-----------------------




        //---------Problem 7 Employee Bonus Calculation-----------------
        System.out.print("\n Enter experience \n, rating \n, salary \n)");
        int experience = scanner.nextInt();
        int rating = scanner.nextInt();
        double sal = scanner.nextDouble();
        calBonus(experience,rating,sal);
        //-------------------Problem 7 over-----------------------




        //---------Problem 8 Insurance Policy Eligibility-----------------
        System.out.print("\n Enter age \n, illness(true/false) \n, smoke(true/false) \n)");
        int ageInp = scanner.nextInt();
        boolean illnessInp = scanner.nextBoolean();
        boolean smokeInp = scanner.nextBoolean();
        insuranceEligibility(ageInp,illnessInp,smokeInp);
        //-------------------Problem 8 over-----------------------




        //---------Problem 9 Result Analyzer-----------------
        System.out.print("\n Enter secA \n, secB \n, secC \n)");
        int secA = scanner.nextInt();
        int secB = scanner.nextInt();
        int secC = scanner.nextInt();
        resultAnalyzer(secA,secB,secC);
        //-------------------Problem 9 over-----------------------




        //---------Problem 10 Cab Price Calculator-----------------
        System.out.print("\n Enter distance \n, cabType(Mini/Sedan/SUV) \n, isNight(true/false) \n)");
        int distance = scanner.nextInt();
        String cabType = scanner.next();
        boolean isNight = scanner.nextBoolean();
        cabPrice(distance,cabType,isNight);
        //-------------------Problem 10 over-----------------------






    }
}
