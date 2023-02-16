package taskMikhail.taskLesson3;

public class STR {
    public static void main(String[] args) {
        String s = "ASD";
        // String s1 = new String("ASD");
        // System.out.println(s == s1);
        // String s1 = s + 1 + "[";
        // System.out.println(s1);

        // если надо все время менять строку - лучше использовать Стрингбилдер!
        StringBuilder sb = new StringBuilder("1");
        sb.append("A").append("2").append("X");

        // TODO узнать работу StringBuffer
        StringBuffer sb1 = new StringBuffer();

        System.out.println(sb);

        String i = "11";
        String i1 = "11";
        System.out.println(i == i1);

    }
}
