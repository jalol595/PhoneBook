public class Main {

    public static void main(String[] args) {

       PhoneBook phoneBook = new PhoneBook("Brinchi Kitob");

      // System.out.println(phoneBook.getName());


       phoneBook.add("jalol", "karshiboyev", "945779595");
       phoneBook.add("xsss", "karfdsacv", "945779595");
       phoneBook.add("azzz", "karshsdfsdv", "945779595");
       phoneBook.add("tttt", "karshrsdf", "945779595");

       //phoneBook.show();
        // System.out.println(phoneBook.first());
//       System.out.println(phoneBook.get(1));
      // System.out.println(phoneBook.toString());
       System.out.println(phoneBook.find("zz"));




    }


}
