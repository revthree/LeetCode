public class Merges {
    public static void main(String[] args){
        int[] n1={1,2,3,4,5};
        int[] n2={6,7,8,9,10};
        int[] n3=new int[n1.length+n2.length];
        int i=0,j=0,k=0;
        
        while(i<n1.length && j<n2.length){
            if(n1[i]<n2[j]){
                n3[k]=n1[i];
                i++;
            }
            else{
                n3[k]=n2[j];
                j++;
            }
            k++;
        }
        while(i<n1.length){
            n3[k]=n1[i];
            i++;
            k++;
        }
        while(j<n2.length){
            n3[k]=n2[j];
            j++;
            k++;
        }
        for(int x=0;x<n3.length;x++){
            System.out.print(n3[x]+" ");
        }


        
    }
    
}

