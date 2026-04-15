package com.example;
public class App
{
public static void main(String[] args)
{
int x = 10 / 0; // Bug: division by zero
if (true) { // Code smell: always true condition
System.out.println("Hello");
}
String password = "12345"; // Security issue: hardcoded password
}
}
