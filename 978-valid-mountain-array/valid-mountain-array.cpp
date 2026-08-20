class Solution {
public:
    bool validMountainArray(vector<int>& arr) {
        int n=arr.size();
        if(n<3){
            return false;
        }
        int i=0;
      int value=-1;
        for(i=i+1;i<n-1;i++){
            if((arr[i-1]==arr[i]) || (arr[i]<arr[i-1] && arr[i]<=arr[i+1] )){
                return false;
            }
            if(arr[i]>arr[i-1] && arr[i]>=arr[i+1]){
                value=arr[i];
                break;
            }
        }
        cout<<value<<endl;
        for(i=i+1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                return false;
            }
        }
        return (value==-1)?false:true;
       //return true;

    }
};