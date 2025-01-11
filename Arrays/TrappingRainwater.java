// corner cases for no water is trapped:
// min no of bars are 2 
// bars are in ascending or descending

// logic trappingWater = (waterLevel - Selfbarlevel)*width

// waterlevel = min(maxleftBarHeight, maxRightbarLevel) so we need 2 arrays MaxLeft and Maxright

////// use Auxiliary Array  or helper height

// height of array arr=          [4 2 0 6 3 2 5  ]
// left max bar level by array = checks max(self height and leftmostbarHeight) [4 4 4 6 6 6 6  ]
// right max bar level by array= checks max(self height and rightmostbarHeight) [6 6 6 6 5 5 5  ]

// waterlevel = min(maxleftBarHeight, maxRightbarLevel) so we need 2 arrays MaxLeft and Maxright

// trapped water     be [ 4-4 4-2 4-0 6-6 6-3 6-2 6-5 ]
// logic trappingWater = (waterLevel - Selfbarlevel)*width


public class TrappingRainwater {
    public static void trappingRainwater(int height[]){
        int n = height.length;
// System.out.println();
        // [4 4 4 6 6 6 6  ]
        int MaxLeft[] = new int[height.length];
        MaxLeft[0] = height[0];
        for (int i = 1; i < n; i++) {
            MaxLeft[i]=Math.max(height[i], MaxLeft[i-1]);
        }

        // [6 6 6 6 5 5 5  ]
        int MaxRight[] = new int[height.length];
        MaxRight[n-1] = height[n-1];
        for (int i = n-2; i >=0; i--) {
            MaxRight[i]=Math.max(height[i], MaxRight[i+1]);
        }

        
        
        int trappedwater = 0 ;
        for (int i = 0; i < n; i++) {
            int waterlevel =Math.min(MaxLeft[i], MaxRight[i]); 
            trappedwater += waterlevel - height[i];
        }

        // for (int i = 0; i < n; i++) {
        // }
        System.out.println("The amount of water is trapped in given blocks is = "+trappedwater);

    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        trappingRainwater(height);
    }
}
