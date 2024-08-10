package Lec02LogicalThinking;

class Patterns {
        public static void main(String[] args) {
            // nForest1(5);
            nForest2(5);
            // nTriangle1(10);
            // nTriangle2(5);
            // seeding(5);
            // nNumberTriangle(5);
            // starPyramid(10);
            // starPyramid2(4);
            // starPyramid3(5);
            // nStarTriangle(5);
            // numberCrown(5);
            // nBinaryTriangle(7);
            // nNumberTriangle2(4);
        }
        //?01 https://www.naukri.com/code360/problems/n-forest_6570177?leftPanelTabValue=SUBMISSION
        public static void nForest1(int n) {
            // Write your code here
            for(int i = 0;i<n ;i++){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        } 
        //?02 https://www.naukri.com/code360/problems/n-2-forest_6570178?leftPanelTabValue=SUBMISSION
        public static void nForest2(int n) {
            // Write your code here
            for(int i = 0;i<n;i++){
                for(int j =0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        //?03 https://www.naukri.com/code360/problems/n-triangles_6573689?leftPanelTabValue=SUBMISSION
        public static void nTriangle1(int n) {
            // Write your code here
            for(int i = 0;i<n;i++){
                    for(int j =0;j<=i;j++){
                        System.out.print(j+1);
                    }
                    System.out.println(" ");
                }
        }
        //?04 https://www.naukri.com/code360/problems/triangle_6573690
        public static void nTriangle2(int n) {
            // Write your code here
            for(int i = 0;i<n;i++){
                    for(int j =0;j<=i;j++){
                        System.out.print(i+1);
                    }
                    System.out.println(" ");
                }
        }
        //?05 https://www.naukri.com/code360/problems/seeding_6581892
        public static void seeding(int n) {
            // Write your code here
            for(int i = 0;i<n;i++){
                    for(int j=0;j<=n-1-i;j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
        }
        //?06 https://www.naukri.com/code360/problems/reverse-number-triangle_6581889?leftPanelTabValue=SUBMISSION
        public static void nNumberTriangle(int n) {
            // Write your code here
            for(int i=0;i<n;i++){
                for(int j = 0 ; j<=n-i-1;j++){
                    System.out.print(j+1);
                }
                System.out.println(" ");
            }
            
        }
        //?07 https://www.naukri.com/code360/problems/star-triangle_6573671

        public static void starPyramid(int n){
            for(int  i = 0 ; i<n;i++){
                    //Spaces:
                    for(int j = 0 ; j<n-1-i;j++){
                        System.out.print(" ");
                    }
                    //Stars:
                    for(int j = 0 ; j<2*i+1;j++){
                        System.out.print("*");
                    }
                    //Spaces:
                    for(int j = 0 ; j<n-1-i;j++){
                        System.out.print(" ");
                    }
                System.out.println(" ");
            }
        }
        //?08 https://www.naukri.com/code360/problems/reverse-star-triangle_6573685
        public static void starPyramid2(int n){
            for(int  i = 0 ; i<n;i++){
                    //Spaces:
                    for(int j = 0 ; j<i;j++){
                        System.out.print(" ");
                    }
                    //Stars:
                    for(int j = 0 ; j<2*n-(1+2*i);j++){
                        System.out.print("*");
                    }
                    //Spaces:
                    // for(int j = 0 ; j<i;j++){
                    //     System.out.print(" ");
                    // }
                System.out.println();
            }
        }
        //?09 https://www.naukri.com/code360/problems/star-diamond_6573686
        public static void starPyramid3(int n){
            starPyramid(n);
            starPyramid2(n);
        }
        //?10 https://www.naukri.com/code360/problems/rotated-triangle_6573688
        public static void nStarTriangle(int n) {
            // Write your code here
            nForest2(n);
            seeding(n-1);
        } 
        //?11 https://www.naukri.com/code360/problems/binary-number-triangle_6581890
        public static void nBinaryTriangle(int n) {
            for( int i = 1 ; i <=n;i++){
                for(int j = 1 ; j <=i ; j++){
                    if((i+j)%2 == 0){
                        System.out.print(1+ " ");
                    }
                    else{
                        System.out.print(0+ " ");
                    }
                }
                System.out.println("");
            }
        }
        //?12 https://www.naukri.com/code360/problems/number-crown_6581894
        public static void numberCrown(int n){
            int spaces = 2*(n-1);
            for(int i = 1;i<=n;i++){

                for(int j=1;j<=i;j++){
                    System.out.print(j + " ");
                }
                for(int j = 1;j<=spaces;j++){
                    System.out.print("  ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j + " ");
                }
                System.out.println();
                spaces-=2;
            }
        }
        //?13 https://www.naukri.com/code360/problems/increasing-number-triangle_6581893
        public static void nNumberTriangle2(int n) {
            int counter = 1;
            for(int i = 1 ; i <=n ; i++){
                for ( int j = 1 ; j <=i ; j++){
                    System.out.print(counter + " ");
                    counter++;
                }
                System.out.println("");
            }
        }
        //? 14

        
        
        
}

    
