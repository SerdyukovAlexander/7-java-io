package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task02Main
{
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        int previous = inputStream.read();
        int current = inputStream.read();

        while (previous != -1){

            if (current == 10 && previous == 13){
                previous = current;
                current = inputStream.read();
            }

            outputStream.write(previous);

            previous = current;
            current = inputStream.read();
        }
        outputStream.flush();
    }
}
