/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Consumer.Consumer_Main;
import Producer.Producer_Main;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author akhfa
 */
public class Client {
    
    public static void main(String[] args) {
        String nick = "";
        
        Consumer_Main consumer = new Consumer_Main();
        Producer_Main producer = new Producer_Main();
        
        HashMap <String, Consumer_Main> listOfChannel = new HashMap<>();
        
        while (true) {
            
            Scanner in = new Scanner(System.in);

            System.out.print("Please enter your command: ");
            String command = in.nextLine();

            String[] com = command.split(" ", 2);
            try {
                switch (com[0]) {
                    case "/NICK":
                        if(!nick.equals(""))
                        {
                            System.out.println("You have registered with nickname: " + nick);
                        }
                        else
                        {
                            nick = com[1];
                            
                            System.out.println("Your nickname is " + nick);
                            
                        };
                        break;
                    case "/JOIN":
                        listOfChannel.put(com[1], new Consumer_Main(nick, com[1]));
                        listOfChannel.get(com[1]).start();
                        System.out.println("You have successfully join " + com[1]);
                        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
                        break;
                    case "/LEAVE": 
                        listOfChannel.get(com[1]).shutdown();
                        System.out.println("Leave " + com[1]);
                        break;
                    case "/EXIT":
                        System.out.println("bye bye...  :D");
                        System.exit(0);
                    default:
                        String message = nick + ' ' + command;
//                        channel.basicPublish(com[0].substring(1), "", null, message.getBytes("UTF-8"));
                        producer.send(com[0].substring(1), message);
                        break;
                }
            }
            catch (Exception e) {
                if (command.compareTo("/NICK") == 0) {
                    //random nick
                    String random;
                    
                    if(!nick.equals(""))
                    {
                        System.out.println("You have registered with nickname: " + nick);
                    }
                    else
                    {
                        random = randomNick();
                        
                        nick = random;
                        
                        System.out.println("Your nickname is " + nick);
                    }
                    
                }
                else if ((command.compareTo("/JOIN") == 0) || (command.compareTo("/LEAVE") == 0)) {
                    //error
                    System.out.println("Please enter channel name!");
                }
                else if (command.charAt(0) == '@') {
                    System.out.println("Please enter your command for the channel.");
                }
                else {
                    System.out.println("Invalid command.");
                }
            }
        }
    }
    
    public static String randomNick() {
        String nick = "";
        String[] pool = {"Zacky", "Raddy", "Will", "Ohm", "Ary", "Ardee", "Ilma", "Khidr", "Galang", "Theo", "Tereta", "Rossi", 
            "Ivina", "Nicy", "Kiito"};
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        int randomNick = randomGenerator.nextInt(15);

        nick = pool[randomNick].concat(Integer.toString(randomInt));
        return nick;
    }
}
