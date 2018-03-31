public class App {


    public static void main(String[] args) {
//        searchCategory();
//        System.out.println(search());
        System.out.println(allDollars("ahmed")); //a$h$m$e$d
    }


    private static String allDollars(String str) {
        if(str.length()<=1) {
            return str;
        }
       return str.charAt(0) + "$" + allDollars(str.substring(1));
    }

    private static int search() {
        int target = 5;
        int[] nums = {1, 4, 5, 6, 8};

        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == target) {
                result = i;
                break;
            }
        }
        return result;
    }

    private static void searchCategory() {
        final String str = "hello ahmed i want to tell you category:apple and this is very important" +
                "category:banana if you still believe me my man. But category:strawberry is very expensive.";

        int a = 0;
        while (str.indexOf("category", a) > 0) {
            int indx = str.indexOf("category", a);
            System.out.println(str.substring(indx + 9, str.indexOf(" ", indx)));
            a = a + indx + 1;
        }
    }
}
