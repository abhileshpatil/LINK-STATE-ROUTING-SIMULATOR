package com.f;
import java.io.BufferedReader;
import java.io.FileReader;
 
/**
 * Creates a 2D matrix 
 */
public class Inputt {
    private static BufferedReader in = null;
    private static int rows = 0;
    private static int columns = 0;
    private static int [][] matrix = null;
    public static void main(String []args) throws Exception {
        try {
            String matrix = args[0];
            int lineNum = 0;
            int row=0;
            in = new BufferedReader(new FileReader(matrix));
            String line = null;
            while((line=in.readLine()) !=null) {
                lineNum++;
                if(lineNum==1) {
                    rows = Integer.parseInt(line);
                } else if(lineNum==2) {
                    columns = Integer.parseInt(line);
                    matrix = new int[rows][columns];
                } else {
                    String [] tokens = line.split(",");
                    for (int j=0; j<tokens.length; j++) {
                        matrix[row][j] = Integer.parseInt(tokens[j]);
                    }
                    row++;
                }
            }
        } catch (Exception ex) {
            System.out.println("The code throws an exception");
            System.out.println(ex.getMessage());
        } finally {
            if (in!=null) in.close();
        }
    }
}