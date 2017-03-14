/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author root
 */
public class Test02 {
    
    public static void main(String args[]) {
        String portName = "/dev/ttyS80";
        SerialPort sp = null;
        
        try {
            CommPortIdentifier port = 
                    CommPortIdentifier.getPortIdentifier(portName);
            if(port!= null) {
                CommPort cp = port.open("Myport", 10000);
                if(cp instanceof SerialPort) {
                    sp = (SerialPort) cp;
                    sp.setSerialPortParams(9600, SerialPort.DATABITS_8, 
                            SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
                    BufferedReader reader = new BufferedReader(
                        new InputStreamReader(
                            sp.getInputStream()
                        )
                    );
                    while(true) {
                        String line = "";
                        while((reader.ready()) && 
                                (line = reader.readLine()) != null) {
                            System.out.println("Data dari arduino " + line);
                        }
                    }
                } else {
                    System.out.println("tidak dapat mengakses serial port");
                }
            } else {
                System.out.println("tidak dapat menemukan serial port");
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(sp != null) {
                sp.close();
            }
        }
    }
    
}

