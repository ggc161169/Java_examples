package com.company_ggc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Patient patient = new Patient("Guillermo", 50,
                new Eye("Left eye", "Short sighted", "brown", true),
                new Eye("Right eye", "Normal", "brown", true),
                new Heart("Heart", "Normal", 75),
                new Stomach("Stomach", "gastritis", true),
                new Skin("Skin", "Normal", "brown flesh", 50));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = false;

        while (!shouldFinish) {
            System.out.println("\nChoose an Organ:" +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Quit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    patient.getLeftEye().getDetail();
                    if (patient.getLeftEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().close(); // call the method close
                        }  // send to back to list of organs

                    } else {
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().open(); // call the method close
                        }
                    }
                }
                case 2 -> {
                    patient.getRightEye().getDetail();
                    if (patient.getRightEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().close(); // call the method close
                        }  // send to back to list of organs

                    } else {
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().open(); // call the method close
                        }
                    }
                }
                case 3 -> {
                    patient.getHeart().getDetail();
                    System.out.println("\t\t1. Change the heart rate");
                    if (scanner.nextInt() == 1) {
                        System.out.println("Enter the heart rate: ");
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate); // set new value
                        System.out.println("Heart rate changed to: " + patient.getHeart().getRate());
                    }
                }
                case 4 -> {
                    patient.getStomach().getDetail();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt() == 1) {
                        patient.getStomach().digest();
                    }
                }
                case 5 -> patient.getSkin().getDetail();
                default -> shouldFinish = true;
            }
        }
    }
}
