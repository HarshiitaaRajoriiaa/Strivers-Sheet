package Lec02LogicalThinking;

class Patterns {
        public static void main(String[] args) {
            // nForest1(5);
            // nForest2(5);
            // nTriangle1(10);
            // nTriangle2(5);
            // seeding(5);
            nNumberTriangle(5);
            // nBinaryTriangle(7);
            // nNumberTriangle2(8);
            // nLetterTriangle(5);
            // nLetterTriangle1(4);
        }
        //01
        public static void nForest1(int n) {
            // Write your code here
            for(int i = 0;i<n ;i++){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        } 
        //02
        public static void nForest2(int n) {
            // Write your code here
            for(int i = 0;i<n;i++){
                for(int j =0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        //03
        public static void nTriangle1(int n) {
            // Write your code here
            for(int i = 0;i<n;i++){
                    for(int j =0;j<=i;j++){
                        System.out.print(j+1);
                    }
                    System.out.println(" ");
                }
        }
        //04
        public static void nTriangle2(int n) {
            // Write your code here
            for(int i = 0;i<n;i++){
                    for(int j =0;j<=i;j++){
                        System.out.print(i+1);
                    }
                    System.out.println(" ");
                }
        }
        //05
        public static void seeding(int n) {
            // Write your code here
            for(int i = 0;i<n;i++){
                    for(int j=0;j<=n-1-i;j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
        }
        //06
        public static void nNumberTriangle(int n) {
            // Write your code here
            for(int i=0;i<n;i++){
                for(int j = 0 ; j<=n-i-1;j++){
                    System.out.print(j+1);
                }
                System.out.println(" ");
            }
            
        }
        //07
        for(int  i = 0 ; i<n;i++){
            for(int j = 0 ; j<2*n ; j++){
                
            }
        }

        //11
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
        //13
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
        
}

    
