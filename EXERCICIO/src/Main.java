import entities.Retangle;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retangle retangle = new Retangle();
        System.out.println("Enter rectangle widht and height: ");
        System.out.print("Height: ");
        retangle.height = Double.parseDouble(sc.nextLine());
        System.out.print("Widht: ");
        retangle.width = Double.parseDouble(sc.nextLine());

        System.out.println();
        System.out.println("Area: " + retangle.Area());

        System.out.println();
        System.out.println("Perimetro: " + retangle.Perimeter());

        System.out.println();
        System.out.println("Diagonal: " + retangle.Diagonal());



        }
    }
