private  int twice(int[] a) {
	int count=0;
	int b=0;
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length;j++){
			if(a[i]==a[j]){
				count++;
			}
		}
		
	
	if(count<2){
		b=a[i];
	}
	count=0;
	}
	return b;
}
