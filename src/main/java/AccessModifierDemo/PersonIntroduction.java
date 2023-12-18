package AccessModifierDemo;

public class PersonIntroduction {

        private int id;
        public String name;
        protected int age;

        public PersonIntroduction(int id,String name,int age){
                this.id=id;
                this.name=name;
                this.age=age;
        }

        private void showId(){
                System.out.println("ID is " +id);
        }


        public void introduce(){
                showId();
                System.out.println("Hello, My name is "+name+" ");
        }


}
