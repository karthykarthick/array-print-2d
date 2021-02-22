class Main {  
  public static void main(String args[]) { 
    // initialize the array
    int arr[][] =  {{1,2,3},{4,5,6},{7,8,9}};
    // loop through the array row
    for(int i = 0; i< arr.length; i++){
        for(int j = 0;  j< arr.length; j++){
            System.out.println(arr[i][j]);
        }
    }
    
  } 
}