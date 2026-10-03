/*
 * Name: Perla Garcia Cavazos
 * Date: October 3, 2026
 * Assignment: Module 10 Programming Assignment
 */

public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}