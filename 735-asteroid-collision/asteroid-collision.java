class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack =new Stack<>();

        for(int i=0 ;i< asteroids.length;i++){
            boolean alive = true;
            while(alive  && asteroids[i] <0 && !stack.isEmpty()  && stack.peek()>0  ){
                int top =stack.peek();
                if(Math.abs(top) <  Math.abs(asteroids[i])){
                    stack.pop();
                }
                else if(Math.abs(top)  == Math.abs(asteroids[i])){
                    stack.pop();
                    alive = false;
                }else if(Math.abs(top) > Math.abs(asteroids[i])){
                    alive = false;
                }
            }
            if(alive){
                stack.push(asteroids[i]);
            }
        }
        int arr[] = new int[stack.size()];
        for(int i = stack.size()-1 ; i >= 0;i--){
            arr[i] = stack.pop();
        }
        return arr;
    }
}