/**
 * Created by chuck on 2/3/14.
 */
public class DotCom {
    public static void main(String [] args){
        int numOfGuesses = 0;
        String userGuess = null;

        GameHelper helper = new GameHelper();

        SimpleDotCom dot = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);
        int [] locations = {randomNum, randomNum+1, randomNum+2};
        System.out.println(randomNum);
        dot.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive = true){
            userGuess = helper.getUserInput("Enter a number");
            String result = dot.checkYourself(userGuess);
            numOfGuesses++;
            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You took" + numOfGuesses + "guesses");
            }
        }
    }
}
