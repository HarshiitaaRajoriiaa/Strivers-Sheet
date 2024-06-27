package Step01_Basics.Lec02LogicalThinking;

class Patterns {
        public static void main(String[] args) {
            // nForest1(5);
            // nForest2(5);
            // nTriangle1(10);
            // nTriangle2(5);
            // seeding(5);
            // nNumberTriangle(5);
            // nBinaryTriangle(7);
            // nNumberTriangle2(8);
            // nLetterTriangle(5);
            nLetterTriangle1(4);
        }
        
        public static void nForest1(int n) {
            // Write your code here
            for(int i = 1;i<=n ;i++){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println("*");
            }
        }
        public static void nForest2(int n) {
            // Write your code here
            for(int i = 1;i<=n;i++){
                for(int j =1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        public static void nTriangle1(int n) {
            // Write your code here
            for(int i = 1;i<=n;i++){
                    for(int j =1;j<=i;j++){
                        System.out.print(j);
                    }
                    System.out.println(" ");
                }
        }
        public static void nTriangle2(int n) {
            // Write your code here
            for(int i = 1;i<=n;i++){
                    for(int j =1;j<=i;j++){
                        System.out.print(i);
                    }
                    System.out.println(" ");
                }
        }
        public static void seeding(int n) {
            // Write your code here
            for(int i = 1;i<=n;i++){
                    for(int j=n;j>=i;j--){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
        }
        public static void nNumberTriangle(int n) {
            // Write your code here
            for(int i=1;i<=n;i++){
                for(int j = 1 ; j<=n-i+1;j++){
                    System.out.print(j);
                }
                System.out.println(" ");
            }
            
        }
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
        public static void nLetterTriangle(int n) {
            for( int  i = 1 ; i <=n ; i ++){
                for(char j = 'A' ; j <='A'+ i-1 ; j++){
                    System.out.print( j + " ");
                }
                System.out.println("");
            }
        }
        public static void nLetterTriangle1(int n) {
            for( int  i = 1 ; i <=n ; i ++){
                for(char j = 'A' ; j <='A'- i+1 ; j++){
                    System.out.print( j + " ");
                }
                System.out.println("");
            }
         }
}

    
