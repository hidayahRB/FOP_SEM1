public static void main(String[] args) {
        // Display Square shape
        // Printing the first row
        System.out.println("Square");
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }System.out.println();
        
        // printing 2-9 row
        for (int r = 0; r < 8; r++) {
            for (int i = 0; i < 10; i++) {
                if (i == 0 || i == 9) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        
        //printing the last row, same as the first row
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }System.out.println("\n");
        
        System.out.println("Oval");
        //printing the first row (curve)
        for (int i = 0; i < 9; i++) {
            if (i==3) {
                System.out.print("***");
            }System.out.print(" ");
        }System.out.println();
        
        //printing second row of oval
        for (int i = 0; i < 9; i++) {
            if (i==1 || i==6) {
                System.out.print("*");
            }System.out.print(" ");
        }System.out.println();
        //printing from row 3-7
        for (int r = 0; r < 5; r++) {
            for (int i = 0; i < 10; i++) {
                if (i==0 || i == 7) {
                    System.out.print("*");
                }System.out.print(" ");
            }System.out.println();
        }
        //printing row 8 (same as row 2)
        for (int i = 0; i < 9; i++) {
            if (i==1 || i==6) {
                System.out.print("*");
            }System.out.print(" ");
        }System.out.println();
        //printing last row (same as first row)
        for (int i = 0; i < 9; i++) {
            if (i==3) {
                System.out.print("***");
            }System.out.print(" ");
        }System.out.println("\n");
        
        System.out.println("Arrow");
        //first row of the triangle(head of arrow)
        for (int i = 0; i < 5; i++) {
            if (i==3) {
                System.out.print("*");
            }System.out.print(" ");
        }System.out.println();
        //second row of triangle
        for (int i = 0; i < 5; i++) {
            if (i==2) {
                System.out.print("***");
            }System.out.print(" ");
        }System.out.println();
        //third row of triangle
        System.out.print(" ");
        for (int i = 0; i < 5; i++) {
            System.out.print("*");  
        }System.out.println();
        //the body of the arrow
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==3) {
                    System.out.print("*");
                }System.out.print(" ");
            }System.out.println();
        }System.out.println();
        
        System.out.println("Diamond");
        //the diamod is basically the same method as how to do the head for the arrow
        //as if we divide the diamond into half, it looks like there are 2 triangles
        
        //printing the upward of the triangle
        //first line
        for (int i = 0; i < 5; i++) {
            if (i==3) {
                System.out.print("*");
            }System.out.print(" ");
        }System.out.println();
        //second line
        for (int i = 0; i < 5; i++) {
            if (i==2 || i==3) {
                System.out.print("*");
            }System.out.print(" ");
        }System.out.println();
        //line 3
        for (int i = 0; i < 5; i++) {
            if (i==1 || i==4) {
                System.out.print("*");
            }System.out.print(" ");
        }System.out.println();
        //line 4
        for (int i = 0; i < 6; i++) {
            if (i==0 || i==5) {
                System.out.print("*");
            }System.out.print(" ");
        }System.out.println();
        //building the lower part of the iamond, upside-down triangle
        //exclude the forth line, continue display line3-1
        for (int i = 0; i < 5; i++) {
            if (i==1 || i==4) {
                System.out.print("*");
            }System.out.print(" ");
        }System.out.println();
        for (int i = 0; i < 5; i++) {
            if (i==2 || i==3) {
                System.out.print("*");
            }System.out.print(" ");
        }System.out.println();
        for (int i = 0; i < 5; i++) {
            if (i==3) {
                System.out.print("*");
            }System.out.print(" ");
        }System.out.println("\n");
        System.out.println("End");
    }
