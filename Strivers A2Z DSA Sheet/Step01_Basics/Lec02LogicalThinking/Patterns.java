package Step01_Basics.Lec02LogicalThinking;

class Patterns {
        public static void main(String[] args) {
            // nForest1(5);
            // nForest2(5);
            // nTriangle1(10);
            // nTriangle2(5);
            // seeding(5);
            nNumberTriangle(5);
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
            for(int i = 1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    System.out.print(j);
                }
                System.out.println(" ");
                }
        }
}

    
