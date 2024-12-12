class starter {
    public static void main(String args[]) {
        int [] arr = new int[20];
        int i = 0;
        while(i < arr.length){
			arr[i] = (int)(Math.random()*10)+1;
			i++;
		}
		
		int x =(int)(Math.random()*10)+1; 
		while(i<arr.length){
		    if(arr[i] == x){
		        System.out.print(i);
		    }
		}
		
        
        int a = 0;
		for(int b = 0; b < arr.length-1; b++){
			a = b+1;
			if(arr[b] == arr[a]){
				System.out.println("Dupe at " + b + " and " + a);
			}
		}
    }
}