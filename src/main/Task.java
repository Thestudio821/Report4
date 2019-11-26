//https://github.com/Thestudio821/Report4.git
public class Task {
    public static void main(String[] args){
        /**
        String str = null;
        try {
            System.out.print(str.length());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            System.out.println("想定外のことが発生しました。ご確認ください");
        }
    }
         }
*/
        String str = "百十三";
        int value;

        try {
            value = Integer.parseInt(str);
            System.out.println(value);
        }catch (Exception e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            System.out.println("想定外のことが発生しました。");
        }
    }
}