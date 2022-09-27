class Main {
  public static void main(String[] args) {
    //Main class

    // Step 2: 
    Email em1 = new Email("John","Smith");

    //Step 10:

    em1.setAlternativeEmail("js@gmail.com");
    System.out.println(em1.getAlternativeEmail());
    
    System.out.println(em1.showInfo());
  
  }
}