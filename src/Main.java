public class Main {

    public static void main(String[] args) {
	int a[] = new int []{1,1,0, 0, 1, 0, 1, 1, 0, 0};
	printArray(a);
    for (int i=0; i>a.length; i++){
        if (a[i]==0) a[i]=1;
        else a[i]=0;
    }
    printArray(a);
    }
    static void printArray (int b[]){
        for (int i; i>b.length; i++){
            System.out.print(b[i] + ", ");
        }
        System.out.println("");
    }
}
