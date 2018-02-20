package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int maxPrime=300;
        int[] primes= new int[maxPrime/2];
        int i=1;
        boolean notPrime=false;
        for(int p=2; p<=maxPrime; p++)
        {
            notPrime=false;
            for(int j=2; j<p; j++)
            {
                if(p%j==0) notPrime=true;
            }
            if(!notPrime)
            {
                primes[i]=p;
                //System.out.println(primes[i]);
                i++;
            }
        }
        int[] evenAlmost = new int[i];
        for(int k=0; k<=i-2; k++)
        {
            evenAlmost[k]=2*primes[k+1];
            //System.out.println(evenAlmost[k]);
        }
        int[] threeAlmost = new int[i];
        for(int l=0; l<=i-3; l++)
        {
            threeAlmost[l]=3*primes[l+2];
            //System.out.println(threeAlmost[l]);
        }
        int[][] twins = new int[2][i];
        int ii=0;
        for(int k=0; k<=i-2; k++)
        {
            for(int l=0; l<=i-3; l++)
            {
                if(evenAlmost[k]-1==threeAlmost[l])
                {
                    twins[0][ii]=evenAlmost[k];
                    twins[1][ii]=threeAlmost[l];
                    System.out.print(twins[1][ii] + " " + twins[0][ii]);
                    System.out.println();
                }
                if(evenAlmost[k]+1==threeAlmost[l])
                {
                    twins[0][ii]=evenAlmost[k];
                    twins[1][ii]=threeAlmost[l];
                    System.out.print(twins[0][ii] + " " + twins[1][ii]);
                    System.out.println();
                }
            }
        }
    }
}
