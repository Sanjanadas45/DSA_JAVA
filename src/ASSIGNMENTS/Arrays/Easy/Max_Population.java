//Maximum Population Year
package ASSIGNMENTS.Arrays.Easy;

public class Max_Population {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{2000,2010}};
        System.out.println(maxPopulation(logs));
    }
    public static int maxPopulation(int[][] logs){
        int[] years = new int[2051];
        for(int[] log : logs){ //create an array for each year in a range
            years[log[0]] ++; //incrementing birth year
            years[log[1]] --; //decrementing death year
        }
        int maxPop = 0, population = 0, maxYear = 0;
        for(int year = 1950; year < years.length; year++){
            population += years[year];
            if(population > maxPop){
                maxPop = population;
                maxYear = year;
            }
        }
        return maxYear;
    }
}
