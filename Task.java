public class Task {
    public static void main(String[] args) {
        String route = "NSEWNSWENS";
        System.out.println(isItAGoodRoute(route));
    }

    public static String isItAGoodRoute(String route){
        int x = 0;
        int y = 0;
        char[] result = route.toCharArray();
        for (char c : result) {
            if (c == 'N') y++;
            else if (c == 'S') y--;
            else if (c == 'E') x++;
            else if (c == 'W') x--;
            else System.out.println("Error in building route");
        }
        if ((x == 0) && (y == 0))
        return "This is a good route";
        else return "This is a bad route";
    }
}
