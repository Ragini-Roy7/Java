package Arrays;

public class Linear_Search {
    public void linear_search() {
      int num[] = {23,44,65,8,56,75,35};
      int key=44;
      boolean isFound=false;
      for(int i=0;i<num.length;i++) {
          if(key==num[i]) {
              System.out.println(num[i] +"is found at "+i);
              isFound=true;
              break;
          }
          if(!isFound) {
              System.out.println("Not found");
          }
      }
    }

    public static void main(String[] args) {
        Linear_Search obj= new Linear_Search();
        obj.linear_search();
    }


}
