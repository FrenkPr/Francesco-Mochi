package com.example;

public class Main2
{
    public static void main(String[] args)
    {
        String p = "";
        // System.out.print("Insert the password: ");
        p = PasswordField.readPassword("Insert the password: ");
        System.out.println("Your password: " + p);
    }
}
