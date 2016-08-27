private  int firstrepeating(int[] a) {
		int count=0;
		int i=0;
		for( i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count>1)
				break;
			count=0;
		}
		return a[i];
	}
