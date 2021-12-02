import javax.xml.namespace.QName;

public class PhoneBook {

    private String name;

    private int currenIndex = 0;

    private int maxIndex = 5;
    private Contact[] arrayali = new Contact[5];


    public PhoneBook(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void add(String name, String lastName, String number) {

        Contact contact = new Contact(name, lastName, number);

        if (this.currenIndex == this.maxIndex) {
            this.maxIndex += 5;

            Contact[] newarrayali = new Contact[this.maxIndex];

            for (int i = 0; i < this.currenIndex; i++) {
                newarrayali[i] = this.arrayali[i];
            }

            this.arrayali = newarrayali;
        }


        this.arrayali[currenIndex] = contact;
        this.currenIndex++;
    }

    public void show() {
        for (int i = 0; i < this.currenIndex; i++) {
            Contact contact = this.arrayali[i];
            System.out.println(contact.getName());
        }
    }

    public String first() {
        if (this.currenIndex > 0) {
            Contact contact = this.arrayali[0];
            return contact.toString();
        }
       return "111";

    }


    public String get(int i){
        if (i > 0){
            return this.arrayali[i -1].toString();

        }
        return "222";
    }

    public String toString(){
        String text = "(  ";
        for (int i = 0; i < this.currenIndex; i++){
            Contact contact = this.arrayali[i];
            text += contact.toString();
        }
        return text+ " )";
    }


    public String find(String text){
        for (int i = 0; i <this.currenIndex; i++){
            Contact contact = this.arrayali[i];

            if (contact.getName().contains(text) || contact.getLastName().contains(text) || contact.getNumber().contains(text) ){
                return contact.toString();
            }
        }

        return "555";
    }

}
