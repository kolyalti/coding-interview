public class PageOne {

    public void problemOne(int[] arr, int input){
        int above = 0;
        int below = 0;
        for(int i = 0; i < arr.length; i++){
            //When array element is above the input
            if(arr[i] > input){
                above++;
            }
            //When array element is below the input
            if(arr[i] < input){
                below++;
            }
        }
        //Print out
        System.out.println("Above: " + above + " Below: " + below);
    }

    public void problemTwo(String myString, int rotateBy){
        StringBuilder rotateSt = new StringBuilder();
        //Starting at the end of the string
        int startingAtTheEnd = myString.length()-1;
        //Counting down from the end
        int whereWeStop = startingAtTheEnd - rotateBy;
        //So we don't get out of bound in case rotateBy input passed is more then the myString
        if(myString.length() >= rotateBy){
            //Main loop
            for(int i = startingAtTheEnd; i > whereWeStop; i--){
                //Inserting the rotate amount
                rotateSt.insert(0, myString.charAt(i));
                //Needed to adjust the cutoff below
                startingAtTheEnd--;
            }
            String stringCutOff = myString.substring(0, startingAtTheEnd+1);
            System.out.println(rotateSt+stringCutOff);
        }else{
            System.out.println("Input passed is more then the String passed");
        }
    }
    
    //This is am improved version
    public void problemTwoBetter(String myString, int rotateBy){
        if(myString.length() >= rotateBy){
            int whereWeStop = myString.length() - rotateBy;
            String rotate = myString.substring(whereWeStop);
            String stringCutOff = myString.substring(0, whereWeStop);
            System.out.println(rotate+stringCutOff);
        }
    }
}
