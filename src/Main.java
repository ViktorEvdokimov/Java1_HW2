public class Main {

    public static void main(String[] args) {
    System.out.println("----Task 1----");
	int a[] = new int []{1,1,0, 0, 1, 0, 1, 1, 0, 0};
	printArray(a);
    for (int i=0; i<a.length; i++){
        if (a[i]==0) a[i]=1;
        else a[i]=0;
    }
    printArray(a);
    System.out.println("----Task 2----");
    int b[] = new int[8];
    for (int i=0; i<b.length; i++){
        b[i] = i * 3;
    }
    printArray(b);
    System.out.println("----Task 3----");
    int c[] = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    printArray(c);
    for(int i=0; i<c.length; i++){
        if (c[i]<6) c[i]=c[i]*2;
    }
    printArray(c);
    System.out.println("----Task 4----");
    int d[][] = new int[7][7];
    for(int i=0; i<d.length; i++){
        for (int j=0; j<d[0].length; j++){
            if (i==j || i+j==(d.length-1)) d[i][j]=1;
            else d[i][j]=0;
            System.out.print(d[i][j]+ ", ");
        }
        System.out.println("");
    }
    System.out.println("----Task 5----");
    int e[] = new int[20];
        fillingArray(e, 100);
    int max = -2147483648;
    int min = 2147483647;
    for (int i=0; i<e.length; i++){
        if (e[i]>max) max=e[i];
        if (e[i]<min) min=e[i];
    }
    printArray(e);
    System.out.println("Max =" + max + ", Min = " + min);
    System.out.println("----Task 6----");
    int f[] = new int[100];
    fillingArray(f, 9);
    printArray(f);
    boolean check = checkSum(f);
    System.out.println(check);
    System.out.println("----Task 7----");
    int g[] = new int[7];
    fillingArray(g, 9);
    printArray(g);
    g = trancpArray(g, 9);
    printArray(g);
    }


    static void printArray (int a[]){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + ", ");
        }
        System.out.println("");
    }
    static int[] fillingArray (int a[], int maxNum){
        for (int i=0; i<a.length; i++){
            a[i]= (int) (Math.random()*maxNum);
        }
        return a;
    }
    static boolean checkSum (int a[]){
        for(int i=0; i<a.length; i++){
            int sum1=0;
            int sum2=0;
            for(int j=0; j<=i; j++){
                sum1 = sum1+a[j];
            }
            for (int j = i+1; j<a.length; j++){
                sum2 = sum2+a[j];
            }
            if (sum1==sum2) return true;
        }
        return false;
    }
    static int[] trancpArray (int a[], int n) {
        int []b = new int[a.length];
        for(int i=0; i<a.length; i++){
            int j=i+n;
            while (j<0 || j>=a.length) {
                if (j >= a.length) j = j - a.length;
                if (j < 0) j = j + a.length;
            }
            b[i] = a[j];
        }
        return b;
    }
}
