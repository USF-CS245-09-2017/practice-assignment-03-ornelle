

public class BinaryRecursiveSearch implements Practice03Search
{
    public String searchName(){
        return "Binary Recursive Search";
    }

    //first search accomplishes the interface method call then calls method best fitting for it which is returned
    public int search (int [] arr, int target) {
        return Search(arr, target, 0, arr.length-1);
    }
    public int Search (int [] arr, int target, int start, int end){

        //explains
        int mid= (start+end)/2;

        if (start> end) //BASE CASE if start passes end then search is over
            return -1;
        if(arr[mid]<target)
            return Search(arr, target, mid+1, end);
        else if (arr[mid]==target) {
            return mid;
        }
        else if (arr[mid]> target){
            return Search (arr, target, start, mid-1);
        }
        //should i do this?
        return -1;
    }
}