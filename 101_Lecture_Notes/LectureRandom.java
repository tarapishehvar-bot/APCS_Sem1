/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
        System.out.println(Math.random()*5);
        System.out.println(Math.random()*20+15);
        System.out.println(Math.random()*(2523-1472)+1472);
        System.out.println((int)(Math.random()*(513+342)-342));
        int x = (int)(Math.random()*45+35);
        int y= (int)(Math.random()*80+80);
        System.out.println((int)(Math.random()*(y-x)+x));
        
	}
}
