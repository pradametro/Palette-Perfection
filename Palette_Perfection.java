import javax.swing.JOptionPane;
public class Palette_Perfection {
    public static void main(String[] args) { //This is the my main and I will call out all the different methods here. 
        String name = greeting();
        int choice = displayMenu(name);//i put name in parameters so i can parse it into 
        double surfaceArea = 0;
        if (choice == 0) { // these are my if and else statements that i call out here that are located in the "displayMenu" to determine if the room is regular or irregular.
            surfaceArea = calculateAreaRegular(name); //0 is regular and 1 is irregular. This we used int for these values. 
        } else if (choice == 1) {
            surfaceArea = calculateAreaIrregular(name);
        } else {
            System.exit(1); //System exit
        }

        double pricePerGallon = 53.35;  //these are the prices from the previous assignment.
        double squareFeetPerGallon = 350.0; 
        priceReport(surfaceArea, squareFeetPerGallon, pricePerGallon); //calling out the last two methods

        thankYou(name);
    }

    public static String greeting() { //here is the method where i write the code to input name and output a welcome message.
        String name = JOptionPane.showInputDialog("Please Enter your name");
        String welcomeMsg = "Hello " + name + "! \nWelcome to Pallette Perfection.";
        JOptionPane.showMessageDialog(null, welcomeMsg);
        return name;
    }

    public static int displayMenu(String name) { //this is the method i write to display the irregular and reuglar room options
        String userInput = JOptionPane.showInputDialog(null,
                name + ", Please choose the shape of your room:\n"
                        + "R. Regular\nI. Irregular");
        char choice = Character.toUpperCase(userInput.charAt(0));
        switch (choice) {
            case 'R':
                return 0;
            case 'I':
                return 1;
            default:
                JOptionPane.showMessageDialog(null, name + ", This is not a valid choice! Please try again.");
                System.exit(1);
                return -1; // This is just to satisfy the return type, program will exit before reaching here
        }
    }

    public static double calculateAreaRegular(String name) { //now i will use this method to input the data for regular rooms. I use the (String name) parameters to be able to parse name. and under each input dialog, i put if statements to display message if <=0
        double length = Double.parseDouble(JOptionPane.showInputDialog("Please " + name + ", enter the length of the room in ft:"));
         if (length <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid Input: Dimensions must be positive values.");//must be positive numbers.
            System.exit(1);
        }
        double width = Double.parseDouble(JOptionPane.showInputDialog("Please " + name + ", enter the width of the room in ft:"));
         if (width <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid Input: Dimensions must be positive values.");
            System.exit(1);
        }
        double height = Double.parseDouble(JOptionPane.showInputDialog("Please " + name + ", enter the height of the room in ft:"));
         if (height <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid Input: Dimensions must be positive values.");
            System.exit(1);
        }
        
        double surfaceArea = 2 * (width * height) + 2 * (length * height); //calculations from inputed data will be performed here
        return surfaceArea;
    }

    public static double calculateAreaIrregular(String name) { //basically the same thing but for irreglar rooms. However instad of legnth and weidth, i out dim 1 for dimension. 
    //however im not sure how to make the if statements shorter.
        double dim1 = Double.parseDouble(JOptionPane.showInputDialog("Please " + name + " enter the length for the first dimension of the room in ft:"));
         if (dim1 <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid Input: Dimensions must be positive values.");
            System.exit(1);
        }
        double dim2 = Double.parseDouble(JOptionPane.showInputDialog("Please " + name + " enter the length for the second dimension of the room in ft:"));
         if (dim2 <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid Input: Dimensions must be positive values.");
            System.exit(1);
        }
        double dim3 = Double.parseDouble(JOptionPane.showInputDialog("Please " + name + " enter the length for the third dimension of the room in ft:"));
         if (dim3 <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid Input: Dimensions must be positive values.");
            System.exit(1);
        }
        double dim4 = Double.parseDouble(JOptionPane.showInputDialog("Please " + name + " enter the length for the fourth dimension of the room in ft:"));
         if (dim4 <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid Input: Dimensions must be positive values.");
            System.exit(1);
        }
        double height = Double.parseDouble(JOptionPane.showInputDialog("Please " + name + " enter the height of the room:"));


        double surfaceArea = dim1 * height + dim2 * height + dim3 * height + dim4 * height; // ireggular room calculations.
        return surfaceArea;
    }

    public static void priceReport(double surfaceArea, double squareFeetPerGallon, double pricePerGallon) { //here i put all the data i need in the method's parameters so i can calculate and form a price report.
        double gallonsNeeded = Math.ceil(surfaceArea / squareFeetPerGallon);
        double totalPrice = gallonsNeeded * pricePerGallon;

        JOptionPane.showMessageDialog(null,
                 String.format("Surface area of the room: %.2f square feet\nNumber of gallons required: %.2f\nTotal price: $%.2f", surfaceArea, gallonsNeeded, totalPrice)); //here i used string.format to use %.2f and output the message.
    }

    public static void thankYou(String name) {
        JOptionPane.showMessageDialog(null, "Thank you " + name + ", for shopping at Palette Perfection!"); //thank you output message and end of program.
    }
}