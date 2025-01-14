// Write a java program to take input using the command line argument

package day1;

class Arguments {

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Command line arguments: ");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command line arguments found!");
        }
    }
}