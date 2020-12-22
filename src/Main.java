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
    }


    static void printArray (int b[]){
        for (int i=0; i<b.length; i++){
            System.out.print(b[i] + ", ");
        }
        System.out.println("");
    }
}
