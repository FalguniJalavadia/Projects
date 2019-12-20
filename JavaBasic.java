public class JavaBasic {

    public static void main(String [] args) {
        String str = "This is very easy program";

        // Replace all s's
        String str1 = str.replaceAll("s", "");
        System.out.println(str1);


        // Find length of string
        System.out.println(str.length());


        // Remove spaces
        String str2 = str.replaceAll(" ", "");
        System.out.println(str2);

        // Remove special characters

        String str3 = "This $300 is equivalent of £200 but not for @100";
        String str4 = str3.replaceAll("[$£@]", "");
        System.out.println(str4);

        // Remove number from string
        String str5 = "The cost of iphone is £1,250";
        String str6 = str5.replaceAll("[1250]", "");
        System.out.println(str6);

        // Convert int to double
        Integer int1 = 450;
        Double db2 = Double.valueOf(int1);
        System.out.println(db2);

        // Convert string to int
        String str7 = "125";
        Integer int2 = Integer.parseInt(str7);
        System.out.println(int2);

        // Convert double to string
        Double db3 = 123.45;
        String str8 = Double.toString(db3);
        System.out.println(str8);

        // Convert string to double
        String str9 = "560.25";
        Double db4 = Double.parseDouble(str9);
        System.out.println(db4);

        // Find out answer 1/3 in decimal points
        Integer integer1 = 1;
        Integer integer2 = 3;

        Double db5 = Double.valueOf(integer1) / Double.valueOf(integer2);
        System.out.println(db5);

        //  Replace currency symbol from $ to £
        String str10 = "$250.00";
        String str11;
        str11 = str.replaceAll("$", "£");
        System.out.println(str11);

        // find middle of string character

        String str123 = "There";
        String str12 = "England";
        Integer middle = str123.length() / 2;
        Integer middle1 = str12.length() / 2;
        Integer middle2 = middle1 + 1;
        Character ch1 = str123.charAt(middle);
        Character ch2 = str12.charAt(middle1);
        System.out.println(ch1);
        System.out.println(ch2);


    }



}
