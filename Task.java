import java.util.Objects;

public class Task {
    public static void main(String[] args) {
        String route = "NSEWWSENNE";
        System.out.println(isItAGoodRoute(route));
    }

    public static String isItAGoodRoute(String route){
        int x = 0;
        int y = 0;
        char[] result = route.toCharArray();
        for (int i = 0; i<result.length; i++){
            if (result[i] == 'N') x++;
            else if (result[i] == 'S') x--;
            else if (result[i] == 'E') y++;
            else if (result[i] == 'W') y--;
            else System.out.println("В построении маршрута ошибка");
        }
        if ((x == 0) && (y == 0))
        return "Это хороший маршрут";
        else return "Это плохой маршрут";
    }
}
