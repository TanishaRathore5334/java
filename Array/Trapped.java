import java.util.*;
public class Trapped{
    public static int trappedRainWater(int height[]){
        //calculate left max baoundary... -arrays
        int n = height.length;
        int leftMax[]=new int [n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
            }
            //calculate right max boundary... -arrays
            int rightMax[]=new int [n];
            rightMax[n-1]=height[n-1];
            for(int i=n-2;i>=0;i--){
                rightMax[i]=Math.max(rightMax[i+1],height[i]);
            }
            //calculate trapped water... -arrays
            int trappedWater = 0;
            for(int i=0;i<n;i++){
                int waterLevel = Math.min(leftMax[i],rightMax[i]);
                trappedWater += waterLevel - height[i];
                }
                return trappedWater;
            }

            public static void main(String[] args) {
                int height[] = {0,1,0,2,1,0,1};
                System.out.println(trappedRainWater(height));
            }
        }