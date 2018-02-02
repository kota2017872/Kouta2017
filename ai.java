import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.PrintWriter;
 import java.net.Socket;
 import java.util.Scanner;
 
 public class ai {
     public static void main(String args[]){
         try{
             Socket sock = new Socket("127.16.21.43", 6000);
             PrintWriter output = new PrintWriter(sock.getOutputStream());
             BufferedReader consoleIn = new BufferedReader( new InputStreamReader(System.in) );      // add
             String consoleInStr = consoleIn.readLine();         
             output.println(consoleInStr);   
             output.flush();
             Scanner input = new Scanner(sock.getInputStream());
             System.out.println(input.nextLine());
             input.close();
             output.close();
             sock.close();
         } catch(Exception e){
             System.err.println("クライアントエラー");
             System.exit(1);
         }
     }
 }