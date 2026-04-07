package OOP;

public class Private_Specifier {
   static class Engineers{
        private String emp_name;
        public void setName(String name){
            //using setters to set the name
            this.emp_name= name;
            //accessible within class
        }
        public String getName(){
            return emp_name;
        }

        public static void main(String[] args) {
            Engineers en= new Engineers();
            en.setName("Ragini Roy");
            //accessing getName method
            System.out.println(en.getName());

        }

    }
}
