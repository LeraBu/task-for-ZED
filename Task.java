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
            if (c == 'N') x++;
            else if (c == 'S') x--;
            else if (c == 'E') y++;
            else if (c == 'W') y--;
            else System.out.println("В построении маршрута ошибка");
        }
        if ((x == 0) && (y == 0))
        return "Это хороший маршрут";
        else return "Это плохой маршрут";
    }
}
