package CodeForces;

import java.util.Scanner;

public class Army {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_totalNumberOfRank=sc.nextInt();
        int []arrayOfYearsToImproveFromOneRankToNextOne= new int[n_totalNumberOfRank-1];
        for (int i =0;i<n_totalNumberOfRank-1;i++){
            arrayOfYearsToImproveFromOneRankToNextOne[i]=sc.nextInt();
        }
        int currentPosition=sc.nextInt(),wantedPosition =sc.nextInt();
        int sum=0;
        for (int i = currentPosition-1;i<wantedPosition-1;i++){
            sum=sum+arrayOfYearsToImproveFromOneRankToNextOne[i];
        }
        System.out.println(sum);

    }
}
