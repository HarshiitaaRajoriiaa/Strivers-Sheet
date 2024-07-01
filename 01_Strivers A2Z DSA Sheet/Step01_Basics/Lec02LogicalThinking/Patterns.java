package Lec02LogicalThinking;

class Patterns {
        public static void main(String[] args) {
            // nForest1(5);
            // nForest2(5);
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
            // nLetterTriangle(5);
            // nLetterTriangle2(4);
            // nLetterTriangle3(5);
            // alphaHill(4);
            alphaTriangle(4);
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
        //08
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
        //09
        public static void starPyramid3(int n){
            starPyramid(n);
            starPyramid2(n);
        }
        //10
        public static void nStarTriangle(int n) {
            // Write your code here
            nForest2(n);
            seeding(n-1);
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
        //12
        public static void numberCrown(int n){
            int spaces = 2*4;
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
        //14
        public static void nLetterTriangle(int n) {
            for(int i = 0;i<n;i++){
                for(char j = 'A' ; j<='A'+i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        //15
        public static void nLetterTriangle2(int n) {
            for( int  i = 1 ; i <=n ; i ++){
                for(char j = 'A' ; j <'A' +  (n- i+1) ; j++){
                    System.out.print( j + " ");
                }
                System.out.println("");
            }
        }
        //16
        public static void nLetterTriangle3(int n) {
            for( int  i = 1 ; i <=n ; i ++){
                for(char j = 1 ; j <=i ; j++){
                    System.out.print((char)('A' + i -1) + " ");
                }
                System.out.println("");
            }
            
        }
        //17
        public static void alphaHill(int n) {
            // Write your code here
            //spaces:
            for(int i = 0 ; i <n;i++){
                for(int j = 0 ; j<n-1-i;j++){
                    System.out.print(" ");
                }
                char o = 'A';
                int change = (2*i+1)/2;
                for(int j = 0;j < 2*i+1;j++){
                    System.out.print(o);
                    if(j<change){
                        o++;
                    }
                    else{
                        o--;
                    }

                }
                System.out.println();
            }
        }
        //18
        public static void alphaTriangle(int n) {
           for(int i=0;i<n; i++){
            for(char a = (char)(int)('A'+n-i-1); a <=(char)(int)('A'+n-1) ;a++){
                System.out.print(a+" ");
            }
            System.out.println();
            
           } 
        }
        //19
        //20
        //21
        //22
        
}

    
