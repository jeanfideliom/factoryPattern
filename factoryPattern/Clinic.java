package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while(choice !=3){
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.print("\nChoose your pet number: ");
            choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    System.out.println("The dog's breed is " + ((Dog) pet).getBreed() + "\n");
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    System.out.println("The cat's number of lives is " + ((Cat) pet).getNoOfLives()+"\n");
                    break;
                case 3:
                    System.out.println("Thank you for using the program!");
                    System.exit(0);
                default:
                    System.out.println("Invalid input, please try again!\n");
                    break;
            }
        }

      /*  System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: "+ petFile.getPet().makeSound());
        System.out.println("Play mode: " + petFile.getPet().play()); */

    }
}
